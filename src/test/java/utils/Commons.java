package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import base.Base;

public class Commons extends Base {

	//Code to scroll down
	public void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
	}
	
	
	public void scrollUp() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	
	
	//Code to click on X button on Newsletter
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
	
	/*public static void waitAndClick(WebElement element){		   
		 waits.waitForClickableElement(element);
		 element.click();
		    	   
	   }*/
	
	
	
	//Code to fetch and compare(Assert) URL
	public void urlComp(String Expected){
		boolean expectedURL = true;
		boolean str = driver.getCurrentUrl().contentEquals(OR.getProperty(Expected));
			
		Assert.assertEquals(str, expectedURL);
				
	}
	
	//Code to click on Browser back
	public void navigateBack(){
		driver.navigate().back();
	}
	
	//Code to quit the driver
	public void close(){
		driver.quit();
	}
	
	public void tognscrollup(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Simple Start']//div[@data-di-id='#showpayrollbuynow_en-ss']")).click();
	}
	
	/*Code to enable toggle for self service payroll*/
	public void toggle(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Simple Start']//div[@data-di-id='#showpayrollbuynow_en-ss']")).click();
	}

}
