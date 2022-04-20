package DropDown;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size();i++)
		{
			String value = links.get(i).getAttribute("href");
			if(value==null)
			{
				System.out.println("The link is broken");
			}
			else 
			{
				System.out.println("The link is not broken");
			}
			
			
			
			
			
			
			
			
			
			
			/*WebElement element= links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			httpconn.connect();
			int rescode=httpconn.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url + "-" + "is broken link");
			}
			else
			{
				System.out.println(url + "-" + "is valid link");
			}*/
		}
		
		
	}

}
