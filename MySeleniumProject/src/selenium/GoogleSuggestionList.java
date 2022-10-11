package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("canada");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allOptions.size());
		
		//for(int i=0; i<allOptions.size();i++) {
		//	System.out.println(allOptions.get(i).getText());
		//}
		
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}

	}

}
