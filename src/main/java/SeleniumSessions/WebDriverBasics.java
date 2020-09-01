package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//open browser
		//enter url
		//verify title of the page -- Actual vs Expected
		//close the browser
		
		//top casting
		//Win OS:
		//System.setProperty("webdriver.chrome.driver", "c:\\documents\\chromedriverzip\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch browser
		
		
//		System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new SafariDriver();
		
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
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();//close the browser
		
	}

}
