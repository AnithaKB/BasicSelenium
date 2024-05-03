package AdvanceScenaiors;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionEx3 {

	@Test
	public void autoSuggestionEx3() throws Throwable {

		WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("Selenium");

    Thread.sleep(1000);
    List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	
	for (WebElement sugg : allSugg)
	{
		System.out.println(sugg.getText());
		if(sugg.getText().contains("selenium webdriver"))
		{
			sugg.click();
			break;
		}
	}
	
	
	}

}
