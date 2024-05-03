package AdvanceScenaiors;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyBoardUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
//driver.findElement(By.name("field-keywords")).sendKeys("Nike",Keys.ENTER);
	
    driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);*/
		
		//Ex2:-
		
	/*	WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
      Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);
      
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);*/
      
		 WebDriver driver=new ChromeDriver();

	        driver.get("https://www.saucedemo.com/v1/");
	        driver.manage().window().maximize();
	        
	      driver.findElement(By.id("user-name")).sendKeys("standard_user");	
	      
	      Robot rob = new Robot();
	      rob.keyPress(KeyEvent.VK_CONTROL);
	      rob.keyPress(KeyEvent.VK_A);
	      rob.keyRelease(KeyEvent.VK_CONTROL);
	      rob.keyRelease(KeyEvent.VK_A);
	      
	      rob.keyPress(KeyEvent.VK_CONTROL);
	      rob.keyPress(KeyEvent.VK_C);
	      rob.keyRelease(KeyEvent.VK_CONTROL);
	      rob.keyRelease(KeyEvent.VK_C);
	      
	      rob.keyPress(KeyEvent.VK_TAB);
	      rob.keyRelease(KeyEvent.VK_TAB);
	      
	      rob.keyPress(KeyEvent.VK_CONTROL);
	      rob.keyPress(KeyEvent.VK_V);
	      rob.keyRelease(KeyEvent.VK_CONTROL);
	      rob.keyRelease(KeyEvent.VK_V);
	      
	      
}

}
