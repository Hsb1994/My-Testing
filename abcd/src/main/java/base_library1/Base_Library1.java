package base_library1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import bsh.Capabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Library1 {
	
	public static WebDriver driver;
	
	public void launch_Url(String url) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@AfterTest	
	public void close() {
	driver.quit();
	}
}


