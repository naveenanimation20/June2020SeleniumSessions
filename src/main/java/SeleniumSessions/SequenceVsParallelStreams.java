package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SequenceVsParallelStreams {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("total links are: " + linksList.size());
		
		long startTime = System.currentTimeMillis();
		linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		//linksList.stream().parallel().forEach(ele -> System.out.println(ele.getText()));
		long endTime = System.currentTimeMillis();

		System.out.println("total time taken: " + (endTime-startTime));
		//sequ: total time taken: 5457
		//parallel - 4693
		
	}

}
