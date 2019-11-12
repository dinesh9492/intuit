/**
 * 
 */
package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import base.Base;
import pages.PlanandPricing;
import utils.Commons;

public class TC_simplePlan extends Base {

	public static PlanandPricing simple = new PlanandPricing();
	public static Commons com = new Commons();
	
		
	@Test
	public void TC_02() {
		//simple.plans_pricing();
		
		com.scrollDown();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		simple.ss_buynow();
		com.urlComp("configId_1");
		com.navigateBack();
		
		
		com.close();
	
				
	}
	


}
