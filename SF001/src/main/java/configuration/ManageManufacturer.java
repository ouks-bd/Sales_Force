package configuration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageManufacturer extends Driver {
	
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
		
		driver.get("http://salesforce.oss.com.bd/common/manufacturer");
		
		
		driver.findElement(By.id("Name")).sendKeys("Telco Food & Baverage");
		
		WebElement Common_CountriesFK = driver.findElement(By.id("Common_CountriesFK"));
		Select Common_Countries =new Select(Common_CountriesFK);
		Common_Countries.selectByValue("12");
		
		driver.findElement(By.id("Address")).sendKeys("Gorib-E-Newaz  Road, Sector 13, Uttora-dhaka");
		driver.findElement(By.id("Contact")).sendKeys("0190898989");
		driver.findElement(By.id("Email")).sendKeys("demo@beacontechbd.com");
		
		
		//driver.findElement(By.id("btnsave")).click();
		
		Thread.sleep(5000);
		
	
	}
	

}
