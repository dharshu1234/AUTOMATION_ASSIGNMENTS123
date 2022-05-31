import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.REGISTER_FORM_HOME_PAGE;

public class RegisterHome extends LaunchBrowsers {
	 /**
  /   * Method to verify UI element in voot home page
	 * @throws Exception 
     */
    @Test
    public void homePagevalidation() throws Exception{
    	
      REGISTER_FORM_HOME_PAGE.verifyHomePageNavigation();
    REGISTER_FORM_HOME_PAGE.verifyVootLogo111();
     REGISTER_FORM_HOME_PAGE.navigateToMyAccounttab();
    	
  
    	
    }

	
}

