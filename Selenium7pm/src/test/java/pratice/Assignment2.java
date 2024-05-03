package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Throwable {
		
		//print product name nd price
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("bluetooth mouse");

			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
			Thread.sleep(3000);
	String name = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).getText();
	System.out.println(name);
	
	String price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[4]")).getText();
	System.out.println(price);
	
	}

}
