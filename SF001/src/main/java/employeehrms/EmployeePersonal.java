package employeehrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class EmployeePersonal  extends Driver{
	
	
String baseUrl="https://sf.bdbizhub.com/";
	
	@Test
	public void Salesforce() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys(user.personalname);
		driver.findElement(By.id("Password")).sendKeys(user.personalpassword);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get("https://sf.bdbizhub.com/Home/Index");
		
		
		Thread.sleep(5000);
		
	}
}
