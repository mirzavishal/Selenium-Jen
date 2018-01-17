package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	    String driverPath = "C:\\Class\\Selenium\\";
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    System.out.println("launching chrome browser........."); 
		    System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		    driver = new ChromeDriver();
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	