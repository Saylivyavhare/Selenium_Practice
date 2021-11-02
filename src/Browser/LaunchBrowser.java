package Browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import basic.Predefined_commands;
public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=Predefined_commands.Start("https://www.myntra.com");
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.myntra.com");
		//driver.get("https://www.browserstack.com/");
		//driver.findElement(By.id("signupModalButton")).click(); //using Selenium click button method
		// driver.get("https://www.google.com");
		
		
		// driver.switchTo().alert().dismiss();
	
		// System.out.println(driver.getPageSource());
		
		//Navigation commands
		driver.navigate().to("https://www.myntra.com");
		//driver.navigate().to(new URL("https://www.amazon.com"));//open new url
		//driver.navigate().forward(); ///move forward
		//driver.navigate().back(); //move bacj to previous webpage
		//Thread.sleep(2000);
		//driver.navigate().refresh();

		
		int input=1;
		driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='+input+']"));
		
		
		
		driver.quit();

	}

}
