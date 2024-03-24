package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class ScreenshotUtility {
	public void takeScrenshot(AndroidDriver driver ) throws IOException  {
		 Date date = new Date();  
		    
		    String dateFormatString=date.toString().replace(" ","_").replace(":","_");
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File SrcFile = t1.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Screenshot/"+ dateFormatString+ ".png");
		FileUtils.copyFile(SrcFile, DestFile);
		
}

}
