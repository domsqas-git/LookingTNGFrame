package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ThirdDress {
	
	public WebDriver driver;
	
	@Test
	public void thirdDr() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		//3rd Dress
		Actions action = new Actions(driver);
		
		 WebElement we1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]"));
			action.moveToElement(we1).build().perform();
		
		Thread.sleep(2000);
		//Click on "More" on 3rd Dress
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
		
		Thread.sleep(2000);
		//Expand picture
		driver.findElement(By.id("bigpic")).click();
		
		Thread.sleep(2000);
		//Scroll to other picture
		driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
		
		Thread.sleep(2000);
		//Close picture
		driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
		
		Thread.sleep(2000);
		//Add to cart 3rd dress
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		Thread.sleep(2000);
		//Continue Shopping
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		
		Thread.sleep(2000);
		//click Dresses on the "directory" above picture
		driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]")).click();
		
		
		
	}

}
