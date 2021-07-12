package pageClass;

import locaters.AmazonLocator;
import webActions.WebActions;

public class Amazon_Affilation extends Base{
	
	AmazonLocator amazonLoc;
	public void BecomeAffilates() throws InterruptedException {
	amazonLoc=new AmazonLocator(driver);
	WebActions.ScrollIntoView(amazonLoc.Becomeaffilates);
	Thread.sleep(4000);
	amazonLoc.Becomeaffilates.click();
	amazonLoc.Signup.click();
	
	String currentURL=driver.getCurrentUrl();
	System.out.println("Current URL is :"+ currentURL);
	boolean isDis=amazonLoc.logo.isDisplayed();
	System.out.println("Is logo displayed :"+isDis);
	amazonLoc.createAcc.click();
	
	//Create account
	amazonLoc.yourName.sendKeys(getPropertyFile("amazon.properties", "yourname"));
	amazonLoc.email.sendKeys(getPropertyFile("amazon.properties", "email"));
	amazonLoc.password.sendKeys(getPropertyFile("amazon.properties", "password"));
	amazonLoc.passwordcheck.sendKeys(getPropertyFile("amazon.properties", "passwordcheck"));
	amazonLoc.continueButton.click();
	
	


	}

}
