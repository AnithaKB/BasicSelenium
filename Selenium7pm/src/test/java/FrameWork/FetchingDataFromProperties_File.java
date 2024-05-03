package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class FetchingDataFromProperties_File {

	public void fetchdata() throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Normal Approach	
	/*	 driver.get("https://www.saucedemo.com/v1/");
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();*/
		 
		 //properties_File
		 //Step1:- Path connection
//FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\PropertyData.properties");
		 FileInputStream fis = new FileInputStream("./PropertyData.properties");
		 
         //Step2:-load data into properties class
   Properties pro = new Properties();
   pro.load(fis);
   String URL = pro.getProperty("url");
   String USERNAME = pro.getProperty("username");
   String PASSWORD = pro.getProperty("password");
	driver.get(URL);
	 driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	 driver.findElement(By.id("password")).sendKeys(PASSWORD);
	 driver.findElement(By.id("login-button")).click();
	}

}
