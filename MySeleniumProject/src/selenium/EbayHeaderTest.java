package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
		System.out.println(allLinks.size());
				
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}
		
		
		

	}

}
