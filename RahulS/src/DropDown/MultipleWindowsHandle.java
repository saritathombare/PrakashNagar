package DropDown;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
		
		//using while loop 
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		Iterator<String> it= addr.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getCurrentUrl());
		}
		
		
		
		
		
		
		/*driver.getWindowHandles();
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		confirm.click();
		prompt.click();
		line.click();
		
		String mainPage = driver.getWindowHandle();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());*/
		
		
		
		
		
		
		
		
		
	}

}
