package accountsettings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Driver;
import pom.PageObjectModel;

public class ManageAccountHead  extends Driver{
	
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
		
		driver.get("http://salesforce.oss.com.bd/accounting/accounthead");
		
		WebElement AccountTypeFK = driver.findElement(By.id("AccountTypeFK"));
		Select AccountType=new Select(AccountTypeFK);
		AccountType.selectByValue("4");
		
		
		WebElement Acc_Chart1FK = driver.findElement(By.id("Acc_Chart1FK"));
		Select Acc_Chart1=new Select(Acc_Chart1FK);
		Acc_Chart1.selectByValue("400");
		
		WebElement Acc_Chart2FK = driver.findElement(By.id("Acc_Chart2FK"));
		Select Acc_Chart2=new Select(Acc_Chart2FK);
		Acc_Chart2.selectByValue("8650");
		
		driver.findElement(By.id("Name")).sendKeys("Deamo Head");
		
		System.out.println("Passed");
		
		Thread.sleep(5000);
		
		
		
}
}