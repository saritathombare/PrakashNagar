package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
	   /* // size of links
		System.out.println("Total links present on page are: " +elements.size());
				
		//print text of each link 1st method
		for(WebElement element:elements)
		{
				System.out.println(element.getText());
				System.out.println(element.getAttribute("href"));
		}*/
		
		/*
		//links on footer section
		
		List<WebElement> footerElements = driver.findElements(By.xpath("//div[@class='_2WErco row']//a"));
		
		//size of links in footer section
		System.out.println("Total links present on footer section are: " +footerElements.size());
		
		//print text of each link in footer section
		
		for(WebElement footerElement:footerElements)
		{
			System.out.println(footerElement.getText());
			System.out.println(footerElement.getAttribute("href"));
		}
		*/
		
		//print text of each link 2nd method
		
		 int count = elements.size();
		for(int i=0; i<count;i++)
		{
			System.out.println(elements.get(i).getText());
			
		}
		
		
		
		
		
		
		
	}

}
