package tests;

public class Test3 {

	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();
	
	
	public static void main(String[] args) {
	
		square();
		t3.circle();
		Test1.printMe();
		t1.testMe();
		
	}
	public static void square() {
		System.out.println("square");
	}
	
	public void circle() {
		System.out.println("circle");
	}
	
}
