package hrsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageDepartment extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/employee/department");
		
		driver.findElement(By.id("Name")).sendKeys("Technical Team");
		
		driver.findElement(By.id("Level")).sendKeys("1");
		
		System.out.println("Department");
		
		Thread.sleep(5000);
		
		driver.get("http://salesforce.oss.com.bd/employee/designation");
		
		WebElement Common_DepartmentFK = driver.findElement(By.id("Common_DepartmentFK"));
		Select Common_Department=new Select(Common_DepartmentFK);
		Common_Department.selectByValue("31");
		
		driver.findElement(By.id("Name")).sendKeys("Marketing Team");
		
		 
		WebElement Grade = driver.findElement(By.id("Grade"));
		Select Grade_employee=new Select(Grade);
		Grade_employee.selectByValue("2");
		
		driver.findElement(By.id("Priority")).sendKeys("Team");
		
		System.out.println("Designnation");
		
		
		
}
}
