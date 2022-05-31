import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.ANZ_Home_Page;

public class ANZ_HOME1 extends LaunchBrowsers {
	 /**
     * Method to verify UI element in voot home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{

       ANZ_Home_Page. navigateToobjAnnualincome();
    }

}
