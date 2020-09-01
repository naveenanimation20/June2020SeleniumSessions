package TestNgSessions;

import org.testng.annotations.Test;

public class DisableTestCases {

	
	@Test
	public void a_test(){
		System.out.println("a test");
	}
	
	@Test(enabled=false)
	public void b_test(){
		System.out.println("b test");
	}
	
	@Test
	public void c_test(){
		System.out.println("c test");
	}
	
	
	
	
	
}
