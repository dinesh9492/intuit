package pages;

import org.openqa.selenium.By;

import base.Base;

public class PlanandPricing extends Base {
	
	
	public void plans_pricing() {
		
		driver.findElement(By.linkText("Plans & Pricing")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void ss_buynow(){
		
		driver.findElement(By.xpath("//a[contains(@data-wa-link, 'ssbuynow-diy')]")).click();
		
	}
	
	public void es_buynow(){
		
		driver.findElement(By.xpath("//a[contains(@data-wa-link, 'esbuynow-diy')]")).click();
		
	}
	
	public void plus_buynow(){
		
		driver.findElement(By.xpath("//a[contains(@data-wa-link, 'plbuynow-diy')]")).click();
		
	}
	
	public void adv_buynow(){
		
		driver.findElement(By.xpath("//a[contains(@data-wa-link, 'advbuynow-diy')]")).click();
		
	}
	 
	
	public void se_buynow(){
		
		driver.findElement(By.xpath("//a[contains(@data-wa-link, 'sebuynow-diy')]")).click();
		
	}
	
	public void email(){
		
		driver.findElement(By.id("ius-email")).clear();
		driver.findElement(By.id("ius-email")).sendKeys("dineshbhargava92@gmail.com");
		
	}
	
	public void confirm_email(){
		
		driver.findElement(By.id("ius-confirm-email-address")).sendKeys("dineshbhargava92@gmail.com");
		
	}
	
	public void first_name(){
		
		driver.findElement(By.id("ius-first-name")).sendKeys("dinesh");
		
	}
	
	
	

}
