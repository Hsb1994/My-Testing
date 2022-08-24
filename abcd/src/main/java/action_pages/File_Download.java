package action_pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_library1.Base_Library1;

public class File_Download extends Base_Library1 {
	
	public File_Download() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@download='Coka 2 - Liger.mp3']")
	private WebElement download_320KBPS;
	
	@FindBy(xpath = "//a[@class='dbutton' and @href='https://pwdown.com/113643/variation/190K/Coka 2 - Liger.mp3']")
	private WebElement download_190KBPS;
	
	@FindBy(xpath = "//a[@title='PagalWorld.PW']/img")
	private WebElement homepage;
	
	public void download() {
		
		download_320KBPS.click();
//		download_190KBPS.click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
		   System.out.println(e.toString());
		}
		homepage.click();
	}
	
}
