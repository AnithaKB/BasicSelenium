package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonEx {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
       driver.manage().window().maximize();
	
	//driver.findElement(By.name("field-keywords")).sendKeys("Nike");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	
           //LinkText()
  //driver.findElement(By.linkText("Amazon miniTV")).click();
	
           //partialLinkText()
	//driver.findElement(By.partialLinkText("Amazon m")).click();
          
       //partialLinkText()
   //driver.findElement(By.partialLinkText("Today's")).click();
       
      
	
	
	
	}

}
