package distributionsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageEmployeeRoute extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/saleslead/assignroutetouser");
		
		WebElement employeeeID = driver.findElement(By.id("employeeeID"));
		Select employeee=new Select(employeeeID);
		employeee.selectByValue("115");
		
		WebElement ZoneID = driver.findElement(By.id("ZoneID"));
		Select Zone=new Select(ZoneID);
		Zone.selectByValue("9");
		
		WebElement Common_ZoneArea = driver.findElement(By.id("AreaID"));
		Select Common_ZoneAreaFK=new Select(Common_ZoneArea);
		Common_ZoneAreaFK.selectByValue("7");
		
		WebElement RouteID = driver.findElement(By.id("RouteID"));
		Select Route = new Select(RouteID);
		Route.selectByValue("14");
		
		
		driver.findElement(By.id("FilterShowID")).click();
		
		
		Thread.sleep(5000);
	
	}
}

