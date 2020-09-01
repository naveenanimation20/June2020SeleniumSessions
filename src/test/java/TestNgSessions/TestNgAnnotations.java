package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	// test cases:
	// test log
	// Global pre conditions
	// pre conditions + Steps + Validation(act vs exp) + post steps
	// test bed

	// Before Annotations (setup) + test steps/cases (method calling) +
	// Assertions + tear down (After Annotations)
	// launch chrome and url + check the google title + Google is equal to
	// Google + quit browser --> HTML / Plain Reports
	
	/**
	 * BS -- connect to DB
	   BT -- create User In DB
	   BC -- Launch browser
	   
			    BM -- loginToApp
					homePage adv search Test
			    AM -- logout
		
				BM -- loginToApp
					homePage profile Test
				AM -- logout
				
				BM -- loginToApp
					homePage search Test
				AM -- logout
		
				BM -- loginToApp
					homePage Title Test
				AM -- logout

		AC -- close browser
		AT -- delete user in DB
		AS -- disconnect DB

	 */

	//1
	@BeforeSuite
	public void connectDB() {
		System.out.println("BS -- connect to DB");
	}
	//2
	@BeforeTest
	public void createUserInDB() {
		System.out.println("BT -- create User In DB");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- Launch browser");
	}
	
	//4//7
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println("homePage Title Test");
	}

	@Test
	public void homePageSearchTest() {
		System.out.println("homePage search Test");
	}

	//5
	@Test
	public void homePageAdvSearchTest() {
		System.out.println("homePage adv search Test");
	}

	//8
	@Test
	public void homePageProfileTest() {
		System.out.println("homePage profile Test");
	}

	//6
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AT -- delete user in DB");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnect DB");
	}
	

}
