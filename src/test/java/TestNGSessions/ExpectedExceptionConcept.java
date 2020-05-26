package TestNGSessions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = Exception.class) // Exception
	 public void divTest() {
		
		int a=9/0;
		System.out.println(a);
		
		
	}

}
