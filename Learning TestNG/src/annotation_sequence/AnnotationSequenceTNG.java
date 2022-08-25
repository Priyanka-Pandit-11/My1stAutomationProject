/**
 * 
 */
package annotation_sequence;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequenceTNG {

	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void  BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test()
	public void TestCase1() {
		System.out.println("Test Case 1");
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void AfteMethod() {
		System.out.println("AfteMethod");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
}
