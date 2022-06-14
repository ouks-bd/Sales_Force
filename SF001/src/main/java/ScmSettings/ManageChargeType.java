package ScmSettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageChargeType extends Driver {

	
String baseUrl="http://salesforce.oss.com.bd/";
	
	@Test
	public void Salesforce() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys(user.UserNameCompany);
		driver.findElement(By.id("Password")).sendKeys(user.Companypassword);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get("http://salesforce.oss.com.bd/common/chargetype");
		
		driver.findElement(By.id("Name")).sendKeys("Demo Charge");
		driver.findElement(By.id("IsPercent")).click();
		driver.findElement(By.id("Amount")).sendKeys("20");
		
		//driver.findElement(By.id("btnsave")).click();
		
		
		driver.get("http://salesforce.oss.com.bd/Common/ReturnType");
		driver.findElement(By.id("Name")).sendKeys("Demo Return");
		
		Thread.sleep(5000);
}
}