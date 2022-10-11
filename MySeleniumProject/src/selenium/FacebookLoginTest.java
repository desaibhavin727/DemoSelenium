package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//1. class name(we have space so not work)
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("jcwndjkwne");
		
		//2. cssSelector, syntex for css selector
		//driver.findElement(By.cssSelector(null))
	
		//3. id Its Working
		driver.findElement(By.id("email")).sendKeys("hjsdbdjkbjsnd");
		
		//driver.findElement(By.name("login")).click();
	
		//4. link text only for link
		//driver.findElement(By.linkText(null))
	
		//5. name attribute - working
		//driver.findElement(By.name("email")).sendKeys("hjasvdjsavdj");
	
		//6. partial link only for link
		//driver.findElement(By.partialLinkText(null))
		
		//7. tag name- not work bcoz input is not unique
		//driver.findElement(By.tagName("input")).sendKeys("jsdbswbdkjas");
		
		//8. Xpath - Syntax for xpath
		//driver.findElement(By.xpath(""))
		
		//-------------password------------------
		driver.findElement(By.id("pass")).sendKeys("nsdcksbndk");
		
		//--------------LOGIN BUTTON---------------------
		driver.findElement(By.tagName("button")).click();
		
		
	}

}
