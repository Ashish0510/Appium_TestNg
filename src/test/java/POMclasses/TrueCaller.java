package POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class TrueCaller {
	
	AndroidDriver driver;
	 public TrueCaller(AndroidDriver driver) {
		 this.driver=driver;
		 
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 @FindBy(id="com.truecaller:id/confirm")
	 WebElement Phonenumber;
	 
	public void contactNumber() {
		Phonenumber.click();
	}

}
