package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.css.CSSStyleDeclaration;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// Tag Id  tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		// Tag classname  tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		
		// Tag attribute  tag[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
	}

}
