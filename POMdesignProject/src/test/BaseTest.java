/**
 * 
 */
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LoginPG;
import mainjava.PIMPG;


/**
 * @author Priyanka Pandit
 *@Description 
 * Aug 24, 20221:25:33 PM
 */
public class BaseTest {
	
	public static WebDriver driver;
	protected LoginPG loginobj;
	protected PIMPG PIMobj;
	@BeforeClass
	public void LaunchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void PageObjects() {
		loginobj = new LoginPG(driver);
	    PIMobj = new PIMPG(driver);
	}

	@AfterClass
	public void TearDownEnviornment() {
		Reporter.log("Automation done by Priyanka",true);
		driver.close();
	} 

}
