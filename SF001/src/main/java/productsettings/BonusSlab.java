package productsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class BonusSlab extends Driver {

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
		
		driver.get("http://salesforce.oss.com.bd/payroll/bonusslab");
		
		driver.findElement(By.id("MinMonth")).sendKeys("5");
		
		driver.findElement(By.id("MaxMonth")).sendKeys("12");
		
		WebElement CalculateTypeID = driver.findElement(By.id("CalculateTypeID"));
		Select CalculateType=new Select(CalculateTypeID);
		CalculateType.selectByValue("1");
		
		driver.findElement(By.id("Rate")).sendKeys("500");
		
		System.out.println("Passed");
		
		
		Thread.sleep(5000);
		
	}
}
