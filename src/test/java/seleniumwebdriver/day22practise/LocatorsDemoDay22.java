package seleniumwebdriver.day22practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsDemoDay22 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Name locator
		driver.findElement(By.name("search")).sendKeys("mac");

		//Id locator
		Boolean Logoelement = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(Logoelement);
		
	}

}
