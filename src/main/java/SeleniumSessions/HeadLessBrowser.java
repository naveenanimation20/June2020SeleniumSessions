package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//running in headless mode
		//no browser is visible
		//testing is happening in the background
		//fast
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.google.com");//enter url
		String title = driver.getTitle();///getting the title
		System.out.println(title);
		
		//validation point/ check point :
		if(title.equals("Google")){
			System.out.println("title is correct");
		}
		else{
			System.out.println("title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		if(url.contains("google")){
			System.out.println("correct url");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
