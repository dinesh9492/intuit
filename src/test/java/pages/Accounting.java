package pages;

import org.openqa.selenium.By;
import base.Base;

public class Accounting extends Base{
	
	
	/*public void button(){
			
		WebElement ele = driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Simple Start']//a[contains(@data-wa-link,'ssbuynow')]"));
ele.click();	
	
	
	}*/	

	public void ss_abuynow(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Simple Start']//a[@data-wa-link='ssbuynow']")).click();
	}
	
	public void es_abuynow(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Essentials']//a[@data-wa-link='esbuynow']")).click();
	}
	
	public void pl_abuynow(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Plus']//a[@data-wa-link='plbuynow']")).click();
	}
	
	public void adv_abuynow(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Advanced']//a[@data-wa-link='advbuynow']")).click();
	}
	
		
	
	/*Clicks on buynow button after selecting self service payroll*/
	public void ss_selfpayroll(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Simple Start']//a[contains(@data-wa-link,'ssbuynow_en')]")).click();
	}
	
	public void es_selfpayroll(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Essentials']//a[contains(@data-wa-link,'esbuynow_en')]")).click();
	}
	
	public void pl_selpayroll(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Online Plus']//a[contains(@data-wa-link,'plbuynow_en')]")).click();
	}
	
	public void adv_selfpayroll(){
		driver.findElement(By.xpath("//div[@data-product='QuickBooks Advanced']//a[contains(@data-wa-link,'advbuynow_en')]")).click();
	}
	


}

