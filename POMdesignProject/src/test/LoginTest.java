/**
 * 
 */
package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Priyanka Pandit
 *@Description 
 * Aug 24, 20222:18:19 PM
 */
public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLoginPGurl() {
		AssertJUnit.assertEquals(loginobj.CurrentUrlPG(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test (priority = 2)
	public void verifyTitleLoginPG() {
		AssertJUnit.assertEquals(loginobj.TitleofPG(), "Login");
	}
	
	@Test(priority= 3)
	public void VerifyOfficalPGlink() {
		AssertJUnit.assertEquals(loginobj.displayedOfficialPGlink(), true);
	}
	
	@Test  (priority = 4, groups = "smoke")
	public void VerifyLoginbtnenabled() {
		AssertJUnit.assertEquals(loginobj.loginbtnclickable(), true);
	}
	

	@Test(priority = 5, groups = {"smoke","regression"})
	public void VerifyLogin() {
		loginobj.LoginMethod();
		
		Assert.assertEquals(loginobj.CurrentUrlPG(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}
}
