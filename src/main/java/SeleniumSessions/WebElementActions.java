package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementActions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);

		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(username), "batchautomation").perform();
//		act.sendKeys(driver.findElement(password), "Test@12345").perform();
//		act.click(driver.findElement(login)).perform();
		
		doActionsSendKeys(username, "batchautomation");
		doActionsSendKeys(password, "Test@12345");
		doActionsClick(login);

	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value){
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator){
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	

}
