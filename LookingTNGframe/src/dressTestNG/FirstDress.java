package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FirstDress {
	
public WebDriver driver;
	
	@Test
	public void firstDr() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		Thread.sleep(2000);
		
		@SuppressWarnings("unused")
		JavascriptExecutor driver0;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		 Actions action = new Actions(driver);
		
		//Add to Cart 1st Dress
		 WebElement we = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]"));
			action.moveToElement(we).build().perform();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		
		Thread.sleep(2000);
		//Continue Shopping
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
	}
	
	

}
