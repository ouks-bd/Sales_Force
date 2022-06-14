package scmsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageDealer extends Driver{
	
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
		
		driver.get("http://salesforce.oss.com.bd/Common/Dealer");
		
		driver.findElement(By.id("Name")).sendKeys("Demo Dealer");
		
//		WebElement CompnayTypeID = driver.findElement(By.id("CompnayTypeID"));
//		Select CompnayType =new Select(CompnayTypeID);
//		CompnayType.selectByValue("0");
		
		
		
		driver.findElement(By.id("ContactNo")).sendKeys("01777878987");
		
		WebElement Common_DistrictFK = driver.findElement(By.id("Common_DistrictFK"));
		Select Common_District =new Select(Common_DistrictFK);
		Common_District.selectByValue("42");
		
		driver.findElement(By.id("Address")).sendKeys("58 Gorib-E-Newaz Road, Sector-13, Dhaka");
		
		WebElement TypeFK = driver.findElement(By.id("TypeFK"));
		Select Type =new Select(TypeFK);
		Type.selectByValue("5");
		
		driver.findElement(By.id("rate")).sendKeys("5");
		
		WebElement Common_TermsNConditionFK = driver.findElement(By.id("Common_TermsNConditionFK"));
		Select Common_TermsNCondition =new Select(Common_TermsNConditionFK);
		Common_TermsNCondition.selectByValue("5");
		
		WebElement ZoneIDs = driver.findElement(By.id("ZoneIDs"));
		Select Zone=new Select(ZoneIDs);
		Zone.selectByValue("5");
		
		WebElement ProductIDs = driver.findElement(By.id("ProductIDs"));
		Select Product=new Select(ProductIDs);
		Product.selectByValue("15");
		Product.selectByValue("16");
		Product.selectByValue("17");
		Product.selectByValue("18");
		Product.selectByValue("19");
		Product.selectByValue("20");
		
		driver.findElement(By.id("Email")).sendKeys("Test@beaconerp.com.bd");
		driver.findElement(By.id("Web")).sendKeys("www.beaconerp.com");
		
		
		
		//driver.findElement(By.id("btnsave")).click();
		
		Thread.sleep(5000);

}
}
