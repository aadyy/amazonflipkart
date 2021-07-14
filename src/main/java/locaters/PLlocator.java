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
	public  WebElement fullname;
	@FindBy(id = "email")
	public  WebElement emailAddress;
	@FindBy(id = "pincode")
	public  WebElement pincode;
	@FindBy(id = "employment")
	public  WebElement employmentselect;
	@FindBy(id = "div_employment_type")
	public  WebElement salariedEmp;
	@FindBy(id = "self-emp")
	public  WebElement selfEmp;
	@FindBy(id = "self-emp1")
	public  WebElement selfEmpDRCA;
	@FindBy(id = "companyName")
	public  WebElement companyNametext;
	
	@FindBy(id = "a_loc1")
	public  WebElement ibmselect;
	@FindBy(id = "monthlyIncome")
	public  WebElement monthlyIncometext;
	@FindBy(id = "mobile")
	public  WebElement mobiletext;
	@FindBy(id = "li_submit")
	public  WebElement nextbutton;
	@FindBy(id = "txt_otp")
	public  WebElement otptext;
	@FindBy(id = "control-indicator")
	public  WebElement ihearbycheck;
	@FindBy(id = "btn_mobile_verify")
	public  WebElement verifybutton;
	
	
	
	
	
 
		
	

}
