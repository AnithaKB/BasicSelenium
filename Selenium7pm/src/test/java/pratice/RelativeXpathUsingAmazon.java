package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathUsingAmazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		              //xpath by Attribute()
	            	//syntax1:- //htmltag[@AttributeNAme="AttributeValue"]
	//	driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("Nike");

	//	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		                 //xpath by text()
	                 //syntax2:- //htmltag[text()="AttributeValue"]

		//To click on the shoe(product)		
		//driver.findElement(By.xpath("//span[text()=\"Mens Revolution 7 EasyonRunning Shoe\"]")).click();

		//To print shoe name in the console		
	//	String shoeName = driver.findElement(By.xpath("//span[text()=\"Mens Revolution 7 EasyonRunning Shoe\"]")).getText();
	//  System.out.println(shoeName);
	
		                    //xpath by contains Attribute()
		              //syntax3:- //htmltag[contains(@AttributeNAme,"AttributeValue")]
		
		driver.findElement(By.xpath("//input[contains(@id,\"x\")]")).sendKeys("Nike");
		driver.findElement(By.xpath("//input[contains(@id,\"nav\")]")).click();
		

                          //xpath by contains text()
                      //syntax4:- //htmltag[contains(text(),"AttributeValue")]
		driver.findElement(By.xpath("//span[contains(text(),\"Mens Revolution 7 E\")]")).click();
	}

}
