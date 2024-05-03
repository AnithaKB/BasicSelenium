package pratice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	//List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));//1of24
	//List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		
	List<WebElement> phone_price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println("Total phones:"+phone_price.size());
	
	Thread.sleep(3000);
	List<WebElement> Allphonename = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(int i=0;i<Allphonename.size();i++) 
	{
	System.out.println(Allphonename.get(i).getText()+"-------"+phone_price.get(i).getText());
		
	}
	}
}
