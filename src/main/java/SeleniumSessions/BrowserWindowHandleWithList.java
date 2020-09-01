package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) {		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> windowsList = new ArrayList<String>(handles);
		
		String parentWidnowId = windowsList.get(0);
		System.out.println("parent window id: " + parentWidnowId);

		String childWindowId = windowsList.get(1);
		System.out.println("parent window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWidnowId);
		System.out.println("parent window title is: " + driver.getTitle());
		driver.quit();
		
	}
	
	

}
