package scmsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageInvoicePad extends Driver {
	
	
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
		
		driver.get("http://salesforce.oss.com.bd/common/company");
		
		driver.findElement(By.id("Name")).sendKeys("Test-Demo");
		driver.findElement(By.id("ContactNo")).sendKeys("01777878987");
		driver.findElement(By.id("Address")).sendKeys("sector 13 uttora dhaka");
		driver.findElement(By.id("Email")).sendKeys("demo@becontechbd.com");
		driver.findElement(By.id("WebAddress")).sendKeys("www.beaconerp.com");
		
		driver.findElement(By.id("Remarks")).sendKeys("Test-company");
		//driver.findElement(By.id("btnsave")).click();
		
		Thread.sleep(5000);

}
}
