package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class Company extends Driver{

	
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
		
		//user
		driver.get("http://salesforce.oss.com.bd/common/basicuser");
		System.out.println("Passed-User");
		//Manage Menu
		driver.get("http://salesforce.oss.com.bd/account/menu");
		System.out.println("Passed-Manage Menu");
		//Role
		driver.get("http://salesforce.oss.com.bd/account/role");
		System.out.println("Passed-Role");
		//Package
		driver.get("http://salesforce.oss.com.bd/account/package");
		System.out.println("Passed-Package");
		//Enrolled Company
		driver.get("http://salesforce.oss.com.bd/account/register");
		System.out.println("Passed-Enrolled Company");
		//User Registration
		driver.get("http://salesforce.oss.com.bd/account/userregister");
		System.out.println("Passed-User Registration");
		
		//Company 
		driver.get("http://salesforce.oss.com.bd/account/baseregister");
		
		
		driver.findElement(By.id("Email")).sendKeys("Emrul@oss.com.bd");
		driver.findElement(By.id("Mobile")).sendKeys("01955560320");
		driver.findElement(By.id("txtPassword")).sendKeys("Wer54@#");
		driver.findElement(By.id("txtConfirmPassword")).sendKeys("Wer54@#");
		
		WebElement District = driver.findElement(By.id("CommonDistrictFK"));
		Select SelectDistrict =new Select(District);
		SelectDistrict.selectByValue("40");
		Thread.sleep(2000);
		
		
		System.out.println("Passed-Company ");
		
		Thread.sleep(5000);
		driver.get("");
		driver.get("");
		
}
}