package ScmSettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageStore  extends Driver{
		
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
				
				driver.get("http://salesforce.oss.com.bd/order/warehouse");
				
				driver.findElement(By.id("Name")).sendKeys("Test-Demo");
				driver.findElement(By.id("Price")).sendKeys("01777878987");
				
				     
				WebElement District = driver.findElement(By.id("District"));
				Select DistrictID =new Select(District);
				DistrictID.selectByValue("46");
				
				WebElement DealerFk= driver.findElement(By.id("DealerFk"));
				Select Dealer =new Select(DealerFk);
				Dealer.selectByValue("29");
				
				WebElement DepartmentFK = driver.findElement(By.id("DepartmentFK"));
				Select Department =new Select(DepartmentFK);
				Department.selectByValue("31");
				
//				WebElement employeeFK = driver.findElement(By.id("employeeFK"));
//				Select employee =new Select(employeeFK);
//				employee.selectByValue("0000");
				
				driver.findElement(By.id("Address")).sendKeys("Uttora sector 13 dhaka");
				//driver.findElement(By.id(" btnsave")).click();
				
				Thread.sleep(5000);
}
}