package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVIP\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> mobiles=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(mobiles.size());
		
		
		//Advanced for loop
//		for(WebElement mobile:mobiles)
//		{
//			System.out.println(mobile.getText());		
//		}
		
		
		//Simple for loop
//		for(int i=0;i<mobiles.size();i++)
//		{
//			System.out.println(mobiles.get(i).getText());
//		}
		
		
		//Iterator
		Iterator<WebElement> itr = mobiles.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
		
		

	}

}
