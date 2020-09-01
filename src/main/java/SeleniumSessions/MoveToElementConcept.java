package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
		
		WebElement contentMenu = driver.findElement(By.className("menulink"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(contentMenu).perform();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("COURSES")).click();
		
		
	}

}
