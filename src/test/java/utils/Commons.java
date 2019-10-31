package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import base.Base;

public class Commons extends Base {


	public void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
	}
	
	public void newsletter(){
		
		driver.findElement(By.xpath("//span[@class='smallCloseBtn']")).click();
	}
	
	//Code to read parameters and assert parameters obtained from URL and Config file 
	public void urlParam(String Expected){
		
		String str = driver.getCurrentUrl();
		String part[]=str.split("offerId=");
		System.out.println("Plan id : "+part[1]);
		Assert.assertEquals(part[1], OR.getProperty(Expected));
		
		
	}
	
	//Code to fetch and compare(Assert) URL
	public void urlComp(String Expected){
		boolean expectedURL = true;
		boolean str = driver.getCurrentUrl().contentEquals(OR.getProperty(Expected));
			
		Assert.assertEquals(str, expectedURL);
				
	}
	
	public void navigateBack(){
		driver.navigate().back();
	}
	
	public void close(){
		driver.quit();
		
	}

}
