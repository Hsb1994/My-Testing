package action_tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import action_pages.File_Download;
import base_library1.Base_Library1;

public class File_Down_Test extends Base_Library1 {
	
	File_Download ob;
	
	@Parameters({"val","browser"})
	@BeforeTest
	public void before(String val, String browser) {
		launch_Url(val, browser);
		ob = new File_Download();
	}

	@Test
	public void download_test() {
		ob.download();

	}

}

