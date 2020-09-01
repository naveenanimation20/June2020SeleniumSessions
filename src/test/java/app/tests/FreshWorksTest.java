package app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshWorksTest extends BaseTest {

	@Test(priority = 1)
	public void FWTitleTest() {
		driver.get("https://www.freshworks.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "A fresh approach to customer engagement");
	}

	@Test(priority = 2)
	public void FWUrlTest() {
		//driver.get("https://www.freshworks.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.freshworks.com/");
	}

}
