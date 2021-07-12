package pageClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	
	public static WebDriver driver;
	static Properties prop;
	
	public static String getPropertyFile(String filename,String key) {
		File file=new File("C:\\Users\\Adityayadav\\eclipse-workspace\\sanityAndRegression\\src\\main\\java\\propertiesFile\\"+filename);
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
	}
	
	public static void setUp(String url) {
		String browser = getPropertyFile("urlsAndData.properties","browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
		driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	//#3 Randowm MobileNumber creation
	public static String randomMobile() {
		String numStart = "6161";
		Random rand = new Random();
		int d1 = rand.nextInt(10);
		int d2 = rand.nextInt(10);
		int d3 = rand.nextInt(10);
		int d4 = rand.nextInt(10);
		int d5 = rand.nextInt(10);
		int d6 = rand.nextInt(10);
		String  str1, str2, str3, str4, str5, str6;
		str1 = Integer.toString(d1);
		str2 = Integer.toString(d2);
		str3 = Integer.toString(d3);
		str4 = Integer.toString(d4);
		str5 = Integer.toString(d5);
		str6 = Integer.toString(d6);
	String	numRemaining = str1 + "" + str2 + "" + str3 + "" + str4 + "" + str5 + "" + str6 + "";
	String  numComplete = "" + numStart + "" + numRemaining + "";
	return numComplete;
	}
	
	@AfterMethod(enabled = false)
	public void tearDown() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
	}

}
