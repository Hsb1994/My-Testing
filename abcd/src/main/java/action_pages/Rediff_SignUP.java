package action_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_library1.Base_Library1;

public class Rediff_SignUP extends Base_Library1 {
	
	public Rediff_SignUP() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Create a new account']")
	private WebElement create;
	
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	private WebElement name;
	
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	private WebElement id;
	
	@FindBy(xpath = "//*[@id=\"newpasswd\"]")
	private WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"newpasswd1\"]")
	private WebElement repass;
	
	@FindBy(xpath = "//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")
	private WebElement alt_id;
	
	@FindBy(xpath = "//*[@id=\"mobno\"]")
	private WebElement mobile;
	
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")
	private WebElement day;

	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")
	private WebElement month;
	
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")
	private WebElement year;
	
	@FindBy(xpath = "//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input")
	private WebElement cap;
	
	@FindBy(xpath = "//*[@id=\"Register\"]")
	private WebElement submit;
	
	public void signup() {
		
		create.click();
		name.click();
		name.sendKeys("Hemant Singh Bisht");
		id.sendKeys("bisht.hemant3");
		pass.sendKeys("Hsbbisht@10");
		repass.sendKeys("Hsbbisht@10");
		alt_id.sendKeys("hsb.bisht@facebook.com");
		mobile.sendKeys("7895569994");
		day.sendKeys("28");
		month.sendKeys("SEP");
		year.sendKeys("1994");
		city.sendKeys("Delhi");
		cap.sendKeys("ED3Q");
		submit.click();
		
	}
}

