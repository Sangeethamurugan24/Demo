package Demoscript;

public class Test {
	static FunctionalLib fn=new FunctionalLib();

	public static void main(String[] args) {
		
		fn.launch();
		fn.OpenMRS_LoginPage();
		fn.OpenMRS_HomePage();
		fn.Resgistration_page();
		fn.registrationviewpage();
		fn.search_patient_record();
	}

}
