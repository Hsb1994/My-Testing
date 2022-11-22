package base_library1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Base_Library1 {
	
	public static WebDriver driver;
	
	public void launch_Url(String url, String browser) {
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();	
			break;
		case "mozzila":
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\firefoxdriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			break;
		default:
			System.out.println("Parameters not matched");
			break;
		}
		
	}

	@AfterTest	
	public void close() {
	driver.quit();
	}


}


