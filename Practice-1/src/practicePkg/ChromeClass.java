package practicePkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/sai/Downloads/SeleniumJars/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
