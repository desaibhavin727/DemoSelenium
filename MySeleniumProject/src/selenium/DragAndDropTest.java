package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/sai/Downloads/SeleniumJars//chromedriver");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/"); 

		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		Thread.sleep(1000);
		
		System.out.println(droppable.getText());
	
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
	}

}
