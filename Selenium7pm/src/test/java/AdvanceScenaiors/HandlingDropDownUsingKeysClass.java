package AdvanceScenaiors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingKeysClass {

	@Test
	public void m2() throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
           WebElement dayList = driver.findElement(By.id("day"));
           Thread.sleep(1000);
           dayList.click();
           
           dayList.sendKeys(Keys.ARROW_DOWN);
           dayList.sendKeys(Keys.ARROW_DOWN);
           
           dayList.sendKeys(Keys.ARROW_UP);
           dayList.sendKeys(Keys.ARROW_UP);
           dayList.sendKeys(Keys.ARROW_UP);
           dayList.sendKeys(Keys.ARROW_UP);
           dayList.sendKeys(Keys.ARROW_UP);
           
           
	
	}

}
