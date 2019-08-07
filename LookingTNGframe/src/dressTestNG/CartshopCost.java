package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CartshopCost {
	
	public WebDriver driver;
	
	@Test
	public void cartshCost() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		//Cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		
		//Proceed to checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		
		//Click on shopping cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
		
		//Print dress 1 info
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/small[2]/a")).getText());
		System.out.println(driver.findElement(By.id("total_product_price_3_13_0")).getText());
		
		//Print dress 2 info
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_4_16_0_0\"]/td[2]/p/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_4_16_0_0\"]/td[2]/small[2]/a")).getText());
		System.out.println(driver.findElement(By.id("total_product_price_4_16_0")).getText());

		//Print dress 3 info
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/p/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_5_19_0_0\"]/td[2]/small[2]/a")).getText());
		System.out.println(driver.findElement(By.id("total_product_price_5_19_0")).getText());
		
		
		//Print dress 4
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_6_31_0_198772\"]/td[2]/p/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_6_31_0_198772\"]/td[2]/small[2]/a")).getText());
		System.out.println(driver.findElement(By.id("total_product_price_6_31_198772")).getText());
		
		//Print dress 5
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_7_34_0_198772\"]/td[2]/p/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product_7_34_0_198772\"]/td[2]/small[2]/a")).getText());
		System.out.println(driver.findElement(By.id("total_product_price_7_34_198772")).getText());
		
		//Total 
		System.out.println(driver.findElement(By.id("total_price")).getText());
		
		
	}

}
