package Rim1;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Rim1 {
	@Test(dataProvider="data")
	public void Welcome(String target,String validation,String test) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(women).perform();
		Thread.sleep(1000);
		
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
			Object[][] data=new Object[7][3];
			
			
			data[0][0]="//a[contains(text(),'Tops')]";
			data[0][1]="http://automationpractice.com/index.php?id_category=4&controller=category";
			data[0][2]="rim1";
			
			data[1][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a";
			data[1][1]="http://automationpractice.com/index.php?id_category=5&controller=category";
			data[1][2]="rim2";
			
			data[2][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
			data[2][1]="http://automationpractice.com/index.php?id_category=7&controller=category";
			data[2][2]="rim3";
			
			data[3][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/a";
			data[3][1]="http://automationpractice.com/index.php?id_category=8&controller=category";
			data[3][2]="rim4";			
			
			data[4][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a";
			data[4][1]="http://automationpractice.com/index.php?id_category=11&controller=category";
			data[4][2]="rim7";
			
			data[5][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]/a";
			data[5][1]="http://automationpractice.com/index.php?id_category=9&controller=category";
			data[5][2]="rim5";
			
			data[6][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a";
			data[6][1]="http://automationpractice.com/index.php?id_category=10&controller=category";
			data[6][2]="rim6";
		
			
			return data;
			
					
		}
}
