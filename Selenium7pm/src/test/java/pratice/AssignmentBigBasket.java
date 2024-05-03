package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBigBasket {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("Apples");
 
//driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[1]")).sendKeys("Apples");
	
driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples",Keys.ENTER);
Thread.sleep(2000);	

//WebElement ele = driver.findElement(By.xpath("//h3[text()=\"Apple - Royal Gala Economy\"]/../../../following-sibling::div[3]//button[text()='Add']"));
//WebElement ele = driver.findElement(By.xpath("//h3[text()=\"Apple - Royal Gala Economy\"]/../../../following-sibling::div[3]//button[@pattern='outline']"));
Thread.sleep(2000);
//ele.click();
driver.findElement(By.xpath("(//button[text()=\"Add\"]/..//button[@class=\"Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton2-sc-orwifk-3 kLHxgl group CtaOnDeck___StyledButton2-sc-orwifk-3 kLHxgl group\"])[1]")).click();
	}

}
