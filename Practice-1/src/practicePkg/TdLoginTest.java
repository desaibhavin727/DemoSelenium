package practicePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://authentication.td.com/uap-ui/?consumer=easyweb&locale=en_CA#/uap/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("hvfgcgc");
		driver.findElement(By.id("uapPassword")).sendKeys("gcdxgchgcc");
		driver.findElement(By.xpath("//button[@class='btn btn-block td-button-secondary']")).click();
		
		
		String expectedErr = "This should be working, but something's gone wrong. Please try again soon. [500.GENERIC]";
		String actualErr = driver.findElement(By.id("error")).getText();
		System.out.println(actualErr);
		

		if(expectedErr.equals(actualErr)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
	}

}
