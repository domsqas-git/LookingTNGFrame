package dressTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainDress {
	
	 static WebDriver driver;

	@Test
	@Parameters("browser")
	public void Open_Browser_Testcase1(String browserName)
	
			{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "c:\\\\selenium\\\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
				{
				driver.manage().window().maximize();
				
				driver.get("http://automationpractice.com/index.php");
				
				System.out.println(driver.getTitle());
				}
			
				
			
			
			
		}

	
	}
	
	
