package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		Thread.sleep(3000);
		
		List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span"));
		
		System.out.println(suggestionsList.size());
		
		for(WebElement ele : suggestionsList){
			String text = ele.getText();
			System.out.println(text);
				if(text.equals("testing techniques")){
					ele.click();
					break;
				}
		}
		
	}

}
