package FrameWork;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.MultipleWebElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAutoSuggestionEx1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("bluetooth");
	
	Thread.sleep(1000);
	
//	List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
//	Thread.sleep(1000);
//	for (WebElement sugg : allSugg)
//	{
//		String Element = sugg.getText();
//		if(Element.contains("bluetooth earphone"))
//		{
//			sugg.click();
//			break;
//		}
//System.out.println(sugg.getText());
//}
	
	MultipleWebElements eles = new MultipleWebElements(driver);
	eles.multipleWebElements(driver);
	}

}
