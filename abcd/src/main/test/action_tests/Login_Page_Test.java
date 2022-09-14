package action_tests;
import org.testng.annotations.Test;
import action_pages.Login_Page;
import base_library1.Base_Library1;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Login_Page_Test extends Base_Library1 {

	Login_Page ob;

	@Parameters({"val","browser"})
	@BeforeTest
	public void before(String val, String browser) {
		launch_Url(val, browser);
		ob = new Login_Page();
	}

	@DataProvider(name = "dp")
	public Object[][] data_pro ( Method m){
		
		switch (m.getName()) {
		case "test2" :
			return new Object[][] {{"Hemant"},{"Singh"}};	
			
		case "test3" :
			return new Object[][] {{2,3,5}, {2,3,6}};
			
		case "test4" :
			return new Object[][] {{'H'},{'S'},{'B'}};
		}
		return null;
	}
	
	@Test(groups = "smoke")
	public void test1 () {
		ob.get_title();
		
	}
	
	@Test(dataProvider = "dp")
	public void test2 (String s) {
		System.out.println(s);
	}
	
	@Test(dataProvider = "dp")
	public void test3 (int a, int b, int total) {
		int sum = a+b;
		assertEquals(total, sum);
	}
	
	@Test(dataProvider = "dp")
	public void test4 (char c) {
		System.out.println(c);
	}
	
}
