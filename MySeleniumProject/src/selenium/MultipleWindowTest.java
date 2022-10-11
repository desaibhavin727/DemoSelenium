package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
 		driver.switchTo().window(childWindow); //Handle of Window
 		System.out.println(driver.getTitle()); //Help Page
 		driver.close(); //close Only window where we are on
 		
 		Thread.sleep(4000);
 		driver.switchTo().window(parentWindow);
 		System.out.println(driver.getTitle());
 		driver.quit(); // will close all window and kill the driver
	}

}
