
package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {

	
public static WebDriver driver;
public static FileInputStream fis;

public static Properties OR = new Properties();



@BeforeSuite
public void launchBrowser() {

	//Code to load parameters from Config file
	try {
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	}
	/*try {
		OR.load(fis);
	}*/ catch (IOException e) {
		e.printStackTrace();
	}
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chrome\\chromedriver_77.exe");
	driver = new ChromeDriver();
	
	// launch URL
	
	driver.get("https://quickbooks.intuit.com/accounting/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
}



}
