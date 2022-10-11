package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // max driver
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Need to Create Web Element for Wait

		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //about page title
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle()); //google page title
		
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //about page title

	}

}
