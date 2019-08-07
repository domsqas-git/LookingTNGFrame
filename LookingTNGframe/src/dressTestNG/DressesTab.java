package dressTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class DressesTab {
	
	public WebDriver driver;
	
	@Test
	public void dresstab() throws InterruptedException
	{
		this.driver =MainDress.driver;
		
		Thread.sleep(2000);
		//click dresses tab
				driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
	}

}
