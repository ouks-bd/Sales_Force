package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class Shop extends Driver{
	
String baseUrl="http://salesforce.oss.com.bd/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys("sobuj");
		driver.findElement(By.id("Password")).sendKeys(user.password);
		driver.findElement(By.className("col-xs-4")).click();
		
		
		driver.get("http://salesforce.oss.com.bd/Common/Shop");
		
		driver.findElement(By.id("Name")).sendKeys("sobuj");
		driver.findElement(By.id("Owner")).sendKeys("sobuj");
		driver.findElement(By.id("RegistrationNo")).sendKeys("sobuj");
		driver.findElement(By.id("ContactPerson")).sendKeys("sobuj");
		driver.findElement(By.id("ContactNumber")).sendKeys("sobuj");
		
		
		
		WebElement District = driver.findElement(By.id("DistrictFK2"));
		Select SelectDistrict =new Select(District);
		SelectDistrict.selectByValue("40");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ThanaFK")).sendKeys("sobuj");
		
		driver.findElement(By.id("btnsave")).click();
		
	
	
}
}
