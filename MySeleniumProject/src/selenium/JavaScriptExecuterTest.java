package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/");

		
		WebElement careers = driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		option 1 - Using x and y Cordinate
//		System.out.println(careers.getLocation());
//		jse.executeScript("window.scrollBy(0, 5000)");
//		careers.click();

//		Option 2 - Scroll until the Element is in the view
//		jse.executeScript("arguments[0].scrollIntoView(true);", careers);
//		Thread.sleep(2000);
//		careers.click();
		
//		option 3 - direct click using JavascriptExecuter
		jse.executeScript("arguments[0].click();", careers);
		
		
	}

}
