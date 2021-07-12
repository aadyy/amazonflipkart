package locaters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageClass.Base;

public class FlipkartLocator extends Base{
	
		public FlipkartLocator(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver, this);
		}
			
		@FindBy(xpath = "//input[@class=\"_2IX_2- VJZDxU\"]")
		public WebElement username;
		@FindBy(xpath = "//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")
		public WebElement password;
		@FindBy(xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")
		public WebElement closeUsernamePass;
		
		// Flipkart Home page
		@FindBy(xpath = "//img[@class=\"_2xm1JU\"]")
		public WebElement Flipkartlogo;
		@FindBy(xpath = "//img[@class=\"_396cs4 _3exPp9\"]")
		public WebElement fashion;
		@FindBy(xpath = "//img[@alt=\"Electronics\"]")
		public WebElement electronic;
		@FindBy(xpath = "//a[@class=\"_6WOcW9 _2-k99T\"]")
		public WebElement cameraAccessorie;
		@FindBy(xpath = "//a[contains(text(),\"Cameras & Accessories\")]")
		public WebElement cameraAccessorieList;
		
}
