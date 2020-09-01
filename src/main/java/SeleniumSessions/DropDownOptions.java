package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		By industry = By.id("Form_submitForm_Industry");
		
//		System.out.println(getDropDownOptionsCount(country));
//		System.out.println(getDropDownOptionsCount(industry));
//		
//		List<String> industryOptions = getDropDownOptionsValues(industry);
//		System.out.println(industryOptions);

		WebElement countryEle = driver.findElement(country);

		Select select = new Select(countryEle);

		List<WebElement> countryOptions = select.getOptions();
		
		System.out.println(countryOptions.size());
//		
//		for(WebElement ele : countryOptions){
//			System.out.println(ele.getText());
//		}
//		
		countryOptions.stream().forEach(ele -> System.out.println(ele.getText()));
		

	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator){
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		return optionsList.size();
	}
	
	public static List<String> getDropDownOptionsValues(By locator){
		List<String> textList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement ele : optionsList){
			String text  = ele.getText();
			textList.add(text);
		}
		
		return textList;
	}

}
