package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@data-automation='shop']")).click();
	
	
		
		List<WebElement> Shoplist = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']//a")); 
		System.out.println(Shoplist.size());
		
		for(WebElement a : Shoplist){
		System.out.println(a.getText());
		}
	}

}
