package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.google.com");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
