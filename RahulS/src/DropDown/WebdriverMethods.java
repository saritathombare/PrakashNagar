package DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		//maximize browser
		driver.manage().window().maximize();
		
		//get method
		driver.get("https://www.spicejet.com/");
		
		//navigate to method
		//driver.navigate().to("https://www.spicejet.com/");
		//driver.navigate().refresh();
		
		//get current URL
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		
		//get Title of WebPage
		System.out.println(driver.getTitle());
		
		//qiut Browser
		driver.quit();

	}

}
