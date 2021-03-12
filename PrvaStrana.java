package strane;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrvaStrana {

public static final String URL="https://demoqa.com/elements";
public static final String EXPECTED="https://demoqa.com/dynamic-properties";
public static final String ELEMENTS="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]";
public static final String DYNAMIC_PROPERTIES="//*[@id=\"item-8\"]";
public static final String VISIBLE_AFTER_5S="/html/body/div/div/div/div[2]/div[2]/div[1]/button[3]";
public static final String FORMS="//*[text()='Forms']";
public static final String PRACTICEFORMS="//*[@id=\"item-0\"]/span";



	
	public static void PrviDeo(WebDriver driver) {
		 WebElement we=driver.findElement(By.xpath(DYNAMIC_PROPERTIES));
		 we.click();
}
	
	public static void DrugiDeo(WebDriver driver) throws InterruptedException {
		 WebElement we=driver.findElement(By.xpath(ELEMENTS));
		 we.click();
		 Thread.sleep(3000);
		 System.out.println("1");
		 we.findElement(By.xpath(FORMS));
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 Thread.sleep(3000);
		 we.click();
		 System.out.println("2");
		 Thread.sleep(3000);
		 we.findElement(By.xpath(PRACTICEFORMS));
		 we.click();
		 System.out.println("3");
}
	
	public static void maksimizuj(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
}
