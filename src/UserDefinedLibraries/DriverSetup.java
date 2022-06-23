package UserDefinedLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	public static WebDriver driver;
	public static String url = "https://www.calculator.net/currency-calculator.html";

	// to select a particular driver
	public static WebDriver driverInstantiate() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sourabh/Desktop/EclipseWorkspace/CurrencyConverter/Webdrivers/chromedriver3");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void driverClose() {
		DriverSetup.driver.quit();
	}

	
}
