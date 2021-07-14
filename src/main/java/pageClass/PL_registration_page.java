package pageClass;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locaters.PLlocator;
import utilities.GetOtp;

public class PL_registration_page extends Base  {
	
	PLlocator pLlocator;
	String RandomMobileNumber=Base.randomMobile();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	public void pl_page() throws InterruptedException {
	pLlocator=new PLlocator(driver);
	pLlocator.pl.click();
	pLlocator.fullname.sendKeys(getPropertyFile("urlsAndData.properties", "fullname"));
	pLlocator.emailAddress.sendKeys(getPropertyFile("urlsAndData.properties", "emailAddress"));
	pLlocator.pincode.sendKeys(getPropertyFile("urlsAndData.properties", "pincode"));
	pLlocator.employmentselect.click();
	wait.until(ExpectedConditions.visibilityOf(pLlocator.salariedEmp));
	pLlocator.salariedEmp.click();
	pLlocator.companyNametext.sendKeys(getPropertyFile("urlsAndData.properties","companyNametext"));
	Thread.sleep(2000);
	pLlocator.ibmselect.click();
	pLlocator.monthlyIncometext.sendKeys(getPropertyFile("urlsAndData.properties","monthlyIncometext"));
	pLlocator.mobiletext.sendKeys(RandomMobileNumber);
	pLlocator.nextbutton.click();
	String otp=GetOtp.getOtpviaMobilenumberFun(RandomMobileNumber);
	System.out.println("OTP is:"+otp);
	wait.until(ExpectedConditions.visibilityOf(pLlocator.otptext));
	pLlocator.otptext.sendKeys(otp);
	pLlocator.ihearbycheck.click();
	pLlocator.verifybutton.click();
	driver.navigate().refresh();
	}
	

}
