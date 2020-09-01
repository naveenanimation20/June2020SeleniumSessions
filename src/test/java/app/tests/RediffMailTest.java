package app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffMailTest extends BaseTest {

	@Test(priority = 1)
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}

	@Test(priority = 2)
	public void rediffUrlTest() {
		//driver.get("https://www.rediff.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.rediff.com/");
	}

}
