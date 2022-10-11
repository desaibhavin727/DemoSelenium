package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisaugaTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mississauga.ca/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("(//ul[@class='main-nav-links']/li)[3]")).click();
		
		
		Thread.sleep(2000);
		
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li")); 
		System.out.println(all.size());
		
		for(WebElement a : all){
		System.out.println(a.getText());
		}
	
	}

}
