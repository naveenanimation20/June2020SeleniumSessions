package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	static final String all_value = "all";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

		// multi:
		 selectChoiceValue(choices, "choice 2", "choice 6 2 1", "choice 3", "choice 6 2 3");
		// single:
		// selectChoiceValue(choices, "choice 1");
		// all values:
		selectChoiceValue(choices, JqueryDropDownHandle.all_value);

		Thread.sleep(8000);
		driver.quit();

	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */
	public static void selectChoiceValue(By locator, String... value) {

		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase(JqueryDropDownHandle.all_value)) {

			for (int i = 0; i < choiceList.size(); i++) {

				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		}
		// for all values:
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {

			}

		}

	}

}
