package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * this is browser util, having different browser related generic functions
 * @author NaveenKhunteta
 *
 */
public class BrowserUtil {

	public WebDriver driver;

	/**
	 * this method is used to launch the browser on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return driver
	 */
	public WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browser name.....");
		}

		return driver;

	}

	/**
	 * this is to launch the url
	 * 
	 * @param url
	 */
	public void launchURL(String url) {
		driver.get(url);
	}

	/**
	 * this is used to get the title
	 * 
	 * @return page title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * this is used to get the current page url
	 * 
	 * @return page url
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * this is used to close the browser
	 */
	public void closeBrowser(){
		driver.close();
	}
	
	/**
	 * this is used to close the browser
	 */
	public void quitBrowser(){
		driver.quit();
	}

}
