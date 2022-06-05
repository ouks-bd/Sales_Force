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
		driver.findElement(By.id("UserName")).sendKeys("info@romofood.com");
		driver.findElement(By.id("Password")).sendKeys("@@");
		driver.findElement(By.className("col-xs-4")).click();
		
		
		driver.get("http://salesforce.oss.com.bd/Common/Shop");
		
		driver.findElement(By.id("Name")).sendKeys("Kader Enterprise");
		driver.findElement(By.id("Owner")).sendKeys("kader");
		driver.findElement(By.id("RegistrationNo")).sendKeys("6894468943");
		driver.findElement(By.id("ContactPerson")).sendKeys("Kader mia");
		driver.findElement(By.id("ContactNumber")).sendKeys("0187300688");
		
		
	
		WebElement District = driver.findElement(By.id("DistrictFK"));
		Select SelectDistrict =new Select(District);
		SelectDistrict.selectByValue("40");
		Thread.sleep(2000);
		
		
		WebElement ThanaFK = driver.findElement(By.id("ThanaFK"));
		Select Thana =new Select(ThanaFK);
		Thana.selectByValue("24");
		Thread.sleep(2000);
		
		//col-lg-12
		
		//driver.findElement(By.className("col-lg-12")).click();
		driver.findElement(By.id("btnsave")).click();
		
		driver.get("http://salesforce.oss.com.bd/Common/Shop");
		Thread.sleep(2000);
	
	
}
}
