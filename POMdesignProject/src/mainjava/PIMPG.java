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
 * Aug 24, 20223:42:09 PM
 */
public class PIMPG extends BaseTest{
	
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement textPage;
	
	@FindBy (xpath="//*[@class='oxd-userdropdown-img']")
	WebElement UserImg;
	
	public PIMPG(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	 public String titleOfPIMpage() {
		return textPage.getText();

	 }
	 
	 public boolean UserImage() {
		return UserImg.isDisplayed(); 
	 }
}
////span[@class='oxd-userdropdown-tab']//child::img