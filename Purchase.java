//completed purchase
package Purchase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Purchase {

	public static void main(String[] args) throws InterruptedException 
	{
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		//login
		driver.findElement(By.xpath("//html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("test4277@yahoo.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")).sendKeys("42777");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
		
		//go to women
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();		
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
				
		//choose size
		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByIndex(2);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")).click();			
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		//all proceed
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//html/body/div/div[2]/div/div[3]/div/div/form/p/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		
		String x = driver.getCurrentUrl();
		if (x.contains("complete")){
		
		System.out.println("pass");}
		else {System.out.println("failed");}
		driver.close();
		
		
		
	}
	}