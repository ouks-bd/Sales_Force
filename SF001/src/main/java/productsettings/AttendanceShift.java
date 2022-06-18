package productsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class AttendanceShift extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/attendance/shift");
		
		driver.findElement(By.id("ShiftName")).sendKeys("Evening");
		driver.findElement(By.id("DeductionTime")).sendKeys("60");
		
		driver.findElement(By.id("ToleranceTime")).clear();
		driver.findElement(By.id("ToleranceTime")).sendKeys("30");
		
		System.out.println("Passed");
		Thread.sleep(5000);
		
		
	

}
}
