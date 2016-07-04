package Bug3;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bug3 {

	public static void main(String[] args) 
	{
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");		
		WebElement Legal = driver.findElement(By.id("block_various_links_footer")); 
		String x = Legal.getText();
		
		if(x.contains("Legal Notice")) {
			System.out.println("pass");
		}
		else {System.out.println("Bug still occurs");
		
		driver.close();
 							
 		
 
	}}
}