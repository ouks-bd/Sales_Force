package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;


public class SalesRepresentive extends Driver{

	
String baseUrl="http://salesforce.oss.com.bd/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		driver.findElement(By.id("Password")).sendKeys(user.password);
		driver.findElement(By.className("col-xs-4")).click();
		
		
		
		driver.get("http://salesforce.oss.com.bd/SalesLead/index");
		driver.get("http://salesforce.oss.com.bd/SalesLead/UserShops");
		driver.get("http://salesforce.oss.com.bd/SalesLead/OrderBooking?ShopID=20&RouteID=9");
		
		
//		driver.findElement(By.id("DataList_0__Quantity")).sendKeys("50");
//		driver.findElement(By.id("DataList_1__Quantity")).sendKeys("50");
//		driver.findElement(By.id("DataList_2__Quantity")).sendKeys("150");
//		driver.findElement(By.id("DataList_3__Quantity")).sendKeys("250");
//		driver.findElement(By.id("DataList_4__Quantity")).sendKeys("350");
//		driver.findElement(By.id("DataList_5__Quantity")).sendKeys("100");
//		driver.findElement(By.id("DataList_6__Quantity")).sendKeys("10");
//		driver.findElement(By.id("DataList_7__Quantity")).sendKeys("20");
//		driver.findElement(By.id("DataList_8__Quantity")).sendKeys("25");
//		driver.findElement(By.id("DataList_9__Quantity")).sendKeys("35");
//		driver.findElement(By.id("DataList_10__Quantity")).sendKeys("5");
//		driver.findElement(By.id("DataList_11__Quantity")).sendKeys("8");
//		driver.findElement(By.id("DataList_12__Quantity")).sendKeys("12");
//		driver.findElement(By.id("DataList_13__Quantity")).sendKeys("32");
//		driver.findElement(By.id("DataList_14__Quantity")).sendKeys("2");
//		driver.findElement(By.id("DataList_15__Quantity")).sendKeys("3");
//		driver.findElement(By.id("DataList_16__Quantity")).sendKeys("4");
//		driver.findElement(By.id("DataList_17__Quantity")).sendKeys("9");
//		System.out.println("Item Add Passed");
		
		
		
		driver.findElement(By.name("itemList[0].Quantity")).clear();
        driver.findElement(By.name("itemList[0].Quantity")).sendKeys("1");
        
        driver.findElement(By.name("itemList[1].Quantity")).clear();
        driver.findElement(By.name("itemList[1].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[2].Quantity")).clear();
        driver.findElement(By.name("itemList[2].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[3].Quantity")).clear();
        driver.findElement(By.name("itemList[3].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[4].Quantity")).clear();
        driver.findElement(By.name("itemList[4].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[5].Quantity")).clear();
        driver.findElement(By.name("itemList[5].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[6].Quantity")).clear();
        driver.findElement(By.name("itemList[6].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[7].Quantity")).clear();
        driver.findElement(By.name("itemList[7].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[8].Quantity")).clear();
        driver.findElement(By.name("itemList[8].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[9].Quantity")).clear();
        driver.findElement(By.name("itemList[9].Quantity")).sendKeys("5");
        
        driver.findElement(By.name("itemList[10].Quantity")).clear();
        driver.findElement(By.name("itemList[10].Quantity")).sendKeys("5");
        
        Thread.sleep(5000);
		
		driver.get("http://salesforce.oss.com.bd/SalesLead/BookingOrderList");
		
		
		Thread.sleep(5000);
}
}
