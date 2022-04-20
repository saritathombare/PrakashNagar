package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
		
//		List<WebElement> continents=driver.findElements(By.id("condi"));
//		for(WebElement continent:continents)
//		{
//			System.out.println(continent.getText());
//		}
//		
//		System.out.println("**********************************");
		
//		WebElement languages=driver.findElement(By.id("lang"));
//		Select select = new Select(languages);
//		select.selectByIndex(3);
		
//		List<WebElement> tablea = driver.findElements(By.xpath("//table[@id='tidtb']//tr//td"));
//		for(WebElement table:tablea)
//		{
//			System.out.println(table.getText());
//		}
//		
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class='ckbcr']"));
		System.out.println(chkboxes.size());
		for(int i=0;i<chkboxes.size();i++)
		{
			WebElement chkbox = chkboxes.get(i);
			
			boolean result = chkbox.isSelected();
			if(result==true)
			{
				System.out.println("chkbox" +  i  + "is selected");
			}
			else
			{
				chkbox.click();
				System.out.println("chkbox" +  i  + "was not selected");
			}
		}
		
//		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class='ckbcr']"));
//		for(WebElement chkbox:chkboxes)
//		{
//			boolean result = chkbox.isSelected();
//			System.out.println(result);
//		}
		
		
		
//		for(WebElement Chkbox:chkboxes)
//		{
//			Thread.sleep(500);
//			Chkbox.click();
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}

}
//