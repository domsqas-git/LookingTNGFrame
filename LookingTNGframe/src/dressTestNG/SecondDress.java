package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SecondDress {
	
	public WebDriver driver;
	
	@Test
	public void secondDr() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		Thread.sleep(2000);
		//Add to Cart 2nd Dress
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
		
		Thread.sleep(2000);
		//Continue Shopping
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();	
		
	}

}
