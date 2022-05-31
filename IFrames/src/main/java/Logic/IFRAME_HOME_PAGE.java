package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.IFRAME_Home;

public class IFRAME_HOME_PAGE {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to voot home page by fetching current url
	 * & comparing with actual url.
	 * 
	 * @throws InterruptedException
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://demo.automationtesting.in/Frames.html",
				"Not navigated to Voot home page");
		Thread.sleep(5000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot logo by presence of element and comparing fetched
	 * logo text with actual text.
	 * 
	 * @throws InterruptedException
	 */
	public static void verifyVootLogo() throws InterruptedException {
		WebElement vootlogo = driver.findElement(IFRAME_Home.objsingleIframe);
		String logoText = vootlogo.getAttribute("title");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);

	}

	public static void navigateToContactus() throws InterruptedException {

		String Parent_Window = driver.getWindowHandle();

		System.out.println("switching");

		WebElement frameCSSPath = driver.findElement(IFRAME_Home.pre_single_frame);
		driver.switchTo().frame(frameCSSPath);

		Thread.sleep(3000);
		System.out.println("switched");

		driver.findElement(IFRAME_Home.pre_single_frame_input).sendKeys("Dharshan R M");
		Thread.sleep(3000);

		driver.switchTo().window(Parent_Window);

		Thread.sleep(3000);

		driver.findElement(IFRAME_Home.iframe_iframe_button).click();

		WebElement mframexparth = driver.findElement(IFRAME_Home.nested_iframe_parent_xpath);
		driver.switchTo().frame(mframexparth);

		WebElement sframexparth = driver.findElement(IFRAME_Home.nested_iframe_child_xpath);
		driver.switchTo().frame(sframexparth);

		Thread.sleep(3000);
		System.out.println("clicked on iframe input");

		driver.findElement(IFRAME_Home.nested_iframe_input_xpath).sendKeys("Dharshan R M");
		Thread.sleep(3000);
	}

}
