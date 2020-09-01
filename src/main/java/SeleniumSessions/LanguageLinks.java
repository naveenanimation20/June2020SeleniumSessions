package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		doLinkClick(langLinks, "मराठी");
//		for(WebElement ele : langLinks){
//			String text = ele.getText();
//			System.out.println(text);
//			
//				if(text.equals("मराठी")){
//					ele.click();
//					break;
//				}
//		}
	}
	
	public static void doLinkClick(List<WebElement> linksList, String value){
		System.out.println(linksList.size());
		for(WebElement ele : linksList){
			String text = ele.getText();
			System.out.println(text);
			
				if(text.equals(value)){
					ele.click();
					break;
				}
		}
	}
	

}
