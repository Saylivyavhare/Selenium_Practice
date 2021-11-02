package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Predefined_commands {

	public static WebDriver Start(String url) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
		
		

}
