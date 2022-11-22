package action_tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import action_pages.Rediff_SignUP;
import base_library1.Base_Library1;

public class Rediff_SignUp_Test extends Base_Library1 {

	Rediff_SignUP ob;

	@Parameters({"val","browser"})
	@BeforeTest(groups = {"smoke","sanity"})
	public void before(String val, String browser) {
		launch_Url(val, browser);
	ob = new Rediff_SignUP();
	}
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Title : "+ driver.getTitle());
	}
	
	@Test(groups = "sanity")
	public void test2() {
		ob.signup();
	}
	
}
