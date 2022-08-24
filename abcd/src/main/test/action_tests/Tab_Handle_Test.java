package action_tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import action_pages.Tab_Handle;
import base_library1.Base_Library1;

public class Tab_Handle_Test  extends Base_Library1 {

	Tab_Handle ob;
	
	@BeforeTest(groups = "smoke")
	public void before() {
		launch_Url("https://testingbaba.com/old/index.html");
		ob = new Tab_Handle();
	}
	
	@Test(groups = "smoke")
	public void new_tab() {
		ob.new_tab();
	}
	
	@Test(enabled = false)
	public void new_win() {
		ob.new_window();
//		throw new SkipException("Skipped");
	}
	
	@Test()
	public void check_win_msg() {
		ob.window_msg();
	}
}