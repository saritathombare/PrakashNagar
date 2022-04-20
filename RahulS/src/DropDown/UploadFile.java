package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\SVIP\\Desktop\\test case.docx");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(text);
		

	}

}
