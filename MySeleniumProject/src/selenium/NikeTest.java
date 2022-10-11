package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement menList = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menList).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> menlist = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(menlist.size());
		
		for(WebElement a : menlist){
		System.out.println(a.getText());
		}

	}

}
