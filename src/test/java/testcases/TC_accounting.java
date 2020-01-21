package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.Accounting;
import utils.Commons;

public class TC_accounting extends Base{
	
	public static Commons com = new Commons();
	public static Accounting acc = new Accounting();
	
	
	@Test
	public void TC_03() throws InterruptedException{
		
		//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

			
		acc.ss_abuynow();
		com.urlComp("configId_1");
		com.navigateBack();
		
		acc.es_abuynow();
		com.urlComp("configId_2");
		com.navigateBack();
		
		acc.pl_abuynow();
		com.urlComp("configId_3");
		com.navigateBack();
		
		acc.adv_abuynow();
		com.urlComp("configId_4");
		com.navigateBack();
		
		Thread.sleep(3000);
		
		/*Scenario2: This code clicks on Buy now buttons 
		after enabling Toggle for Self Payroll*/
		
		
		com.toggle();
		com.scrollUp();
		Thread.sleep(2000);
		
		acc.ss_selfpayroll();
		com.urlComp("configId_6");
		com.navigateBack();
		
		com.toggle();
		com.scrollUp();
		acc.es_selfpayroll();
		com.urlComp("configId_7");
		com.navigateBack();
		
		com.toggle();
		com.scrollUp();
		acc.pl_selpayroll();
		com.urlComp("configId_8");
		com.navigateBack();
		
		com.toggle();
		com.scrollUp();
		acc.adv_selfpayroll();
		com.urlComp("configId_9");
		
		System.out.println("End of TC_03");
		
		driver.quit();

		
		/*acc.sendEstimatesLink();
		acc.acc_SendEstimatesModal();*/
		
		/*acc.mspbuynow();*/
		
	}

}
