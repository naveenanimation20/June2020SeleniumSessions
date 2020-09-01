package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calc {

	static int xOffSet;
	static int yOffSet;

	public static int getXOffSet() {
		return xOffSet;
	}

	public static int getyOffSet() {
		return yOffSet;
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		driver.switchTo().frame("fullframe");

		Actions act = new Actions(driver);
		
		//+ operation
		setOperatorOffset("+");
		act.moveToElement(driver.findElement(By.id("canvas"))).moveByOffset(0, -40).click().build().perform();//9
		act.moveToElement(driver.findElement(By.id("canvas"))).moveByOffset(xOffSet, yOffSet).build().perform();//+

		act.moveToElement(driver.findElement(By.id("canvas"))).moveByOffset(0,40).click().build().perform();//6

		act.moveToElement(driver.findElement(By.id("canvas"))).moveByOffset(220, 255).click().build().perform();

	}

	public static void setOperatorOffset(String operator) {
		Map<String, Integer[]> opMap = new HashMap<String, Integer[]>();
		switch (operator) {
		case "+":
			opMap.put(operator, new Integer[] { 76, 206 });
			break;
		case "-":
			opMap.put(operator, new Integer[] { 106, 150 });
			break;
		case "/":
			opMap.put(operator, new Integer[] { 106, -70 });
			break;
		case "*":
			opMap.put(operator, new Integer[] { 106, 55 });
			break;
		default:
			System.out.println("please pass correct operator value");
			break;
		}

		xOffSet = opMap.get(operator)[0];
		yOffSet = opMap.get(operator)[1];

	}

}
