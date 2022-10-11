package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/sai/Downloads/SeleniumJars//geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=BXxRggbDE68&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQlh4UmdnYkRFNjgiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2MTcxNzM0MiwiaWF0IjoxNjYxNzE2MTQyLCJqdGkiOiI5YTc5YjAxNS1mMWNmLTRlYTEtOWMwNy1iNzA1ODczZmI3MWUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.cw4cQjk7J1XoX_JEBT6V64jjaBQvMda6kjGjfwN-8r3YVlquVLVQLiBVg_DHW3Qw_qvLpnasf4qJR6thBY5WR5hWgZBOpdzgjEKrk9ga5HLgfBrEZ4iCIocXlLGUdyb5EpXj6AMFn0tr91AeD2toOGqT4Md156SYbEZhjXAg5PhRrvjPB6fm7_XghU-Q6BMrrvduxAIFX-RF1FBxyL0by46iqHGyCY-zjnnWacRkNeIqphzzte9niVJzhWaZvxPkypuLQR9vy6vLlPRNZB4-EykW60_DXajhkNNzzibQQixqBl3imBy-MliW3Ezre4vxmrdH--oRSMf-xgN1ArRVXA&preferred_environment=");

		driver.findElement(By.id("usernameInput-input")).sendKeys("sjncakjncbksbckabs@$");
		driver.findElement(By.name("password")).sendKeys("djkbsakdbask");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String expectedError = "Please enter a username or card number without special characters.";
		String actualError = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError);

		if(expectedError.equals(actualError)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
