package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		//WebElement firstLink = driver.findElement(By.tagName("a"));
		
		//WebElement footer = driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			}

	}

}
