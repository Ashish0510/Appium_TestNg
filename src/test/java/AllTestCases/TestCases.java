package AllTestCases;

import org.testng.annotations.Test;

import POMclasses.LoginIn;
import POMclasses.TrueCaller;

public class TestCases extends BaseClass {
	
	@Test
	public void Testcase1() throws InterruptedException {
		LoginIn log=new LoginIn(driver);
		log.ChooseLanguage();
		 logger.info("Language has been choosed");
		Thread.sleep(5000);
		 logger.info("waiting for the phonenumber");
		TrueCaller caller =new TrueCaller(driver);
		caller.contactNumber();
		 logger.info("phonenumber has been submitted");
	}
	
	public void TestCase222() {
		logger.info ("testcases second is running ");
	}
	
	public void TestCase223() {
		logger.info ("testcases third is running ");
	}
	
	public void TestCase224() {
		logger.info ("testcases third is running ");
	}
	
	
	
}
