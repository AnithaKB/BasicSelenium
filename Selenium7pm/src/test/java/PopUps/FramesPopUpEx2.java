package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopUpEx2 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     driver.manage().window().maximize();

	     //Frame switching using index
	 //    driver.switchTo().frame(1);
	 //    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");
	
	    //Frame switching using id() value
	 //    driver.switchTo().frame("singleframe");
	 //    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
	 	 
	     //Frame switching using name() value
	       driver.switchTo().frame("SingleFrame");
	       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	
	   //Frame switching using webElement
	//      WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	//      driver.switchTo().frame(ele);
	//      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
	
	
	
	}

}
