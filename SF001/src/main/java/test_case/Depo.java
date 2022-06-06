package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class Depo extends Driver {
	
String baseUrl="http://salesforce.oss.com.bd/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		PageObjectModel user=new PageObjectModel();
		driver.findElement(By.id("UserName")).sendKeys("yeamin");
		driver.findElement(By.id("Password")).sendKeys("@@");
		driver.findElement(By.className("col-xs-4")).click();
 
	
}
}