package AllTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import Utility.ReadPropertyFile;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	protected static AndroidDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void LaunchApp() throws MalformedURLException, InterruptedException {
		ReadPropertyFile Link=new ReadPropertyFile();
		      String Baseurl = Link.getBaseUrl();
		DesiredCapabilities caps=new DesiredCapabilities();
		
		
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion","13");
		caps.setCapability("automationName","Uiautomator2");
		caps.setCapability("appPackage","com.flipkart.android");
		caps.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		logger = LogManager.getLogger(BaseClass.class.getName());
		 driver=new AndroidDriver(new URL(Baseurl),caps);
		 Thread.sleep(10000);
		 
	}

}
