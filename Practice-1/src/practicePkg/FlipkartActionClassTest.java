package practicePkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartActionClassTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
//		List<WebElement> popup1 = driver.findElements(By.linkText("✕"));
//		System.out.println(popup1.size());
//		
//		if(popup1.size()>0) {
//			popup1.get(0).click();
//		}
		
		
		WebElement Fashion = driver.findElement(By.className("xtXmba"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Fashion).build().perform();

		
		//List<WebElement> all = driver.findElements(By.xpath(""));
		//System.out.println(all.size());
		
		//for(WebElement a : all){
		//System.out.println(a.getText());
		
	}
	}

	
