package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test
	public void browserTest(){
		System.out.println("browser test");
	}
	
	@Test(dependsOnMethods= {"loginTest", "browserTest"})
	public void homeTest(){
		System.out.println("home page  test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest(){
		System.out.println("search  test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void userInfoTest(){
		System.out.println("user info  test");
	}
	
	

}
