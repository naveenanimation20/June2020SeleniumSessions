package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		By industryOptions = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		selectValueFromDropDown(countryOptions, "India");
		selectValueFromDropDown(industryOptions, "Electronics");


//		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//
//		for (WebElement ele : countryList) {
//			String text = ele.getText();
//			System.out.println(text);
//				if(text.equals("India")){
//					ele.click();
//					break;
//				}
//		}
	}
	
	
	public static void selectValueFromDropDown(By locator, String value){
		List<WebElement> countryList = driver.findElements(locator);

		for (WebElement ele : countryList) {
			String text = ele.getText();
			System.out.println(text);
				if(text.equals(value)){
					ele.click();
					break;
				}
		}
	}
	
	

}
