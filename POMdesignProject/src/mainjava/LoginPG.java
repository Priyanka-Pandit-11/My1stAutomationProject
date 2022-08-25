/**
 * 
 */
package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

/**
 * @author Priyanka Pandit
 *@Description 
 * Aug 24, 20222:17:55 PM
 */

public class LoginPG extends BaseTest{
	
	//All the locators of page
	
	@FindBy(xpath = "//*[@name = 'username']")
	WebElement UserName;
	
	@FindBy(xpath = "//*[@name = 'password']")
	WebElement Passward;
	
	@FindBy (xpath = "//*[text() = ' Login ']")
	WebElement BtnLogin;
	
	@FindBy (xpath = "//*[text()='Login']")
	WebElement textLoginPG;
	
	@FindBy (xpath = "//a[text()='OrangeHRM, Inc']")
	WebElement OfficialPGlink;
	//Initialization of locators/variables
	
	public LoginPG(WebDriver driver) {                       //constructor with local (WebDriver driver) parameter
		this.driver = driver ;                                // matching global driver from BaseTest and local driver of LoginPG
		PageFactory.initElements(driver, this);               // Pagefactorty intializing webelmt ina sequential manner
	}                                                          // start executing with local= global driver */
	
	
	//Methods to perform steps required for testcase
	
	public void LoginMethod() {
		UserName.sendKeys("Admin");
		Passward.sendKeys("admin123");
		BtnLogin.click();
	}

	public String CurrentUrlPG() {
		return driver.getCurrentUrl();
		
	}
	
	public String TitleofPG() {
		return textLoginPG.getText();
		
	}
	
	public boolean displayedOfficialPGlink() {
		return OfficialPGlink.isDisplayed();
	}
	
	public boolean loginbtnclickable() {
		return BtnLogin.isEnabled();
	}
}
