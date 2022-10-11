package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String testing = "Automation";
		System.out.println("testing"); //without Quote Automation
		
		String tool = "Selenium";
		System.out.println(tool); //Selenium
		
		System.out.println(testing + tool); //no space Between
		System.out.println(testing+" "+tool); //add Space
		
		int a = 10;
		int b = 20;
		System.out.println(testing + tool + a + b); //start with string 
		System.out.println(a+b+testing+tool); //start with Num
		System.out.println(testing+tool+(a+b)); // string + (int) 
		
	}

}
