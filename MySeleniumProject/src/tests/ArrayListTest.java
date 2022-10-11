package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ClassName objName = New ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Junit");
		tools.add("TestNG");
		tools.add("Agile");
		System.out.println(tools.size()); //4
		
		System.out.println(tools.get(0)); //selenium
		System.out.println(tools.get(1)); //junit
		System.out.println(tools.get(2)); //testing
		System.out.println(tools.get(3)); //agile
		
		tools.add("git");
		System.out.println(tools.size()); //5
		System.out.println(tools.get(4)); //git
		
		tools.remove(2);
		System.out.println(tools.get(2)); //agile
		System.out.println(tools.size()); //4
		
		System.out.println("---------------");
		
		for(int i =0; i<tools.size(); i++) {
			
			System.out.println(tools.get(i));
		}
		
		
	}

	
}
