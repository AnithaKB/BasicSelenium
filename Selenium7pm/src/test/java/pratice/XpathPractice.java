package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			
			//xpath by Attribute()
			//syntax:- //htmltag[@AttributeName="AttributeValue"]
	//driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
			
			//xpath by text()
			//syntax:- //htmltag[text()="AttributeValue"]
	driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
	}
}
