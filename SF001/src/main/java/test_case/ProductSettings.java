package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ProductSettings extends Driver {
		
	
	
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

	
		driver.get("http://salesforce.oss.com.bd/common/competitorproduct");
		System.out.println("Passed-Competitor Product");
		//Role
		driver.get("http://salesforce.oss.com.bd/common/manufacturer");
		System.out.println("Passed-Manufacturer");
		//Package
		driver.get("http://salesforce.oss.com.bd/common/packtype");
		System.out.println("Passed-Pack Type");
		//Enrolled Company
		driver.get("http://salesforce.oss.com.bd/account/register");
		System.out.println("Passed-Enrolled Company");
		//User Registration
		driver.get("http://salesforce.oss.com.bd/account/userregister");
		System.out.println("Passed-User Registration");
		
	
	
	
	
	
	
	
	}
}