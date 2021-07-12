package webActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageClass.Base;


public class WebActions extends Base {

	 public static String CaptureScreen(WebDriver driver, String ImagesPath) {
		    TakesScreenshot oScn = (TakesScreenshot) driver;
		    File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
		    Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmm");
			String strDate = formatter.format(date);
		    File oDest = new File(System.getProperty("user.dir") + "//screenshot//Live//"+ strDate +ImagesPath + ".png");
		    try {
		        FileUtils.copyFile(oScnShot, oDest);
		    } catch (IOException e) {
		        System.out.println(e.getMessage());
		    }
		    return ImagesPath + ".png";
		}
	 
	 public static void ExplicitWait(WebElement ele) {
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(ele));	 
	}
	 
	 public static void MoveToElement(WebElement target) {
		 Actions ac=new Actions(driver);
		 ac.moveToElement(target).build().perform();
	 }
	 public static void DragAndDrop(WebElement source,WebElement target) {
		 Actions ac=new Actions(driver);
		 ac.dragAndDrop(source, target);
	}
	public void selectfun(WebElement element, int index) {
		Select sc=new Select(element);
		sc.selectByIndex(index);
	 }
	 
	public static void switchWindow() {
	} 
	 
	public static void ListFun(String xpath) {
		List<WebElement> list= driver.findElements(By.xpath(xpath));
		String text="";
		int size=list.size();
		System.out.println("Number of elements in List are : "+size);
		for (int i = 0; i < size; i++) {
		text=list.get(i).getText();
		System.out.println("Elements are:"+text);
		}
		}
	
	public static void ScrollIntoView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	 	
	 
}
