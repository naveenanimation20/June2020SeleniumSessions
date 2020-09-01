package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().setSize(new Dimension(1540, 987));
//		System.out.println(driver.manage().window().getSize());
//		System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().getWidth());

//		driver.manage().window().setPosition(new Point(50,200));
//		System.out.println(driver.manage().window().getPosition().getX());
//		System.out.println(driver.manage().window().getPosition().getY());

		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));
		Actions act = new Actions(driver);
		act.moveToElement(age).build().perform();
		
		String text = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(text);
		
		
	}

}
