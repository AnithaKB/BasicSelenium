package AdvanceScenaiors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUSingSelectClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
           WebElement dayList = driver.findElement(By.id("day"));
           
           //Select By Index---->Index value starts from 0
           Select sel = new Select(dayList);
           sel.selectByIndex(14);
	
           //select by value
          WebElement monthList = driver.findElement(By.id("month"));
	      Select sele = new Select(monthList);
	      sele.selectByValue("12");
	      
	      //select by visibleText
	      WebElement yearList = driver.findElement(By.id("year"));
	      Select select = new Select(yearList);
	    //  select.selectByValue("1930");
	      select.selectByVisibleText("2005");
	      
}

}
