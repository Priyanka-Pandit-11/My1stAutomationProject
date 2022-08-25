/**
 * 
 */
package sequenceoftestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WithoutPriority {
	
	@Test
	public void aTestCase() {
		System.out.println("1st TestCase");
	}
	
	@Test()
	public void aTestCase2() {
		System.out.println("2nd TestCase");
	}
	
	@Test()
	public void aTestCase1() {
		System.out.println("3rd TestCase");
	}
	
	
	@Test
	public void TestCase4() {
		
		Reporter.log("Checking log Priyanka",true);
	}

}
