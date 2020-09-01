package SeleniumSessions;

public class GooglePage {

	public static void main(String[] args) {

		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();

		br.launchBrowser(browser);
		br.launchURL("http://www.amazon.com");

		String title = br.getPageTitle();
		System.out.println("page title is: " + title);
		if (title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}

		System.out.println(br.getPageUrl());

		br.closeBrowser();

	}

}
