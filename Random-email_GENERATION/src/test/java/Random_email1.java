import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.Random_email_generation;

public class Random_email1 extends LaunchBrowsers {
	 /**
  /   * Method to verify UI element in voot home page
	 * @throws Exception 
     */
    @Test
    public void homePagevalidation() throws Exception{
    	
      Random_email_generation.verifyHomePageNavigation();
    Random_email_generation.verifyVootLogo111();
     Random_email_generation.navigateToMyAccounttab();
    	
  
    	
    }

	
}

