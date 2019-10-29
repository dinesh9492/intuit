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
	
	
	@Test
	public void TC_01() {
		simple.plans_pricing();
	}
	
	@Test(enabled = false)
	public void TC_02() {
		simple.plans_pricing();
		simple.ss_buynow();
		com.urlParam("configId_1");
		/*simple.email();
		simple.confirm_email();
		simple.first_name();*/
				
	}
	
	@Test
	public void TC_03() {
		simple.es_buynow();
		/*simple.email();
		simple.confirm_email();
		simple.first_name();*/
		com.urlParam("configId_2");
	}
	

}
