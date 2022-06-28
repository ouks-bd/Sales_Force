package configuration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class PackType extends Driver {
		
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
		
		driver.get("http://salesforce.oss.com.bd/common/packtype");
		driver.findElement(By.id("Name")).sendKeys("Test-Demo");
		
		//driver.findElement(By.id("btnsave")).click();
		
		//need to add delete button
		Thread.sleep(5000);
}
}