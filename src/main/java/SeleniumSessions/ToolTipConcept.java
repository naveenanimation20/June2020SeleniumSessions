package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().frame(0);
		driver.findElement(By.id("age")).sendKeys("30");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("age"))).perform();
		
		String tooltipText = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(tooltipText);
		
		
	}

}
