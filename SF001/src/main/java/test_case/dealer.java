package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class dealer extends Driver {
	
String baseUrl="http://salesforce.oss.com.bd/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys("julhas");
		driver.findElement(By.id("Password")).sendKeys(user.password);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get("http://salesforce.oss.com.bd/saleslead/orderlist");
		driver.get("http://salesforce.oss.com.bd/SalesLead/SalesVoucher?ChallanID=2");
		
		
		driver.findElement(By.id("ItemList_0__GivenQty")).clear();
        driver.findElement(By.id("ItemList_0__GivenQty")).sendKeys("1");
		//ItemList_0__IsSelected
        driver.findElement(By.id("ItemList_0__IsSelected")).click();
        
        //btn btn-group-sm btn-primary
        
      
      	//driver.findElement(By.name("Confirm Sale & Lock"));
      	driver.findElement(By.cssSelector("input[type='Confirm Sale & Lock']")).click();

		
		Thread.sleep(5000);

}
}
