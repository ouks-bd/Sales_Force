package supplychain;

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
		
		driver.get("http://salesforce.oss.com.bd/order/receivelist");
		driver.get("http://salesforce.oss.com.bd/Order/Receive/49");
		
		 
		WebElement ProductFK = driver.findElement(By.id("ProductFK"));
		Select Product=new Select(ProductFK);
		Product.selectByValue("16");
		
		
		driver.findElement(By.id("UnitRate")).clear();
		driver.findElement(By.id("UnitRate")).sendKeys("Challan 0011");
		driver.findElement(By.id("Quantity")).clear();
		driver.findElement(By.id("Quantity")).sendKeys("10000");
		
		
		WebElement UnitFK = driver.findElement(By.id("UnitFK"));
		Select Unit=new Select(UnitFK);
		Unit.selectByValue("8");
		
		Thread.sleep(5000);
			
}
}