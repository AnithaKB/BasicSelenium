package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//htmltag[@AttributeName='AttributeVAlue' and @AttributeName='AttributeValue']
//driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-content-id='nav_cs_bestsellers']")).click();
//driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_3']")).click();
	
          //htmltag[text()='AttributeVAlue' and @AttributeName='AttributeValue']
//driver.findElement(By.xpath("//a[text()='Amazon miniTV' and @data-csa-c-type='link']")).click();
	
		//htmltag[@AttributeName='AttributeVAlue' or @AttributeName='AttributeValue']
//driver.findElement(By.xpath("//input[@type='tex' or @name='field-keywords']")).sendKeys("Nike");
	
		 //htmltag[@AttributeName()='AttributeVAlue' or contains(text(),'AttributeValue')]
driver.findElement(By.xpath("//a[@data-csa-c-type='link' or contains(text(),\"Today's\")]")).click();
	}

}
