/**
 * 
 */
package testcases;

import org.testng.annotations.Test;
import base.Base;
import pages.PlanandPricing;
import utils.Commons;

public class TC_simplePlan extends Base {

	public static PlanandPricing simple = new PlanandPricing();
	public static Commons com = new Commons();
	
	/*
	@Test
	public void TC_01() {
		simple.plans_pricing();
	}*/
	
	@Test
	public void TC_02() {
		simple.plans_pricing();
		
		simple.ss_buynow();
		com.urlComp("configId_1");
		com.navigateBack();
		
		simple.es_buynow();
		com.urlComp("configId_2");
		com.navigateBack();
		
		simple.plus_buynow();
		com.urlComp("configId_3");
		com.navigateBack();
		
		simple.adv_buynow();
		com.urlComp("configId_4");
		com.navigateBack();
		
		simple.se_buynow();
		com.urlComp("configId_5");
		
		com.close();
		
		
		/*simple.email();
		simple.confirm_email();
		simple.first_name();*/
				
	}
	
/*	@Test
	public void TC_03() {
		simple.es_buynow();
		simple.email();
		simple.confirm_email();
		simple.first_name();
		com.urlParam("configId_2");
	}*/
	

}
