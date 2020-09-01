package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		By industry = By.id("Form_submitForm_Industry");
		
		selectDropDownValueByVisibleText(country, "India");
		selectDropDownValueByIndex(industry, 5);
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
//		WebElement industry = driver.findElement(By.id("Form_submitForm_Industry"));
		
		//country.sendKeys("India");
		
//		//select html tag: for drop down -- we need to use Select class
//		Select select  = new Select(industry);
//		//select.selectByVisibleText("Angola");
//		//select.selectByIndex(6);
//		select.selectByValue("Computer/Technology-Reseller");
		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void selectDropDownValueByVisibleText(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDownValueByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropDownValueByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	
	
	
	
	
	
	
	

}
