package testExecution;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClass.Amazon_Affilation;
import pageClass.Base;

public class Test_Amazon extends Base{
	
	Amazon_Affilation amobj;
	@BeforeTest
	public void LaunchBrowser() {
	setUp(getPropertyFile("amazon.properties", "url"));
	}
	
	@Test(priority = 1)
	private void Test_amazon() throws InterruptedException {
	amobj=new Amazon_Affilation();
	amobj.BecomeAffilates();
	}
	
	@AfterTest(enabled = true)
	private void QuitBrowser() throws InterruptedException {
	Thread.sleep(4000);
	driver.close();
	}


}
