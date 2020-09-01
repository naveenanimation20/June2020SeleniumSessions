package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// id -- #id
		// class -- .class
		// #username
		// #username.login-email

		By email = By.cssSelector("#username.login-email");//---right
		By.className("form-control private-form__control login-email");//--wrong
		By.xpath("//input[@class='form-control private-form__control login-email']");//right
		// .form-control.private-form__control.login-email
		
		// .form-control.private-form__control.login-email#username
		
		// input[id='username']
		// input[id='username'][type='email']
		
		// div.private-form__input-wrapper > input
		// div.private-form__input-wrapper input
		
		// ul.footer-nav > li > a -- 34
		// ul.footer-nav li a -- 34
		
		// input[id*='username'] -- contains
		// input[id^='user'] --  starts with
		// input[id$='name'] -- ends with
		

		//comma in CSS:
		// input#username, input#password, button#loginBtn
		// #username, #password, #loginBtn, .private-checkbox__text
		
		int mandatory_filedsCount = driver.findElements
					(By.cssSelector("input#username, input#password, button#loginBtn, .private-checkbox__text")).size();
		if(mandatory_filedsCount == 4){
			System.out.println("login form is dispayed with username, login button and remember be checkbox");
		}
		
		//nth-of-type:
		// ul.footer-nav li:nth-of-type(3) -- specific index
		// ul.footer-nav li:nth-of-type(n) -- all elements
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(3) a
		
		// div.private-form__input-wrapper + div -- following sibling
		
		//not operator in css:
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(#password)
		// input.form-control.private-form__control:not(.login-email)
		
	}

}
