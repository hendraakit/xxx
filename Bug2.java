package Bug2;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bug2 {

	public static void main(String[] args) 
	{
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");		
		WebElement information = driver.findElement(By.id("block_various_links_footer")); 
		String x = information.getText();
		
		if(x.contains("Delivery")) {
			System.out.println("pass");
		}
		else {System.out.println("Bug still occurs");
		
		driver.close();
 							
 		
 
	}}
}