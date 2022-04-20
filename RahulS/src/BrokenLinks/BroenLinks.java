package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroenLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
List<WebElement> images=driver.findElements(By.tagName("a"));
		
		System.out.println(images.size());
		
		for(WebElement image:images)
		{
			String imageSrc=image.getAttribute("href");
			
			try {
			URL url = new URL(imageSrc);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode()==200)
				System.out.println(imageSrc + ">>" + httpURLConnection.getResponseCode() );
			else
				System.err.println(imageSrc + ">>" + httpURLConnection.getResponseCode());
				
			httpURLConnection.disconnect();
			}
			catch(Exception e) 
			{
				System.err.println(imageSrc);
			}
	}
		
	}
}


