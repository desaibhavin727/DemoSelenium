package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hsvdhjvdjqbv"); 
		driver.findElement(By.cssSelector("#pass")).sendKeys("ckdsnjkndj");  
		driver.findElement(By.cssSelector("button[type='submit']")).click(); 
			
		
	}

}
