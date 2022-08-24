package action_pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base_library1.Base_Library1;

public class DynaButton_Image extends Base_Library1 {
	
	public DynaButton_Image() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath ="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[8]")
	private WebElement dynamic_tab;
	
	@FindBy(xpath = "//a[contains(text(),'- images')]")
	private WebElement broken_tab; 
	
	@FindBy(xpath ="//button[@id='Enable']")
	private WebElement will_enable;
	
	@FindBy(xpath ="//button[@id='Visible']")
	private WebElement visible;

	@FindBy(xpath ="//button[@id='Change']")
	private WebElement color_change;
	
	public void check_dynamic() {
		elements.click();
		dynamic_tab.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(will_enable));
		if(will_enable.isDisplayed()) {
			System.out.println("Button is Displayed");
		}
		else {
			System.out.println("Not Displayed");
		}
		
		if(visible.isDisplayed()) {
			System.out.println("Button is visible now");
		}
		else {
			System.out.println("not visible, error in code");
		}
		
		String color = color_change.getCssValue("color");
		String hex_code = org.openqa.selenium.support.Color.fromString(color).asHex();
		System.out.println(color);
		System.out.println(hex_code);
		
		if(!hex_code.equalsIgnoreCase("#FFFFFF")) {
			System.out.println("Color Changed");
		}
		else {
			System.out.println("color Not Changed");
		}
		}
	
	public void broken_images() {
		broken_tab.click();
		int broken = 0;
		List<WebElement> list = driver.findElements(By.xpath("//div[@id = 'tab_10']/div/img"));
		for(WebElement x : list) {
//			if(x != null) {
				if(x.getAttribute("naturalWidth").equals("0")) {
					System.out.println(x.getAttribute("src") + " is a broken image. ");
					broken++;
				}
				else {
					System.out.println("Image found");
				}
//			}
//				System.out.println(x.getAttribute("src"));
		}
		System.out.println("Total Broken Images : " + broken);
	}
}
