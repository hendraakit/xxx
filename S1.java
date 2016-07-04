package S1;

import java.util.ArrayList;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class S1 {

		public static WebDriver driver;
		@Test(dataProvider="data")
				public static void test(String id,String pass,String validation,String test) {

			
	        driver = new FirefoxDriver();	       
	               
	        driver.get("http://automationpractice.com/index.php");	              		
	        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	        driver.findElement(By.id("email")).sendKeys(id);
	        driver.findElement(By.id("passwd")).sendKeys(pass);
	        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
	        
	        WebElement o = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span"));
	        String x = o.getText();
          
	        if(x.contains(validation)){
	        	System.out.println(test+" pass");}
	        else {System.out.println(test +" failed" + x);
	        }
	        
	        driver.close();
	        
	        driver.quit();      
	        
	        
	        
	        
	}

		
		@DataProvider(name="data")
		public Object[][] table()
		{
			Object[][] data=new Object[1][4];
			
			data[0][0]="test4277@yahoo.com";
			data[0][1]="42777";
			data[0][2]="asdasdas dasdasdasd";
			data[0][3]="S1";
						
			
			
			
			
			
				
			return data;
			
		
		
		
}
		}