package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		//ExplicitWait -- > WebDriverWait, FluentWait ---> Wait(I)
		//is used for both WE and non webelements -- title, alert, url
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		
//		String title = waitForTitlePresent("HubSpot Login", 5);
//		System.out.println(title);
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		//wait.until(ExpectedConditions.titleContains("Login"));
//		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
//
//		System.out.println(driver.getTitle());
		
		By userName = By.id("username");
		By password = By.id("password");
		By loginButton  = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By firstName = By.id("uid-firstName-5");
		

		//custom wait with webdriverwait for a specific element
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(userName));
//		driver.findElement(userName).sendKeys("test@gmail.com");
		
		waitForElementPresent(userName, 10).sendKeys("test@gmail.com");
		
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginButton).click();
		driver.findElement(signUpLink).click();
		
		waitForElementPresent(firstName, 6).sendKeys("naveen");
		
		if(waitForUrl("signup", 5)){
			System.out.println("sign up url is correct");
		}
	}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresent(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	//An expectation for checking that an element, known to be present on the DOM of a page, 
	//is visible. Visibility means that the element is 
	//not only displayed but also has a height and width that is greater than 0.
	public static WebElement waitForElementToBeVisible(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));

	}
	
	public static String waitForTitlePresent(String titleValue, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	}
	
	
	public static boolean waitForUrl(String url, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	
}
