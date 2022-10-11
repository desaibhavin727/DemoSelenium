package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("/Volumes/personal data/NIKUL QA/Selenium_WorkSpace/XLS_Project65/src/prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String a = prop.getProperty("browser"); //method 1
		System.out.println(a);
		
		System.out.println(prop.getProperty("browser")); //method 2
		
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println("url");
		
		prop.setProperty("testingtype", "automation");
		System.out.println(prop.getProperty("testingtype"));
		
		prop.setProperty("testingtool", "selenium");
		System.out.println(prop.getProperty("testingtool"));
		
		FileOutputStream fo = new FileOutputStream("/Volumes/personal data/NIKUL QA/Selenium_WorkSpace/XLS_Project65/src/prop.properties");
		prop.store(fo, "Adding To properties file");
		
		
	}

}
