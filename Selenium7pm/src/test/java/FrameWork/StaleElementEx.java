package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementEx {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.findElement(By.name("user-name")).sendKeys("standard_user");	
		        
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class=\"form_input\"]/following-sibling::input[@class=\"form_input\"]")).sendKeys("secret_sauce");
		       //className()--->syntax:- AttributeName="AttributeValue"     
		WebElement login = driver.findElement(By.className("btn_action"));
         driver.navigate().refresh();
         login.click();
}
}