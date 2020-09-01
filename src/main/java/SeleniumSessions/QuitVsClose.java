package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());//Google
		
		driver.quit();
		//driver.close();//close the browser
		
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		//NoSuchSessionException: invalid session id -- for close
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()? -- for quit

		
	}

}
