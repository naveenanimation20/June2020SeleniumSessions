package TestNgSessions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@BeforeTest(enabled=false)
	public void setup(){
		System.out.println("launch chrome");
	}
	
	@Test(invocationCount=10, priority=1, enabled=true)
	public void createUserTest(){
		System.out.println("create user.....");
	}
	
	
	@Test(priority=2)
	public void a_test(){
		System.out.println("a test");
	}
	
	@Test(priority=3, enabled=false)
	public void b_test(){
		System.out.println("b test");
	}
	
	@Test(priority=4)
	public void c_test(){
		System.out.println("c test");
	}
	
	
	
	

}
