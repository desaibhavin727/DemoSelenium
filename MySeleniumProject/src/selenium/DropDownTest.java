package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
				
		for(int i=0; i<allOptions.size(); i++) {
		System.out.println(allOptions.get(i).getText()+"------"+allOptions.get(i).isSelected());
		}
		
		//how to select from dropdown - we use inbuilt select class from selenium
		//pass the webelement as a parameter from where we want to select
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(2);//Select art
		Thread.sleep(3000);
		
		s.selectByValue("2984");//Select Baby
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");//Select Books
		System.out.println("--------after-----------");
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText()+"----"+allOptions.get(i).isSelected());
		}

	}

}
