package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().window().maximize();

driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Shobha\\Desktop\\ActionClassNotes.txt");

driver.findElement(By.id("file-submit")).click();
	
	}

}