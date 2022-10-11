package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		//ClassName objective = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //open firefox browser
		driver.get("https://www.facebook.com/"); //open facebook
		
		driver.findElement(By.id("email")).sendKeys("hsvdhjvdjqbv"); //type wrong email
		driver.findElement(By.id("pass")).sendKeys("ckdsnjkndj");  //type password
		driver.findElement(By.name("login")).click(); //click on login button 
	}

}
