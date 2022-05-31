package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.Register_HomePages;

public class REGISTER_FORM_HOME_PAGE {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to voot home page by fetching current url
	 * & comparing with actual url.
	 * @throws InterruptedException 
	 * 
	 */
	
	
	
	
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://practice.automationtesting.in/", "Not navigated to Voot home page");
	    Thread.sleep(1000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot logo by presence of element and comparing fetched
	 * logo text with actual text.
	 * @throws InterruptedException 
	 */
	public static void verifyVootLogo111() throws InterruptedException {
WebElement vootlogo =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]"));
		
		//WebElement vootlogo = driver.findElement(HomePages.objMyAccountTab);
		
		String logoText = vootlogo.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		Thread.sleep(5000);
		System.out.println("Text of voot logo is: " + logoText);


	}

	public static void navigateToMyAccounttab() throws Exception {
		Thread.sleep(5000);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(Register_HomePages.objMyAccountTab).click();
		
		Thread.sleep(5000);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(Register_HomePages.objEmail).sendKeys("username" + randomInt + "@gmail.com");

	//	driver.findElement(HomePages.objEmail).sendKeys("dharshanrm789526@gmail.com");
		driver.findElement(Register_HomePages.objPassword).sendKeys("dharshanrm32@gmail.com");
		
		driver.findElement(Register_HomePages.objRegister).click();
		Thread.sleep(5000);

		driver.findElement(Register_HomePages.objAddresses).click();
		driver.findElement(Register_HomePages.obJbillingEdit).click();
		Thread.sleep(5000);

		driver.findElement(Register_HomePages.ObjFirst_name).sendKeys("Kiran");
		driver.findElement(Register_HomePages.objLast_name).sendKeys("H M");
		Thread.sleep(5000);
		System.out.println("First and last name done");
		driver.findElement(Register_HomePages.objCompanyName).sendKeys("xyzghi");
	    driver.findElement(Register_HomePages.objPhone ).sendKeys("8660034975");

		
		

		
	
	    
	    driver.findElement(Register_HomePages.objAddress1).sendKeys("#34 Door no, 6th main 2nd phase");
		driver.findElement(Register_HomePages.objAddress2).sendKeys("5th cross 3rd floor");
		
		driver.findElement(Register_HomePages.objCity).sendKeys("Bangalore");
		Thread.sleep(5000);

		driver.findElement(Register_HomePages.objState).click();



		driver.findElement(Register_HomePages.objState1).sendKeys("Kerala");



		driver.findElement(Register_HomePages.objState2).click();
		
		driver.findElement(Register_HomePages.objPostcode).sendKeys("5600890");
		driver.findElement(Register_HomePages.objSaveAddress).click();
		driver.findElement(Register_HomePages. objLogout).click();


	Thread.sleep(5000);
	driver.close();
	driver.quit();



	}

	public static void verifyVootLogo1() {
		// TODO Auto-generated method stub

	}

	public static void verifyVootLogo11() {
		// TODO Auto-generated method stub

	}

	public static void verifyVootLogo() {
		// TODO Auto-generated method stub

	}

}
