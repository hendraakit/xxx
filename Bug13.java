package Bug13;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bug13 {

	public static void main(String[] args) 
	{
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");		
		
		String x = driver.getPageSource();
	
		if(x.contains("automationpractice.com/img/c/3-1_thumb.jpg")) {
			System.out.println("Bug still occurs");
		}
		else {System.out.println("pass");
		
		driver.close();
 							
 		
 
	}}
}