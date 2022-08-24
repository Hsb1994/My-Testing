package action_tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import action_pages.File_Download;
import base_library1.Base_Library1;

public class File_Down_Test extends Base_Library1 {
	
	File_Download ob;
	
	@BeforeTest
	public void before() {
//		DesiredCapabilities cap = new DesiredCapabilities();
		launch_Url("https://www.pagalworld.pw/coka-2-liger-mp3-song/download.html");
		ob = new File_Download();
	}

	@Test
	public void download_test() {
		ob.download();

	}

}

