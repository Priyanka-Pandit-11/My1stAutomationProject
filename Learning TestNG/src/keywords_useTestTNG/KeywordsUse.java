/**
 * 
 */
package keywords_useTestTNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Priyanka Pandit

 *@Description 
 * Aug 17, 20221:06:18 PM
 */

public class KeywordsUse {
	
	@Test(priority = -1, dependsOnMethods = "TestCase2")
	public void TestCase1() {
		
	}
	
	@Test(priority = 1)
	public void TestCase2() {
		Assert.assertEquals(true, false);
		
		
	}

	
	@Test(priority = 2, enabled=true)
	public void TestCase3() {
		System.out.println("Learning TestNG");
		
	}
	
	@Test(priority = 0, invocationCount = 5)
	public void TestCase4() {
		Reporter.log("Checking log Priyanka");
		
		
	}
}
