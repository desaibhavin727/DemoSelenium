package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		Thread.sleep(3000); //Stop the Execution for 3 Seconds
		
		String expctedurl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		String expctedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
				
		if(expctedurl.equals(actualurl)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
	
		
		
		
		
		
	}

}