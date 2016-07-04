package Bug14;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bug14 {

	public static void main(String[] args) 
	{
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");		
		WebElement banner = driver.findElement(By.id("category-thumbnail")); 
		String x = banner.getText();
		
		if(x.contains("</a>")) {
			System.out.println("pass");
		}
		else {System.out.println("Bug still occurs");
		
		driver.close();
 							
 		
 
	}}
}