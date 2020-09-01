package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//global wait -- it will applied for all the webelements by default
		//applied for all the web elements -- FE/FEs
		//not applicable for non web elements -- title, url, alerts 

		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//nullify imp wait
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
		
		//home page:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//e4
		//e5
		//e6
		


	}

}
