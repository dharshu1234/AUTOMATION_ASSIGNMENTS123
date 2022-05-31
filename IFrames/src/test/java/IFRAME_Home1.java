import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.IFRAME_HOME_PAGE;

public class IFRAME_Home1 extends LaunchBrowsers {
	 /**
     * Method to verify UI element in voot home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{
  
    	IFRAME_HOME_PAGE.navigateToContactus();
    	
    }

}
