package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_launch {

	//public static void main(String[] args) throws InterruptedException {
     @Test(invocationCount=2)
   void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		element.click();
         Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sayli");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vyavhare");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Sayli@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Sayli@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sayli@1234");
		
		
		WebElement birthdayElement=driver.findElement(By.xpath("//select[@title='Day']"));
		Select birthdaySelect=new Select(birthdayElement);
		birthdaySelect.selectByVisibleText("13");
		Select selectBirthDayMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selectBirthDayMonth.selectByVisibleText("Sep");
		Select selectBirthDayYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		selectBirthDayYear.selectByVisibleText("1996");
		System.out.println("Completed");

		driver.close();
	}

}
