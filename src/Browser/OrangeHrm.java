package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basic.Predefined_commands;

public class OrangeHrm {

	@Test
	void OrangeHrm_Login() {
		//login page heading
		WebDriver driver= Predefined_commands.Start("https://saylivyavhare-trials72.orangehrmlive.com/");
		SoftAssert softassert=new SoftAssert();
		driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		//username
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//password
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("5j8@hAVyZC");
		//login button
		driver.findElement(By.xpath("//div[@id='divLoginButton']")).click();
		
		//softassert.all();
		
		
		
		
		
		
		//no.of widgets (12)
		//int totalWidgets=driver.findElements(By.xpath("//div[@name='widget.name']")).size();
//softassert.assertEquals(totalWidgets,12);
//softaasert all


//to get all widgets header name
//List<WebElement> actualWidgetistElementsm =driver.findElements(By.xpath("//div[@class='widget-header']/span[2]"));
	
	}

}
