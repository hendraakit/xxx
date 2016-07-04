package Ris1;

import java.util.ArrayList;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ris1 {

		public static WebDriver driver;
		@Test(dataProvider="data")
				public static void main(String target,String validation,String test) {

			
	        driver = new FirefoxDriver();	       
	               
	        driver.get("http://automationpractice.com/index.php");	              		
	        driver.findElement(By.xpath(target)).click();
                               	      
	        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	        driver.switchTo().window(tabs2.get(1));
	        String x= driver.getCurrentUrl();
	        if(x.contains(validation)){
	        	System.out.println(test+" pass");}
	        else {System.out.println(test +" failed" + x);
	        }
	        
	        driver.close();
	        
	        driver.quit();      
	        
	        
	        
	        
	}

		
		@DataProvider(name="data")
		public Object[][] redirection()
		{
			Object[][] data=new Object[4][3];
			
			data[0][0]="/html/body/div/div[3]/footer/div/section[1]/ul/li[1]/a";
			data[0][1]="https://www.facebook.com/groups/525066904174158/";
			data[0][2]="Ris1";
			
			data[1][0]="/html/body/div/div[3]/footer/div/section[1]/ul/li[2]/a";
			data[1][1]="https://twitter.com/seleniumfrmwrk";
			data[1][2]="Ris2";
			
			data[2][0]="/html/body/div/div[3]/footer/div/section[1]/ul/li[3]/a";
			data[2][1]="https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
			data[2][2]="Ris3";
			
			data[3][0]="/html/body/div/div[3]/footer/div/section[1]/ul/li[4]/a";
			data[3][1]="https://plus.google.com/111979135243110831526";
			data[3][2]="Ris4";
			
							
			return data;
			
		
		
		
}
		}