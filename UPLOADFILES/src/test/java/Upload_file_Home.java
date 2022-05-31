import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.UploadF_Files_Home;

public class Upload_file_Home extends LaunchBrowsers {
	 /**
     * Method to verify UI element in voot home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{
       UploadF_Files_Home. navigateToContactus();
       UploadF_Files_Home. verifySuccessfulMsg();
    }

}
