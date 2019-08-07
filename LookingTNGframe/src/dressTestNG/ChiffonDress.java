package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChiffonDress {

	public WebDriver driver;
	
	@Test
	public void chiffonDr() throws InterruptedException
	{		
		this.driver =MainDress.driver;
		
		//Search box (chiffon)
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top")).sendKeys("chiffon ");
		
		//Click search button
		Thread.sleep(2000);
		driver.findElement(By.name("submit_search")).click();
		
		//Click image to access dress page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
		
		Thread.sleep(2000);
		//Change color on Dress 5
		driver.findElement(By.id("color_15")).click();
		
		//Send email to friend
		Thread.sleep(2000);
		driver.findElement(By.id("send_friend_button")).click();
		
		//Friend name
		driver.findElement(By.id("friend_name")).sendKeys("Beautiful Girl");
		
		//Friend email
		driver.findElement(By.id("friend_email")).sendKeys("beautiful@handsome.com");
		
		//Cancel email send
		driver.findElement(By.xpath("//*[@id=\"send_friend_form_content\"]/p/a")).click();
		
		//Add to cart 5th dress
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		//Close popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();	
		
		//Click on shopping cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
		
		//Delete extra dress
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"6_31_0_0\"]/i")).click();
		
		
		
	}
	
}
