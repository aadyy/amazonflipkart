package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageClass.Base;

public class AmazonLocator extends Base {
	
	public AmazonLocator(WebDriver ideriver) {
	driver=ideriver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"nav_a\" and contains(text(),\"Become\")]")
	public WebElement Becomeaffilates;
	@FindBy(id = "a-autoid-0-announce")
	public WebElement Signup;
	@FindBy(xpath = "//i[@class=\"a-icon a-icon-logo\"]")
	public WebElement logo;
	@FindBy(id = "createAccountSubmit")
	public WebElement createAcc;
	
	// Create Account
	@FindBy(id="ap_customer_name")
	public WebElement yourName;
	@FindBy(id="ap_email")
	public WebElement email;
	@FindBy(id="ap_password")
	public WebElement password;
	@FindBy(id="ap_password_check")
	public WebElement passwordcheck;
	@FindBy(id="continue")
	public WebElement continueButton;
	@FindBy(xpath = "//input[@id=\"cvf-input-code\"]" )
	WebElement otp;
	
	//validation
	@FindBy(xpath = "//span[contains(text(),\"Enter a valid email address\")]")
	public WebElement enterValidEmail;
	@FindBy(xpath = "//span[contains(text(),\" Passwords do not matc\")]")
	public WebElement passnotMatch;
	@FindBy(xpath = "//span[@class=\"a-list-item\"]")
	public WebElement emailAlreadyExist;
	
	

}
