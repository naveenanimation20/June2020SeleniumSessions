package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickElement).perform();
		
		List<WebElement> rightOptionsList = driver
						.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		
		System.out.println(rightOptionsList.size());
		
		//rightOptionsList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		for(WebElement ele : rightOptionsList){
			System.out.println(ele.getText());
			if(ele.getText().equals("Copy")){
				ele.click();
				break;
			}
		}
		
	}

}
