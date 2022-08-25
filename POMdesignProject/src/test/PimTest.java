/**
 * 
 */
package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Priyanka Pandit
 *@Description 
 * Aug 24, 20227:19:21 PM
 */
public class PimTest extends BaseTest {

	
	@BeforeMethod
	public void Login() {
		loginobj.LoginMethod();
	}
	@Test(priority = 6)
	public void verifyUserImgDisplayed() {	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssertJUnit.assertEquals(PIMobj.UserImage(), true);
	}
}
