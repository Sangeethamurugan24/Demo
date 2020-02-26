package Demoscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalLib {
	ObjRep obj=new ObjRep();
	
	WebDriver driver;

	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M Sangeetha\\Automation\\Demo\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(" https://demo.openmrs.org/openmrs/login.htm");
		 wait(20);
	}
	
	//Login Page
	
	public void OpenMRS_LoginPage()
	{
		WebElement userid=driver.findElement(obj.usernmaefield);
		userid.sendKeys("Admin");
		WebElement password=driver.findElement(obj.passwordfield);
		password.sendKeys("Admin123");
		WebElement locationselection=driver.findElement(obj.locationlink);
		locationselection.click();
		WebElement clickloginbtn=driver.findElement(obj.Loginbtn);
		clickloginbtn.click();
		String hompageurl=driver.getCurrentUrl();
		hompageurl.contains("home.page");
		System.out.println(hompageurl);
		wait(30);
	}
	
	//Home Page
	
	public void OpenMRS_HomePage()
	{
		WebElement reglink=driver.findElement(obj.registerpatientlink);
		reglink.click();
		wait(30);
		
	}
	
	//Registration page
	
	public void Resgistration_page()
	{
		WebElement given=driver.findElement(obj.GivenName);
		given.sendKeys("Rejina");
		
		WebElement family=driver.findElement(obj.FamilyName);
		family.sendKeys("Motwani");
		wait(20);
		
		WebElement genderclick=driver.findElement(obj.genderoption);
		genderclick.click();
		
		Select genderlists=new Select(driver.findElement(obj.genderlist));
		genderlists.selectByVisibleText("Female");
		
		WebElement birthdayoption=driver.findElement(obj.birthday);
		birthdayoption.click();
		
		WebElement birthdate=driver.findElement(obj.bdaydate);
		birthdate.sendKeys("10");
		
		Select birthmonth=new Select(driver.findElement(obj.bdaymonth));
		System.out.println(birthmonth.getOptions());
		birthmonth.selectByIndex(10);
		
		WebElement birthyear=driver.findElement(obj.bdayyear);
		birthyear.sendKeys("2010");
		
		WebElement Addressclick=driver.findElement(obj.addressoption);
		Addressclick.click();
		
		WebElement enteradd=driver.findElement(obj.adressfield);
		enteradd.sendKeys("vadavalli");
		
		WebElement phoneclick=driver.findElement(obj.phoneoption);
		phoneclick.click();
		
		WebElement enternumber=driver.findElement(obj.phonefield);
		enternumber.sendKeys("9842272396");
		
		WebElement relatives=driver.findElement(obj.relativeoption);
		relatives.click();
		
		Select relationtype=new Select(driver.findElement(obj.relationdd));
		relationtype.selectByVisibleText("Patient");
		
		WebElement relationname=driver.findElement(obj.relativename);
		relationname.sendKeys("Swetha");
	
		
		WebElement confirm=driver.findElement(obj.confirmoption);
		confirm.click();
		
		wait_Expected(30, obj.submitbtn);
		
		WebElement confirmbutton=driver.findElement(obj.submitbtn);
		confirmbutton.click();
		
		
		}
	
	//RegistrationViewPage
	
	public void registrationviewpage()
	{
		wait_Expected(60, obj.confirmation);
		WebElement confirmation_verification=driver.findElement(obj.confirmation);
		System.out.println(confirmation_verification.getText());
		wait(20);
		
		driver.get("https://demo.openmrs.org/openmrs/index.htm");
		
		//WebElement home_btn=driver.findElement(obj.homebtn);
		//home_btn.click();
		
		}
	
	
	//View patient Record
	
	public void search_patient_record()
	{
		WebElement findpatientrecord=driver.findElement(obj.findpatient);
		findpatientrecord.click();
		
		WebElement searchpatientrecord=driver.findElement(obj.enterpatient);
		searchpatientrecord.sendKeys("rejina");
		
		//WebElement findlistparent=driver.findElement(obj.searchlistparent);
		//List<WebElement> firstchild=driver.findElements(obj.searchfirstchild);
		//for(int i=0;i<firstchild.size();i++)
		//{
			//if(firstchild!=null)
			//{
				List<WebElement> findlistchild=driver.findElements(obj.searchsecondchild);
				System.out.println(findlistchild.size());
				for(int j=0;j<findlistchild.size();j++)
				{
					System.out.println(findlistchild.get(0).getText());
					//System.out.println(findlistchild.get(3).getText());
				}
			//}
		//}
	}
	
	//General Functions
	
	public WebDriverWait wait_Expected(int Timeout, By element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Timeout);
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		return wait;
				
			
	}
	
	public WebDriverWait wait(int Timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Timeout);
	
		return wait;
	}
	
	
}

	

