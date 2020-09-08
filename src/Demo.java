import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code bcause reasons! 
		//Create Driver Object
		
		
		//class name= x
		//	x driver = new x();
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\selenium stuff\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//hit url on the broswer
		driver.get("https://www.youtube.com/");
		//get title of web page
		System.out.println(driver.getTitle());
		//get url of the page enter
		System.out.println(driver.getCurrentUrl());
		//get page source
		//System.out.println(driver.getPageSource());
		
		//finding elements and doing things
	    driver.findElement(By.name("search_query")).sendKeys("Pleeg - I need you");
	    //driver.findElement(By.id("search-icon-legacy")).click();
	    driver.findElement(By.xpath("//*[@id=\'search-icon-legacy\']")).click();
	    
		//driver.navigate().to("https://www.youtube.com/watch?v=CLS2Uxxr8xk");
		//driver.navigate().back();
		//close current browser
		//driver.close();
		//close all browser from selenium
		//driver.quit();
	}

}
