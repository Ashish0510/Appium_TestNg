package POMclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginIn {
	
	AndroidDriver driver;
	public LoginIn(AndroidDriver driver) {
		this.driver=driver;
		
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//android.widget.ImageView[@resource-id=\"com.flipkart.android:id/iv_language_image\"])[4]")
	WebElement language;
	
	public void ChooseLanguage() {
		language.click();
	}
}

