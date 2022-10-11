package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //MAX TIME
		
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(4000); //FIX TIME
		
		driver.findElement(By.name("lastname")).sendKeys("desai");
		driver.findElement(By.name("reg_email__")).sendKeys("32784382648");
		driver.findElement(By.id("password_step_input")).sendKeys("bdwcdhbdb");

		
		//WebElement x = driver.findElement(By.xpath("//span[@data-type=\\\"selectors\\\"]"));
		//Select s = new Select(x);
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select M = new Select(month);
		
		
		M.selectByVisibleText("Jul");
		//Thread.sleep(4000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select D = new Select(date);
		
		D.selectByValue("10");
		//Thread.sleep(4000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select Y = new Select(year);
		
		Y.selectByValue("2000");
		//Thread.sleep(4000);
		
		/*List<WebElement> allRadio = driver.findElements(By.name("sex")); 
		System.out.println(allRadio.size());
		
		allRadio.get(0).click();
		System.out.println("--------------");*/
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}

		
	}


