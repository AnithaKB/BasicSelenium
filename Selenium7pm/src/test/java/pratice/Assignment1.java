package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
       driver.manage().window().maximize();
      
//       driver.findElement(By.cssSelector("[name=\"field-keywords\"]")).sendKeys("puma");
//       driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
//       
//   String name = driver.findElement(By.linkText("Men's Lesfly Slipper")).getText();
//   System.out.println(name);
	
	driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Nike",Keys.ENTER);
	
	
	}

}
