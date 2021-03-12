package metoda;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import strane.PrvaStrana;







public class Metoda {
	 WebDriver driver;


	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();				
	}
	
	@Test(priority=1)
	public void PrviTest() {
		
		try {
		driver.navigate().to(PrvaStrana.URL);		//prvi test
		Thread.sleep(2000);
		PrvaStrana.PrviDeo(driver);
		Thread.sleep(7000);
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		String actual = driver.findElement(By.xpath(PrvaStrana.VISIBLE_AFTER_5S)).getText();
		String expected= "Visible After 5 Seconds";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=2)
	public void DrugiTest() {
		
		try {
		driver.navigate().to(PrvaStrana.URL);		//drugi test
		Thread.sleep(2000);
		PrvaStrana.maksimizuj(driver);
		PrvaStrana.DrugiDeo(driver);
		
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
	
	@AfterClass()
	public void zatvaranje() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   driver.quit();
	   
	}
	
	


}


