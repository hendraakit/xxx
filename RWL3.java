package RWL3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RWL3 {
			
	
	@Test(dataProvider="data")
	public void Welcome(String target,String validation,String valid2,String test)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath(target)).click();
		String x = driver.getCurrentUrl();
		
		String z = driver.getPageSource();
				
		if((x.contains(validation)) && (z.contains(valid2)))		
		{System.out.println(test +" pass");}
		else {System.out.println("failed" + x);}		
		
		
		
	
		driver.close();
	}
		@DataProvider(name="data")
		public Object[][] table()
		{
			Object[][] data=new Object[5][4];
			//header
			data[0][0]="/html/body/div/div[3]/footer/div/section[5]/h4/a";
			data[0][1]="http://automationpractice.com/index.php?controller=authentication&back=my-account";
			data[0][2]="My account";
			data[0][3]="RWL3";
			
			data[1][0]="/html/body/div/div[3]/footer/div/section[5]/div/ul/li[1]/a";
			data[1][1]="http://automationpractice.com/index.php?controller=authentication&back=history";
			data[1][2]="Here are the";
			data[1][3]="RWL4";
			
			data[2][0]="/html/body/div/div[3]/footer/div/section[5]/div/ul/li[2]/a";
			data[2][1]="http://automationpractice.com/index.php?controller=authentication&back=order-slip";
			data[2][2]="Credit slips";
			data[2][3]="RWL5";
			
			data[3][0]="/html/body/div/div[3]/footer/div/section[5]/div/ul/li[3]/a";
			data[3][1]="http://automationpractice.com/index.php?controller=authentication&back=addresses";
			data[3][2]="listed below";
			data[3][3]="RWL6";
			
			data[4][0]="/html/body/div/div[3]/footer/div/section[5]/div/ul/li[4]/a";
			data[4][1]="http://automationpractice.com/index.php?controller=authentication&back=identity";
			data[4][2]="personal information ";
			data[4][3]="RWL7";											
		
			
			return data;
			
					
		}
}
