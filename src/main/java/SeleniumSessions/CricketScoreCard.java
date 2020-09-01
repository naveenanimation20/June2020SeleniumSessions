package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//launch chrome
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187714/new-zealand-women-vs-south-africa-women-1st-odi-icc-womens-championship-2017-18-2021");//enter url
		
        Thread.sleep(5000);
		
		System.out.println(getWicketTakerName("KT Perkins"));
		System.out.println(getWicketTakerName("LR Down" + ""+ "test"));

		
	}

	public static String getWicketTakerName(String playerName){
		
		//a[text()='KT Perkins']//parent::td//following-sibling::td/span
		return driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td/span")).getText();
		
	}
	
	
	
	
	
}
