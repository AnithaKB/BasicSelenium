package POMRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MultipleWebElements {

	public MultipleWebElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void multipleWebElements(WebDriver driver) throws Throwable
	{
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		Thread.sleep(1000);
		for (WebElement sugg : allSugg)
		{
			String Element = sugg.getText();
			if(Element.contains("bluetooth earphone"))
			{
				sugg.click();
				break;
			}
	System.out.println(sugg.getText());
	}
	}
}
