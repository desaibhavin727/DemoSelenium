package Data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@data-automation='dept-btn-text']")).click();
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@data-automation='category-section-items-list']/li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}
	}

}
