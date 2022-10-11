package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("jsbksbdkjasbdjk");
		driver.findElement(By.xpath(" //span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);

		String Expect = "Couldn’t find your Google Account";
		String actual = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(actual);
		
		
			if(Expect.equals(actual)) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
				
	}

}
