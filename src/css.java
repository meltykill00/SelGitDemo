import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium stuff\\chromedriver_win32 (1)\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//hit url on the broswer
		driver.get("https://www.youtube.com/");
		
		//driver.findElement(By.cssSelector()).sendKeys("pleeg I need you");
		//driver.findElement(By.xpath("//@ytd-searchbox[@id='search']")).sendKeys("pleeg I need you");
		//xpath = tagname[@attribute = 'value']
				/*
				//Css == tagname[attribute = 'value']
					div[class='identity first']
							css = [class='identify']
									xpath = //*[@class='identify first']
	*/
	}

}
