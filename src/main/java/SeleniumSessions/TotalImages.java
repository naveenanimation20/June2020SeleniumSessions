package SeleniumSessions;

import java.util.List;import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		System.out.println(imagesList.size());
		
//		for(int i=0; i<imagesList.size(); i++){
//			System.out.println(imagesList.get(i).getAttribute("src"));
//		}
		
//		for(WebElement ele : imagesList){
//			System.out.println(ele.getAttribute("src"));
//		}
		
		imagesList.stream().forEach(ele -> System.out.println(ele.getAttribute("src")));
		
	}

}
