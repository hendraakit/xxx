package Ri1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Ri1 {
	@Test(dataProvider="data")
	public void Welcome(String target,String validation,String test)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath(target)).click();
		String x = driver.getCurrentUrl();
		
		
		if(x.contains(validation)){			
		System.out.println(test + "  pass");}
		else{ System.out.println(test + " failed " + driver.getCurrentUrl());}
	
		driver.close();
	}
		@DataProvider(name="data")
		public Object[][] table()
		{
			Object[][] data=new Object[15][3];
			//header
			data[0][0]="/html/body/div/div[1]/header/div[1]/div/div/a";
			data[0][1]="http://automationpractice.com/index.php";
			data[0][2]="WR1";
			
			//belom ada isi
			data[1][0]="/html/body/div/div[1]/header/div[3]/div/div/div[1]/a";
			data[1][1]="http://automationpractice.com/index.php";
			data[1][2]="WR3";
			//women					
			data[2][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a";
			data[2][1]="http://automationpractice.com/index.php?id_category=3&controller=category";
			data[2][2]="WR4";
			
			//dress header
			data[3][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
			data[3][1]="http://automationpractice.com/index.php?id_category=8&controller=category";
			data[3][2]="WR16";
					
			//tshirt header	
			data[4][0]="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a";
			data[4][1]="http://automationpractice.com/index.php?id_category=5&controller=category";
			data[4][2]="WR19";
			//bottom women
			data[5][0]="xpath=(//a[contains(text(),'Women')])[2]";
			data[5][1]="http://automationpractice.com/index.php?id_category=3&controller=category";
			data[5][2]="WR20";
			
			
			
			//btm info	
			data[6][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[2]/a";
			data[6][1]="http://automationpractice.com/index.php?controller=new-products";
			data[6][2]="WR21";
			
			data[7][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[3]/a";
			data[7][1]="http://automationpractice.com/index.php?controller=best-sales";
			data[7][2]="WR22";
			
			data[8][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a";
			data[8][1]="http://automationpractice.com/index.php?controller=stores";
			data[8][2]="WR22";
			
			
			data[9][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[5]/a";
			data[9][1]="http://automationpractice.com/index.php?controller=contact";
			data[9][2]="WR23";
			
			
			data[10][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[6]/a";
			data[10][1]="http://automationpractice.com/index.php?id_cms=3&controller=cms";
			data[10][2]="WR24";
			
			
			data[11][0]="//html/body/div/div[3]/footer/div/section[3]/ul/li[7]/a";
			data[11][1]="http://automationpractice.com/index.php?id_cms=4&controller=cms";
			data[11][2]="WR25";
			
			data[12][0]="/html/body/div/div[3]/footer/div/section[3]/ul/li[8]/a";
			data[12][1]="http://automationpractice.com/index.php?controller=sitemap";
			data[12][2]="WR24";
				
												
			
			/*iki buka tab baru
			 * data[23][0]="/html/body/div/div[3]/footer/div/section[4]/div/a";
			data[23][1]="http://www.prestashop.com";
			data[23][2]="WR24";*/
			
		
			
			return data;
			
					
		}
}
