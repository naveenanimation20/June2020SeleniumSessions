package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(5000);
		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		System.out.println(jsUtil.getTitleByJS());
		
		//jsUtil.refreshBrowserByJS();
		
		//jsUtil.generateAlert("this is my selenium alert");
		
//		String pageInnerText = jsUtil.getPageInnerText();
//		System.out.println(pageInnerText);
//		
//		if(pageInnerText.contains("Companies & Contacts")){
//			System.out.println("PASS");
//		}
		
//		WebElement userName = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
		//System.out.println(jsUtil.getBrowserInfo());
		
//		jsUtil.flash(userName);
//		userName.sendKeys("batchautomation");
//		jsUtil.flash(password);
//		password.sendKeys("Test@12345");
//		jsUtil.flash(login);
//		login.click();
		
//		userName.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		jsUtil.clickElementByJS(login);
		
		//jsUtil.scrollPageDown();
		WebElement header = driver.findElement(By.xpath("//span[text()='Best Sellers in Clothing & Accessories']"));
		jsUtil.scrollIntoView(header);
		
		
	}

}
