package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Shobha\\Downloads\\ProKabadi.txt");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}