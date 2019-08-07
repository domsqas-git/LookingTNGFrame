package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FourthDress {
	
	public WebDriver driver;
	
	@Test
	public void fourthDr() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top")).sendKeys("Printed summer dress ");
		
		//enter to procede
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
		
		//click quick view
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
		
		//Add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		//Close popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		
		//Click shopping  Cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		
		//Click picture of the Dress
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"product_6_31_0_0\"]/td[1]/a/img")).click();
		
		Thread.sleep(2000);
		//Add quantity to Dress 4
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		
		Thread.sleep(2000);
		//Clear box quantity on Dress 4
		driver.findElement(By.id("quantity_wanted")).clear();
		
		Thread.sleep(2000);
		//Change quantity to 3pc on Dress 4
		driver.findElement(By.id("quantity_wanted")).sendKeys("3");
		
		Thread.sleep(2000);
		//Select size in dropdown menu
		new Select (driver.findElement(By.id("group_1"))).selectByVisibleText("M");
		
		Thread.sleep(2000);
		//Add to cart 4th dress
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		Thread.sleep(2000);
		//Close popup
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		
		Thread.sleep(2000);
		//Go back to Dress by main tab
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		
	}

}
