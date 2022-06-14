package scmsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class CommissionSlab extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/target/commissionslab");
		
		
		driver.findElement(By.id("MinAmount")).clear();
		driver.findElement(By.id("MinAmount")).sendKeys("100");
		
		driver.findElement(By.id("MaxAmount")).clear();
		driver.findElement(By.id("MaxAmount")).sendKeys("1000");
		
		driver.findElement(By.id("Rate")).clear();
		driver.findElement(By.id("Rate")).sendKeys("500");
		
		
		//driver.findElement(By.id("btnsave")).click();
		
		Thread.sleep(5000);

}
}
