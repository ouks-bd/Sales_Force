package configuration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class SubCategory extends Driver{
	
	
	
	@Test
	public void Salesforce() throws InterruptedException {
		
		PageObjectModel user=new PageObjectModel();
		
		driver.get(user.BaseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		
		driver.findElement(By.id("UserName")).sendKeys(user.UserNameCompany);
		driver.findElement(By.id("Password")).sendKeys(user.Companypassword);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get(user.SubCategory);
		
		WebElement Common_CategoryFK = driver.findElement(By.id("Common_CategoryFK"));
		Select Common_Category =new Select(Common_CategoryFK);
		Common_Category.selectByValue("8");
		
		driver.findElement(By.id("Name")).sendKeys("Test-Demo");
		//driver.findElement(By.id("btnsave")).click();
		Thread.sleep(5000);
	}
}
