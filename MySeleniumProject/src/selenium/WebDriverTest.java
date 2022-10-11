package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		//ClassName objective = new ClassName();
		//Firefoxdriver driver = new Firefox();
		
		
		//FirefoxDriver driver = new FirefoxDriver(); //open firefox browser
		
		//parentClassName(InterFaceName) objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hsvdhjvdjqbv"); 
		driver.findElement(By.id("pass")).sendKeys("ckdsnjkndj");  
		driver.findElement(By.name("login")).click();

	}

}
