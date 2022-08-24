package action_tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import action_pages.Login_Page;
import base_library1.Base_Library1;

import org.testng.annotations.BeforeTest;

public class Login_Page_Test extends Base_Library1 {

	Login_Page ob;
	
	@BeforeTest(groups = "smoke")
	public void before_test() {
		launch_Url("https://www.google.co.in/");
		ob = new Login_Page();
	}

	@Test(groups = "smoke")
	public void test1() {
		ob.get_title();
		
	}
}
