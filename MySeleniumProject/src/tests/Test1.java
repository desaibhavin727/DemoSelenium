package tests;

import selenium.Test4;

public class Test1 {

	//ClassName objName = new ClassName();
	   static Test1 t1 = new Test1();
	   static Test2 t2 = new Test2();
	   static Test3 t3 = new Test3();
	   static Test4 t4 = new Test4();
	
	public static void main(String[] args) {
		
		System.out.println("i am in main method");
		printMe();
		System.out.println("After Print me");
		scanMe();		
		t1.paintMe();
		t1.testMe();
		Test2.blue();
		t2.red();
		Test3.square();
		t3.circle();
		Test4.abc();
		t4.xyz();
		}
	
	//------------------------------------------------
	
		public static void scanMe() {
		
		System.out.println("Scanme");
		
		}
	//---------------------------------------------------
	
		public static void printMe() {
		
		System.out.println("Bhavin");
		}
	
	//--------------------------------------------------	
		public void paintMe() {
			System.out.println("Paintme");
		}
		
	//---------------------------------------------------
		public void testMe() {
		System.out.println("testme");
		}
}
