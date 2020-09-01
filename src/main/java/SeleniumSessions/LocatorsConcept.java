package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// launch browser
		driver.get("https://www.freshworks.com/");
		Thread.sleep(5000);

		//Create WE + Action
		// 1. id
//		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
//		WebElement emailId = driver.findElement(By.id("username"));
//		emailId.sendKeys("test@gmail.com");
		
		//by locators:
//		By userName = By.id("username");
//		By password = By.id("password");
//		By loginButton  = By.id("loginBtn");
//		
//		driver.findElement(userName).sendKeys("test@gmail.com");
//		driver.findElement(password).sendKeys("test@123");
//		driver.findElement(loginButton).click();
		
//		getElement(userName).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
//		getElement(loginButton).click();
		
//		doSendKeys(userName, "test@gmail.com");
//		doSendKeys(password, "test@123");
//		doClick(loginButton);

		//2. name:
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//3. className:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test@gmail.com");
		
		//4. xpath: address of element in HTML DOM - is a locator but not an attribute
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//5. cssSelector: address of element in HTML DOM - is a locator but not an attribute
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
		
		
		//6. link text: only for links: with <a> htmltag
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: only for links but not recommended
		//sign up
		//sign in
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. tagName: html tag
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
	}
	
	/**
	 * this is used to create the webelement on the basis of given By locator
	 * @param locator
	 * @return webelement
	 */
	public static WebElement getElement(By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	
	public static String doGetText(By locator){
		return getElement(locator).getText();
	}
	
	public static boolean doDoIsDisplayed(By locator){
		return getElement(locator).isDisplayed();
	}
	

}
