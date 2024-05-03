package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Windows.html");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	
	Set<String> wins = driver.getWindowHandles();//win1 win2
	
	for (String win : wins)//win1 //win2  win3
	{
		driver.switchTo().window(win);
		
		String title = driver.getTitle();
		System.out.println(title);//-------->win1 win2
	if(title.contains("Selenium"))
	{
		break;
		}
	}
	driver.findElement(By.xpath("//a[text()='Learn more & submit']")).click();
//-----------------------------------------------------------------------------------------------
	Set<String> allWins1 = driver.getWindowHandles();
	for (String win1 : allWins1)//win1 //win2  win3
	{
		driver.switchTo().window(win1);
		String title1 = driver.getTitle();
		System.out.println(title1);//-------->win1 win2 win3
	if(title1.contains("Submit a Proposal - Selenium Conf 2024"))
	{
		break;
		}
	}
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.moveByOffset(20,30).click().perform();
	driver.findElement(By.xpath("//a[text()='Register Now']")).click();
	
Set<String> wins2 = driver.getWindowHandles();//win1 win2
	
	for (String win2 : wins2)//win1 //win2  win3
	{
		driver.switchTo().window(win2);
		
		String title2 = driver.getTitle();
		System.out.println(title2);//-------->win1 win2
	if(title2.contains("Frames & windows"))
	{
		break;
		}
	}
	driver.quit();
}

}
