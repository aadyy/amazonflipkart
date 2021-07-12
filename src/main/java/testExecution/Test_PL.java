package testExecution;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageClass.Base;
import pageClass.PL_registration_page;

public class Test_PL extends Base {
	
	PL_registration_page pl_reg;
	
	@BeforeTest
	private void launchBrowser() {
	setUp(getPropertyFile("urlsAndData.properties", "url"));
	}
	
	@Test(priority = 1,groups = "sanity")
	public void testing_PL() throws InterruptedException {
	pl_reg=new PL_registration_page();
	pl_reg.pl_page();
	}

}
