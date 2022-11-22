package action_tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import action_pages.SignIn_Page;
import base_library1.Base_Library1;
import prop_utility.Prop_utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SignIn_Test extends Base_Library1 {
	
	SignIn_Page ob;

	@Parameters({"val","browser"})
	@BeforeTest
	public void before(String val, String browser) {
		launch_Url(Prop_utility.get_prop_data(val), browser);
		ob = new SignIn_Page();
	}
	
	@Test (priority = 0)                       // (threadPoolSize = 1, invocationCount = 2)
	public void test_signIn() {
		ob.click_mail();
		driver.navigate().back();
	}
	
//	@Test  (priority = 1)
//	public void test_forgot() {
//		ob.click_mail();
//		ob.click_sign();
//		ob.click_forgot();
//	}
	
	
}

