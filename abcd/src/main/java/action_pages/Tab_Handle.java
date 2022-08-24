package action_pages;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_library1.Base_Library1;

public class Tab_Handle extends Base_Library1{
	
	public Tab_Handle() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@href='#tab_11']")
	private WebElement window_tab;
	
	@FindBy(xpath ="//div[@id='tab_11']/div[1]/a")
	private WebElement new_tab;
	
	@FindBy(xpath ="//div[@id='tab_11']/div[2]/a")
	private WebElement new_win;
	
	@FindBy(xpath ="//div[@id='tab_11']/div[3]/a")
	private WebElement win_msg;
	
	public void new_tab() {
		String parent_win = driver.getWindowHandle();
		String child_win = "";
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[text() = 'Practice']")).click();
		driver.findElement(By.xpath("//button[@data-target='#alerts']")).click();
		window_tab.click();
		new_tab.click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println("Handle :"+handle);
		ArrayList<String> list = new ArrayList<String>();
		for (String x : handle) {
			list.add(x);
		}
		System.out.println("Array_List : "+list);
		String child = list.get(1);
		System.out.println("Parent Tab : "+parent_win);
		System.out.println("Child Tab : "+child);
//		for (String h : handle) {
//			if(!h.equalsIgnoreCase(parent_win)) {
//				child_win = h; 
//			}
//		}
		driver.switchTo().window(child);
		driver.navigate().to("http://www.facebook.com");
		System.out.println("Title is : "+ driver.getTitle());
		driver.switchTo().window(parent_win);
		System.out.println("Parent Title is : "+ driver.getTitle());
	}

	public void new_window() {
		String parent_win = driver.getWindowHandle();
		String child_win = "";
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[text() = 'Practice']")).click();
		driver.findElement(By.xpath("//button[@data-target='#alerts']")).click();
		window_tab.click();
//		new_tab.click();
		new_win.click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println("Handle :"+handle);
		ArrayList<String> list = new ArrayList<String>(handle);
		System.out.println("Array_List : "+list);
		String child = list.get(1);
		System.out.println("Parent Tab : "+parent_win);
		System.out.println("Child Tab : "+child);
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.facebook.com");
		System.out.println("Title is : "+ driver.getTitle());
		driver.switchTo().window(parent_win);
		System.out.println("Parent Title is : "+ driver.getTitle());
	}
	
	public void window_msg() {
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[text() = 'Practice']")).click();
		driver.findElement(By.xpath("//button[@data-target='#alerts']")).click();
		window_tab.click();
		win_msg.click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println("Handle :"+handle);
		ArrayList<String> list = new ArrayList<String>();
		for (String x : handle) {
			list.add(x);
		}
		System.out.println("Array_List : "+list);
		String parent_win = list.get(0);
		String child_win = list.get(1);
		System.out.println("Parent Tab : "+parent_win);
		System.out.println("Child Tab : "+child_win);
		driver.switchTo().window(child_win);
		driver.manage().window().maximize();
		String check = driver.findElement(By.xpath("//body/p/text()")).getText();
		System.out.println(check);
	}
}
