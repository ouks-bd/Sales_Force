package scmsettings;

import java.time.Duration;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageSupplier extends Driver {
	
	String baseUrl="https://sf.bdbizhub.com/";
	
	@Test
	public void Salesforce() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys(user.UserNameCompany);
		driver.findElement(By.id("Password")).sendKeys(user.Companypassword);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get("http://salesforce.oss.com.bd/common/supplier");
		
		driver.findElement(By.id("Name")).sendKeys("Romo Beverage	");
		driver.findElement(By.id("ContactNo")).sendKeys("01898989898");
		driver.findElement(By.id("Email")).sendKeys("demo@beacontechbd.com");
		driver.findElement(By.id("Address")).sendKeys("1st floor, Aprt # C-1 known as WESTERLIES APARTMENT, "
				+ "House # 35, Road "
				+ "# 28 (Old), 15 (New), Dhanmondi R/A, Dhaka-1209.");
		driver.findElement(By.id("Remarks")).sendKeys("Just For Test");
		
		//driver.findElement(By.id("btnsave")).click();
		Thread.sleep(5000);
	}
}
