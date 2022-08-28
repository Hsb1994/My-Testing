package base_library1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Base_Library1 {
	
	public static WebDriver driver;
	
	public void launch_Url(String url) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@AfterTest	
	public void close() {
	driver.quit();
	}
}


