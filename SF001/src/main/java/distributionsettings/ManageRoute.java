package distributionsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageRoute extends Driver{
	
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
		
		driver.get("http://salesforce.oss.com.bd/common/salezone");
		
		driver.findElement(By.id("Name")).sendKeys("Faridpur");
		
		driver.get("http://salesforce.oss.com.bd/Common/RouteArea/40");
		
		
		WebElement ZoneFK = driver.findElement(By.id("ZoneFK"));
		Select Zone=new Select(ZoneFK);
		Zone.selectByValue("8");
		
		WebElement ZoneAreaFK = driver.findElement(By.id("ZoneAreaFK"));
		Select ZoneArea=new Select(ZoneAreaFK);
		ZoneArea.selectByValue("10");
		
		WebElement DistrictFk = driver.findElement(By.id("DistrictFk"));
		Select District=new Select(DistrictFk);
		District.selectByValue("40");
		
		WebElement ThanaFk = driver.findElement(By.id("ThanaFk"));
		Select Thana=new Select(ThanaFk);
		Thana.selectByValue("4");
		
		
		//routeshop
		driver.get("http://salesforce.oss.com.bd/common/routeshop");
		
		Thread.sleep(5000);
		
	
}
}
