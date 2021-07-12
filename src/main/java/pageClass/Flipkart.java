package pageClass;

import locaters.FlipkartLocator;
import webActions.WebActions;

public class Flipkart extends Base{
	
	FlipkartLocator flip;
	public void Flipkartfun() {
	flip=new FlipkartLocator(driver); 
	flip.username.sendKeys(getPropertyFile("flipkart.properties", "username"));
	flip.closeUsernamePass.click();
	boolean isdisplay=flip.Flipkartlogo.isDisplayed();
	System.out.println("yes Logo is displaye "+isdisplay);
	WebActions.ListFun("//div[@class=\"eFQ30H\"]");
	WebActions.ListFun("//span[@class=\"_2oyLgr\"]");
	}
	
	public void Electronic() throws InterruptedException {
	WebActions.MoveToElement(flip.electronic);
	WebActions.ListFun("//a[@class=\"_6WOcW9\"]");
	Thread.sleep(3000);
	WebActions.ListFun("//a[@class=\"_6WOcW9 _3YpNQe\"]");
	

	}
	
	
	
	

}
