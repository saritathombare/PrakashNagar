package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		
	//Dropdown with select tag
		
		WebElement staticDropdown = driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
		Select select = new Select(staticDropdown);
		List <WebElement> list = driver.findElements(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
		System.out.println(list.size());
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("USD");
		System.out.println(select.getFirstSelectedOption().getText()); 
		
		// Dropdown add passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1; i<5; i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Handle Dynamic Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class='search_options_menucontentbg'] //a[@value='ATQ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//Autosuggestive Dropdown
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
		for(WebElement option:options)
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
			
			
		
		//Handeling Checkbox
		driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]"));
		boolean result = checkbox.isSelected();
		if(result) 
		{
			System.out.println("checkbox is already selected");
		}
		else 
		{
			System.out.println("ckeckbox was not selected");
			checkbox.click();
		}
		
		
		//
		
		
		
		
		 
	
		//https://www.globalsqa.com/demo-site/select-dropdown-menu/
		
		
	}


}
