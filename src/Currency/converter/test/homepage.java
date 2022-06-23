package Currency.converter.test;
import CurrencyConverter_PO.CurrencyConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import UserDefinedLibraries.DriverSetup;
import UserDefinedLibraries.Screenshot;
import dev.failsafe.internal.util.Assert;
public class homepage {
	public static WebDriver driver;
	public static String s1="";

		// TODO Auto-generated method stub
		@BeforeTest
		public void initiatedriver() {
			
			driver=DriverSetup.driverInstantiate();
		}
	
	
	
		@Test(dataProvider="testdata")
		public void currencyconversion(String data) throws IOException  {
			
			
			CurrencyConverter.amount(driver).clear();
			CurrencyConverter.amount(driver).sendKeys("1");
			
			Select fromcurrency = new Select(CurrencyConverter.fromdropdown(driver));
			fromcurrency.selectByValue("INR");
			
			Select tocurrency = new Select(CurrencyConverter.todropdown(driver));
			tocurrency.selectByValue(data);
			
			CurrencyConverter.calculatebutton(driver).click();
			String s2="/Users/sourabh/Desktop/EclipseWorkspace/CurrencyConverter/Screenshot/Screenshot_"+data+".png";
			Screenshot.takescreenshot(driver,s2);
			
			String s= CurrencyConverter.convertedvalue(driver).getText();
			s1=s1+s+"\n";
			
			
		}
		
		
		@DataProvider(name = "testdata")
	    public Object[][] dataProviderMethod() {
	        return new Object[][] { 
	        	{"USD"}, 
	        	{"EUR"}, 
	        	{"GBP"},
	        	{"SGD"},
	        	{"AUD"},
	        	{"CAD"}
	        	
	        };
	    }
		
		@AfterTest
		public void CloseDriver() {
			
			try {
			PrintStream ps=new PrintStream(new File("/Users/sourabh/Desktop/EclipseWorkspace/CurrencyConverter/src/OutputData/data.txt"));
			ps.print(s1);
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DriverSetup.driverClose();
			
		}
			
			
		}
		
	    
	    
	    
		
		


}
