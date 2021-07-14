package testExecution;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageClass.Base;
import pageClass.Flipkart;

public class TestFlipkart extends Base{
	
	Flipkart flip;
	@BeforeTest
	private void launchBrowser() {
	setUp(getPropertyFile("flipkart.properties", "url"));
	}
	
	@Test(priority = 1, groups = "sanity")
	private void TestFlipkartfun() {
	flip=new Flipkart();
	flip.Flipkartfun();
	}
	
	@Test(priority = 2,groups = "sanity")
	private void TestFashion() throws InterruptedException {
	flip.Electronic();
	Thread.sleep(3000);
	driver.close();
	}

}
