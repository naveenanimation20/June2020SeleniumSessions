package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;

	public static void main(String ar[]) {

		String browser = "firefox";

//		if (browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
//			driver = new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
//			driver = new FirefoxDriver();
//		}
//
//		else if (browser.equalsIgnoreCase("safari")) {
//			driver = new SafariDriver();
//		}
//
//		else {
//			System.out.println("please pass the correct browser name.....");
//		}
		
		switch (browser) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the correct browser name.....");
			break;
		}
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
