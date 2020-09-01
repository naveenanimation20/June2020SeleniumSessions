package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void myTest(){
		
		System.out.println("my test,,,...");
		int i = 9/0;
		
	}
	
	
	
	
	
	
	

}
