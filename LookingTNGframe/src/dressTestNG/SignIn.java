package dressTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignIn {
	
	public WebDriver driver;
	
	@Test
	public void sigIn() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		//Sign in
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Forgot Pass
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Back to Login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
		
		//Email
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("king@lookinggood.net");
		
		//Password
		driver.findElement(By.id("passwd")).sendKeys("Tusei1");
		
		//Click Sign in button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		//Order History
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
		
		//Click Logo to return home
		driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
		
		//Sign out
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		
		 double i1 = 26.00; 
			double i2 = 16.40;
			double i3 = 91.50;
			double i4 = 28.98;
			double i5 = 50.99;
		      double d1= i1 + i2 +i3 +i4 +i5;

		      System.out.println(d1);
		      
		      System.out.println("note: the total shows the summ of all of the dresses but dresses printed are just three. I wasn't able to print the other two and the total with any locators" );
		
		
	}

}
