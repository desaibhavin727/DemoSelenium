package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='td-section-left']//nav/ul/li"));
		System.out.println(allLinks.size());
				
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}
		
	}

}
