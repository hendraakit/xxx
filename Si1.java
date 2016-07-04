package Si1;

import java.util.ArrayList;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Si1 {

		public static WebDriver driver;
		@Test(dataProvider="data")
		public static void table(String id,String title,String fname,String lname,String pass,String address,String city,int state,String zip,String mphone,String alias,String validation,String test) throws InterruptedException {

			driver = new FirefoxDriver();	       
            
	        driver.get("http://automationpractice.com/index.php");	              		
	        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();	       
	        driver.findElement(By.id("email_create")).sendKeys(id);
	        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")).click();	       
	        Thread.sleep(2000);
	        driver.findElement(By.id(title)).click();
	       driver.findElement(By.id("customer_firstname")).sendKeys(fname);
	        driver.findElement(By.id("customer_lastname")).sendKeys(lname);
	        driver.findElement(By.id("passwd")).sendKeys(pass);
	        driver.findElement(By.id("firstname")).sendKeys(fname);
	        driver.findElement(By.id("lastname")).sendKeys(lname);
	        driver.findElement(By.id("address1")).sendKeys(address);
	        driver.findElement(By.id("city")).sendKeys(city);        	        			
			Select stte = new Select(driver.findElement(By.id("id_state")));
			stte.selectByIndex(state);	        
			driver.findElement(By.id("postcode")).sendKeys(zip);//number
			driver.findElement(By.id("phone_mobile")).sendKeys(mphone);//number			
			driver.findElement(By.id("alias")).sendKeys(alias);	        
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button")).click();	       
			String x = driver.getPageSource();			
			
			if(x.contains(validation)){			
	        System.out.println(test+" pass");}
			else System.out.println(test+" faied");
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
			
			driver.close();
	        
	}

		
		private static WebElement findElement(By id) {
			// TODO Auto-generated method stub
			return null;
		}


		@DataProvider(name="data")
		public Object[][] table()
		{
			Object[][] data=new Object[3][13];
			//please increase number on id every time test.
			data[0][0]="testx41@yahoo.com";
			data[0][1]="id_gender1";
			data[0][2]="testo";
			data[0][3]="test";
			data[0][4]="qwe123";
			data[0][5]="jalan kemayoran 123";
			data[0][6]="manaajabisa";
			data[0][7]=22;
			data[0][8]="55555";
			data[0][9]="1213456321";
			data[0][10]="kiluah";
			data[0][11]="Welcome to your account";
			data[0][12]="Si1";
												
			data[1][0]="�?��?�test41@yahoo.com";
			data[1][1]="id_gender2";
			data[1][2]="�?��?�";
			data[1][3]="test";
			data[1][4]="qwe123";
			data[1][5]="jalan kemayoran 123�?��?�";
			data[1][6]="manaajabisa�?��?�";
			data[1][7]=15;
			data[1][8]="55555";
			data[1][9]="1213456321";
			data[1][10]="kiluah�?��?�";
			data[1][11]="Welcome to your account";
			data[1][12]="Si2";
						
			data[2][0]="ไฟtest41@yahoo.com";
			data[2][1]="id_gender2";
			data[2][2]="ไฟ";
			data[2][3]="testa";
			data[2][4]="qwe123";
			data[2][5]="jalan kemayoran 123ไฟ";
			data[2][6]="manaajabisaไฟ";
			data[2][7]=30;
			data[2][8]="55555";
			data[2][9]="1213456321";
			data[2][10]="kiluahไฟ";
			data[2][11]="Welcome to your account";
			data[2][12]="Si3";
								
										
			return data;
			
		
		
		
}
		}