/**
 * 
 */
package sequenceoftestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingTestCaseSequence {
	
	@Test()
	public void TestCase1 () {
		System.out.println("1st TestCase");
		
	}
	
	@Test(priority=1)
	public void Testcase2() {
		System.out.println("2nd TestCase");
		
	}
	
	@Test(priority=2)
	public void TestCase3() {
		Reporter.log("Checkin Log Priyanka",true);
	}
	
	
	@Test (priority = -1)
	public void TestCase4() {
		
		System.out.println(5*11);	
	}

}
