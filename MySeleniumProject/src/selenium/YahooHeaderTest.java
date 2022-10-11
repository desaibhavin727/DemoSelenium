package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
	

	}

}
