package test_case;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ProductSettings extends Driver {
		
	
	
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

		//competitorproduct
		driver.get("http://salesforce.oss.com.bd/common/competitorproduct");
		
		WebElement CatID = driver.findElement(By.id("CatID"));
		Select Cat =new Select(CatID);
		Cat.selectByValue("8");
		
		WebElement SubCatID = driver.findElement(By.id("SubCatID"));
		Select SubCat =new Select(SubCatID);
		SubCat.selectByValue("12");
		
		WebElement SubCatIDD = driver.findElement(By.id("SubCatID"));
		Select SubCatIDDD =new Select(SubCatIDD);
		SubCatIDDD.selectByValue("15");
		
		driver.findElement(By.id("Password")).sendKeys("Pran Up");
		//driver.findElement(By.id("btnsave")).click();
		System.out.println("Passed-Competitor Product");
		
		
		//manufacturer
		driver.get("http://salesforce.oss.com.bd/common/manufacturer");
		System.out.println("Passed-Manufacturer");
		//Package
		driver.get("http://salesforce.oss.com.bd/common/packtype");
		System.out.println("Passed-Pack Type");
		//Enrolled Company
		driver.get("http://salesforce.oss.com.bd/common/category");
		System.out.println("Passed-Category");
		//User Registration
		driver.get("http://salesforce.oss.com.bd/common/subcategory");
		System.out.println("Passed-sub category");
		
		driver.get("http://salesforce.oss.com.bd/common/packunit");
		System.out.println("Passed-Pack unit");
		
	
	
	
	
	
	
	
	}
}