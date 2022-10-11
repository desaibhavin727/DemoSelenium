package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/Users/sai/Downloads/SeleniumJars//chromedriver");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.id("email")).sendKeys("hsvdhjvdjqbv"); 
		driver.findElement(By.id("pass")).sendKeys("ckdsnjkndj");  
		driver.findElement(By.name("login")).click();
		

	}

}
