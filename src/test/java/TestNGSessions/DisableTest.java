package TestNGSessions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DisableTest {
	
	@Test
	public void test1() {
		System.out.println("test 1...");
	}
	
	@Test(enabled = false)
	public void atest2() {
		System.out.println("test 2...");
	}
	
	@Test(enabled = true)
	public void btest3() {
		System.out.println("test 3...");
	}
	
	@Test
	public void ctest4() {
		System.out.println("test 4...");
	}
	
	@Test
	public void atest5() {
		System.out.println("test 5...");
	}

}
