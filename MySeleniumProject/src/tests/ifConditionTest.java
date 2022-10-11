package tests;

public class ifConditionTest {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 20;
		
		if(a==b) {
			System.out.println("a and b are equal");
			
		}else {
			System.out.println("a and b are not equal");	
			
		}
		
//---------------------------------------------------------		
		
		String expected = "selenium";
		String actual = "selenium";
		
		if(expected.equals(actual)) {
			
			System.out.println("equal");
		
		}else {
		
			System.out.println("not equal");
		}
		
	}

}
