package Logic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import static Logic.LaunchBrowsers.*;

import java.time.Duration;
import java.util.Random;

import Pages.ANZ_Home;

public class ANZ_Home_Page {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	 /** 1.
     * Method to verify user navigated to voot home page by fetching current url & comparing with actual url.
	 * @throws InterruptedException 
     */
    public static void verifyHomePageNavigation() throws InterruptedException{
        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl,"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/ ","Not navigated to Voot home page");
        Thread.sleep(5000);
        System.out.println("Home page url is: " + homePageUrl);
    }

    /** 2.
     * method to verify voot logo by presence of element and comparing fetched logo text with actual text.
     * @throws InterruptedException 
     */
    public static void verifyVootLogo() throws InterruptedException{
       WebElement vootlogo = driver.findElement(ANZ_Home.objAnnualincome);
        String logoText = vootlogo.getAttribute("title");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        System.out.println("Text of voot logo is: " + logoText);
  

    }
    public static void navigateToobjAnnualincome() throws InterruptedException {
    	Thread.sleep(5000);
    	
	   driver.findElement(ANZ_Home.objAnnualincome).sendKeys("$80,000");
   	driver.findElement(ANZ_Home.objOtherIncome).sendKeys("$10,000");
   	Thread.sleep(5000);
   	driver.findElement(ANZ_Home.objLivingExpenses).sendKeys("$500");
   	driver.findElement(ANZ_Home.objCurrentHomeLoanRepayment).sendKeys("$0");
   	driver.findElement(ANZ_Home.objOtherloanRepayment).sendKeys("$100");
   	Thread.sleep(5000);
   	driver.findElement(ANZ_Home.objOthercommitement).sendKeys("$0");
   	driver.findElement(ANZ_Home.objTotalCreditcaredLimit).sendKeys("$10,000");
   	driver.findElement(ANZ_Home.objHowMuchIcouldBarrow).click();
   	Thread.sleep(5000);
   	
	String expected = "$1,326,000";
	WebElement actualMsg = driver.findElement(ANZ_Home.objestimateborrow );
	String text=actualMsg.getText();
	Assert.assertEquals(text, expected);
	System.out.println("TEST1 PASSED");
	Thread.sleep(5000);
	
	driver.findElement(ANZ_Home.objstartover).click();
	
	//Thread.sleep(5000);
	driver.findElement(ANZ_Home.objLivingExpenses1).sendKeys("$1");
	Thread.sleep(5000);
	Thread.sleep(5000);
	driver.findElement(ANZ_Home.objWorkouthowmuchIcouldBarrow).click();
	
	String expected1 = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
	WebElement actualMsg1 = driver.findElement(ANZ_Home.objText );
	String text1=actualMsg1.getText();
	Assert.assertEquals(text1, expected1);
	System.out.println("TEST2 PASSED");
	Thread.sleep(5000);
	
	

    
    	
    	driver.close();
    
    	
    }

	public static void navigateToPremiumpage() {
		// TODO Auto-generated method stub
		
	}

}
