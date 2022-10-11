package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		
		if(sortable.size()>0){
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Prrsent");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		
		if(draggable.size()>0){
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Prrsent");
		}
		
		driver.switchTo().frame(0); //switch to iframe
		//driver.switchTo().frame("demo-free"); //only for name or id. in this case we dont have so not use
		//driver.switchTo().frame(driver.findElement(By.className("demoframe"))); //by webelment
		System.out.println("--------------switched to Frame--------------");
	
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		
		if(sortable.size()>0){
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Prrsent");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		
		if(draggable.size()>0){
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Prrsent");
		}
		
		driver.switchTo().defaultContent(); //switch to main page
		System.out.println("--------switch Main Page----------");
		
		
		
		
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		
		if(sortable.size()>0){
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Prrsent");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		
		if(draggable.size()>0){
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Prrsent");
		}
		
		//driver.switchTo().parentFrame();
		
		
		
		
	}
}
