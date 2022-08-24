package action_tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import action_pages.Rediff_SignUP;
import base_library1.Base_Library1;

public class Rediff_SignUp_Test extends Base_Library1 {

	Rediff_SignUP ob;
	
	@BeforeTest
	public void before() {
	launch_Url("https://mail.rediff.com/cgi-bin/login.cgi");
	ob = new Rediff_SignUP();
	}
	
	@Test
	public void test1() {
		System.out.println("Title : "+ driver.getTitle());
	}
	
	@Test
	public void test2() {
		ob.signup();
	}
	
}
