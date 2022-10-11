package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
     	Thread.sleep(3000);
		
	    Alert al = driver.switchTo().alert();
	    System.out.println(al.getText());
		
		al.accept(); //Click on Select Button
		//al.dismiss(); //click on non-slected button or close pop up
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("B3")).click();
		Thread.sleep(2000);
		Alert ab = driver.switchTo().alert();
		ab.sendKeys("Selenium");
		Thread.sleep(3000);
		ab.accept();
	}

}
