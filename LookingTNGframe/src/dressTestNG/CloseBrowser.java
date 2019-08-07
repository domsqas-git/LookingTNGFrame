package dressTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CloseBrowser {
	
	public WebDriver driver;
	
	@Test
	public void closeBrws()
	{
		this.driver =MainDress.driver;
		
		driver.quit();
		
		
	}

}
