package day24.xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//relative xpath with single attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Shirts");
		
		
		

	}

}
