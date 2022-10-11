package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String browser = "Firefox"; //Chrome, Safari //We'll read this value from Data file like Excel, Properties
		WebDriver driver;
		
		FileInputStream f = new FileInputStream("/Volumes/personal data/NIKUL QA/Selenium_WorkSpace/MySeleniumProject01/browser.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		System.out.println(prop.getProperty("browser")); 
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/sai/Downloads/SeleniumJars//geckodriver");
			driver = new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/sai/Downloads/SeleniumJars//chromedriver");
			driver = new ChromeDriver(); 
		}else {
			System.setProperty("webdriver.safari.driver", "/Users/sai/Downloads/SeleniumJars//safaridriver");
			driver = new SafariDriver(); 
		}
	
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.id("email")).sendKeys("hsvdhjvdjqbv"); 
		driver.findElement(By.id("pass")).sendKeys("ckdsnjkndj");  
		driver.findElement(By.name("login")).click(); 
		
		
	}

}
