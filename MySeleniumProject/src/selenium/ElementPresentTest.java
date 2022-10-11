package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		/*if(driver.findElement(By.linkText("Aboutxbsajhbxasjbx")).isDisplayed()) {
			System.out.println("Present");
		}else {
			System.List<A>println("not Present");
		}*/
	
		List<WebElement> element = driver.findElements(By.linkText("Aboutjkasbdk"));
		System.out.println(element.size());
		
		
		if(element.size()>0){
			System.out.println("Element Present");
		}else {
			System.out.println("Not Prrsent");
		}
		

	}

}
