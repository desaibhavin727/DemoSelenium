package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
		File screenShotFile =driver.getScreenshotAs(OutputType.FILE);
		//file scrFile = ((TakesScreenShot)driver).getScreenshotAs(outputType.FILE); //line for Webdriver
		FileUtils.copyFile(screenShotFile, new File("/Users/sai/Downloads/testing/screenshot.png"));
		
		

	}

}
