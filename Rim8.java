package Rim8;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Rim8 {
	@Test(dataProvider="data")
	public void Rim(String target,String validation,String test) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		//kondisi uda login
		
		WebElement dress = driver.findElement(By.xpath("(//a[contains(text(),'Dresses')])[5]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(dress).perform();
		Thread.sleep(2000);
		
		WebElement z = driver.findElement(By.xpath(target));
		action.click(z).perform();
		
		
		
		String x = driver.getCurrentUrl();
		
				
		if(x.contains(validation)){			
		System.out.println(test + "  pass");}
		else{ System.out.println(test + " failed " + driver.getCurrentUrl());}
	
		driver.close();
	}
		@DataProvider(name="data")
		public Object[][] table()
		{
			Object[][] data=new Object[3][3];
			
			
			
		
			data[0][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a";
			data[0][1]="http://automationpractice.com/index.php?id_category=9&controller=category";
			data[0][2]="rim8";
			
			data[1][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a";
			data[1][1]="http://automationpractice.com/index.php?id_category=10&controller=category";
			data[1][2]="rim9";			
			
			data[2][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a";
			data[2][1]="http://automationpractice.com/index.php?id_category=11&controller=category";
			data[2][2]="rim10";
			
			return data;
			
					
		}
}
