package pageClass;

import locaters.PLlocator;

public class PL_registration_page extends Base  {
	
	PLlocator pLlocator;
	String RandomMobileNumber=Base.randomMobile();
	public void pl_page() throws InterruptedException {
	pLlocator=new PLlocator(driver);
	pLlocator.pl.click();
	PLlocator.fullname.sendKeys(getPropertyFile("urlsAndData.properties", "fullname"));
	PLlocator.emailAddress.sendKeys(getPropertyFile("urlsAndData.properties", "emailAddress"));
	PLlocator.pincode.sendKeys(getPropertyFile("urlsAndData.properties", "pincode"));
	PLlocator.employmentselect.click();
	Thread.sleep(3000);	
	PLlocator.salariedEmp.click();
	PLlocator.companyNametext.sendKeys(getPropertyFile("urlsAndData.properties","companyNametext"));
	Thread.sleep(4000);
	PLlocator.ibmselect.click();
	PLlocator.monthlyIncometext.sendKeys(getPropertyFile("urlsAndData.properties","monthlyIncometext"));
	PLlocator.mobiletext.sendKeys(RandomMobileNumber);
	PLlocator.nextbutton.click();
	
	

	}
	

}
