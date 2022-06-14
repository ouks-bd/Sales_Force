package ScmSettings;

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
		
		driver.findElement(By.id("Name")).sendKeys("Test-Demo");
		driver.findElement(By.id("Price")).sendKeys("01777878987");
		
		     
		WebElement District = driver.findElement(By.id("District"));
		Select DistrictID =new Select(District);
		DistrictID.selectByValue("46");
		
		

}
}
