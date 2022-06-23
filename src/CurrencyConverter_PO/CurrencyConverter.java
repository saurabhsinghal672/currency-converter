package CurrencyConverter_PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyConverter {
	
	public static WebElement element;
	public static WebDriver driver;
	
	
	public static WebElement amount(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//input[@id='eamount']"));
		return element;
	}
	
	public static WebElement convertedvalue(WebDriver driver) {
		
		element= driver.findElement(By.xpath("(//p[@class='verybigtext']//font//b)[1]"));
		return element;
	}
	
	public static WebElement calculatebutton(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//table[not(@class='panel')]//input[@value='Calculate']"));
		return element;
	}
	
	public static WebElement todropdown(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//select[@id='eto']"));
		return element;
	}
	
	public static WebElement fromdropdown(WebDriver driver) {
		
		element= driver.findElement(By.xpath("//select[@id='efrom']"));
		return element;
	}
	
	
	

}
