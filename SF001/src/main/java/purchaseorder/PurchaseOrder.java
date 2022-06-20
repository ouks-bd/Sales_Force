package purchaseorder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class PurchaseOrder extends Driver  {
	
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
		
		driver.get("http://salesforce.oss.com.bd/order/receive");
		
		
		WebElement SupplierFK = driver.findElement(By.id("SupplierFK"));
		Select Supplier=new Select(SupplierFK);
		Supplier.selectByValue("8");
		
		driver.findElement(By.id("Code")).sendKeys("Challan 0011");
		driver.findElement(By.id("OrderNo")).sendKeys("PO2022-001");
		driver.findElement(By.id("PINo")).sendKeys("00909");
		driver.findElement(By.id("Remarks")).sendKeys("Automation Test");
		
		Thread
		
		
		
		
		
		
		

}
}