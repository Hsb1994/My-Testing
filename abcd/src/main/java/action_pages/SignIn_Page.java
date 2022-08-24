package action_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library1.Base_Library1;

public class SignIn_Page extends Base_Library1 {
	
	public SignIn_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
	private WebElement gmail;
	@FindBy(xpath = "/html/body/header/div/div/div/a[2]")
	private WebElement signin;
	@FindBy(xpath = "//*[text()='Forgot email?']")
	private WebElement forgot;
	
	public void click_mail() {
		gmail.click();
	}
	
	public void click_sign() {
		signin.click();
	}
	
	public void click_forgot() {
		forgot.click();
	}
}
	