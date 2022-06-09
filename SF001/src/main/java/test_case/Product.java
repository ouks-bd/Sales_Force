package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class Product extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/common/product");
		
		WebElement CatID = driver.findElement(By.id("CatID"));
		Select Cat =new Select(CatID);
		Cat.selectByValue("8");
		
		WebElement SubCatID = driver.findElement(By.id("SubCatID"));
		Select SubCat =new Select(SubCatID);
		SubCat.selectByValue("13");
		
		WebElement Common_Manufacturer = driver.findElement(By.id("Common_ManufacturerFK"));
		Select Common_ManufacturerFK =new Select(Common_Manufacturer);
		Common_ManufacturerFK.selectByValue("7");
		
		driver.findElement(By.id("PackPcs")).sendKeys("24");
		
		WebElement UnitFK = driver.findElement(By.id("UnitFK"));
		Select Unit =new Select(UnitFK);
		Unit.selectByValue("4");
		
		
		
		
		

}
}

