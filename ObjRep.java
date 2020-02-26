package Demoscript;

import org.openqa.selenium.By;

public class ObjRep {
	
	//Loginpage objects
	public By usernmaefield= By.id("username");
	public By passwordfield=By.id("password");
	public By locationlink=By.id("Pharmacy");
	public By Loginbtn=By.id("loginButton");
	
	//HomePage objectrs
	public By registerpatientlink=By.xpath("//*[@id=\'referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\']");

	//RegisterPatientPage objects
	
	public By GivenName=By.xpath("//div[3]/div[2]//section[1]/fieldset[1]/div[1]/p[1]/input");
	public By FamilyName=By.xpath("//div[3]/div[2]//section[1]/fieldset[1]/div[1]/p[3]/input");
	public By genderoption=By.xpath("//div[3]/div[2]//ul/li[1]/ul/li[2]/span");
	public By genderlist=By.id("gender-field");
	public By birthday=By.id("birthdateLabel");
	public By bdaydate=By.id("birthdateDay-field");
	public By bdaymonth=By.id("birthdateMonth-field");
	public By bdayyear=By.id("birthdateYear-field");
	public By addressoption=By.xpath("//div[3]/div[2]//ul/li[2]/ul/li[1]");
	public By adressfield=By.id("address1");
	public By phoneoption=By.xpath("//div[3]/div[2]//li[2]/ul/li[2]");
	public By phonefield=By.xpath("//div[3]/div[2]//section[2]/fieldset[2]/p/input");
	public By relativeoption=By.xpath("//div[3]/div[2]//li[3]/ul/li");
	public By relationdd=By.id("relationship_type");
	public By relativename=By.xpath("//div[3]/div[2]//section[3]//p[2]/input[1]");
	public By confirmoption=By.id("confirmation_label");
	public By submitbtn=By.xpath("//div[3]/div[2]/form/div/div[5]/p[1]/input");
	public By confirmation=By.xpath("//div[1]/div[3]/div[6]/div[2]/span");
	public By homebtn= By.xpath("//body/ul/li[1]/a[1]/i[1]");
	
	//Find Records objects
	
	public By findpatient=By.xpath("//div/div[3]/div/div/a[1]");
	public By enterpatient=By.xpath("//div[1]/div[3]//input");
	public By searchlistparent=By.xpath("//div/div[3]//table/tbody");
	public By searchfirstchild=By.xpath("//div[3]/div/div/table/thead/tr/th");
	public By searchsecondchild=By.xpath("//div[3]/div/div/table/tbody/tr[1]");
	
}
