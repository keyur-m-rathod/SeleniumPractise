package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		
		System.out.println("Before Selection.......");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());

		
		//Before Male Selection
		
		System.out.println("After Male Selection.......");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		
		//Before Female Selection
		
				System.out.println("After Female Selection.......");
				female_rd.click();
				System.out.println(male_rd.isSelected());
				System.out.println(female_rd.isSelected());
	}

}
