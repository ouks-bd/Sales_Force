package distributionsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageDealerArea extends Driver {
		
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
		
		driver.get("http://salesforce.oss.com.bd/common/dealerarea");
		
		WebElement DealerTypeID = driver.findElement(By.id("DealerTypeID"));
		Select DealerType=new Select(DealerTypeID);
		DealerType.selectByValue("6");
		
		WebElement DealerID = driver.findElement(By.id("DealerID"));
		Select Dealer=new Select(DealerID);
		Dealer.selectByValue("30");
		
		WebElement ZoneFK = driver.findElement(By.id("ZoneFK"));
		Select Zone=new Select(ZoneFK);
		Zone.selectByValue("7");
		
		WebElement AreaFK = driver.findElement(By.id("AreaFK"));
		Select Area=new Select(AreaFK);
		Area.selectByValue("7");
		
		Thread.sleep(5000);
	
	}
}
