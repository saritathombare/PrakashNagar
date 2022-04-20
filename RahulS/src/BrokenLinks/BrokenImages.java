package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		
		for(WebElement image:images)
		{
			String imageSrc=image.getAttribute("src");
			
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
