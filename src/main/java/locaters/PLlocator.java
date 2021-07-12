package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageClass.Base;

public class PLlocator extends Base{
	
	public PLlocator(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver,this);
	}
	//PL form locators
	@FindBy(xpath = "//a[@class=\"nav-link\" and contains(text(),\"Personal Loan\")]")
	public WebElement pl;
	@FindBy(id = "li_display_name")
	public static WebElement fullname;
	@FindBy(id = "email")
	public static WebElement emailAddress;
	@FindBy(id = "pincode")
	public static WebElement pincode;
	@FindBy(id = "employment")
	public static WebElement employmentselect;
	@FindBy(id = "div_employment_type")
	public static WebElement salariedEmp;
	@FindBy(id = "self-emp")
	public static WebElement selfEmp;
	@FindBy(id = "self-emp1")
	public static WebElement selfEmpDRCA;
	@FindBy(id = "companyName")
	public static WebElement companyNametext;
	
	@FindBy(id = "a_loc1")
	public static WebElement ibmselect;
	@FindBy(id = "monthlyIncome")
	public static WebElement monthlyIncometext;
	@FindBy(id = "mobile")
	public static WebElement mobiletext;
	@FindBy(id = "li_submit")
	public static WebElement nextbutton;
	@FindBy(id = "txt_otp")
	public static WebElement otptext;
	@FindBy(id = "control-indicator")
	public static WebElement ihearbycheck;
	@FindBy(id = "btn_mobile_verify")
	public static WebElement verifybutton;
	
	
	
	
	
 
		
	

}
