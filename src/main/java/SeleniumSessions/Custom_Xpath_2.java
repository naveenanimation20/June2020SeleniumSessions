package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//launch chrome
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://app.hubspot.com/login");//enter url
        
        driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Selenium@12345");
        driver.findElement(By.id("loginBtn")).click();
        
        Thread.sleep(5000);
        driver.navigate().to("https://app.hubspot.com/contacts/6329229/contacts/list/view/all/");
        Thread.sleep(5000);

//        driver
//        .findElement(By.xpath("//span[text()='Sagar LN']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
//        .click();
        
        selectContact("tom peter");
        selectContact("Sagar LN");
        System.out.println(getContactEmailId("Sagar LN"));
		
		//div[@class='private-form__input-wrapper']/input[@id='username']
		//single slash - / --> direct child elements
		//doublts slash - // --> direct + indirect child elements
		
		//body/div --> 5
		//body//div -- 30
		//backward traversing in xpath:
		//input[@id='username']/../../../../../../../../../..
		
		//div[@class='private-form__input-wrapper']//child::input[@id='username']
		//input[@id='username']//parent::div
		//input[@id='username']//parent::div/../../../..
		//input[@id='username']//ancestor::div
		
		//span[text()='Sagar LN']//ancestor::td//preceding-sibling::td//input[@type='checkbox']
		
	}
	
	public static void selectContact(String name){
		driver
        .findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
        .click();
	}
	
	public static String getContactEmailId(String name){
		return driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
		
	}
	

}
