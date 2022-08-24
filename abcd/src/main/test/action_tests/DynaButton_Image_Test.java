package action_tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import action_pages.DynaButton_Image;
import base_library1.Base_Library1;

public class DynaButton_Image_Test extends Base_Library1 {
	
	DynaButton_Image ob;
	
	@BeforeTest
	public void before() {
		launch_Url("https://testingbaba.com/old/index.html");
		ob = new DynaButton_Image();
		driver.findElement(By.xpath("//*[. = '×']")).click();
		driver.findElement(By.xpath("//*[.='Practice']")).click();
		
	}
	
	@Test(priority = 0)
	public void check_dynamic() {
		ob.check_dynamic();
	}
	
	@Test(priority = 1)
	public void broken_image() {
		ob.broken_images();
	}

}

