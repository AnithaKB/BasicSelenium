package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize();
		
		
		//syntax1:- [AttributeNAme="AttributeValue"]

 /*  driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
   driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("secret_sauce");
   driver.findElement(By.cssSelector("[type=\"submit\"]")).click();*/
			
	    //syntax2:-  htmltag[AttributeName="AttributeValue"]
//	driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
	
		//syntax3:-  supports only id() Locator -----> #AttributeValue
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	
	//syntax4:-  supports only id() Locator-----> htmltag#AttributeValue
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	
	//syntax5:- supports only className() Locator------> .AttributeValue
	//driver.findElement(By.cssSelector(".btn_action")).click();
	
	//syntax6:- supports only className() Locator------> htmltag.AttributeValue
	driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
