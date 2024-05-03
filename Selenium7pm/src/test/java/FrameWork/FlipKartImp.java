package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.Flipkart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartImp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
	
Flipkart flp = new Flipkart(driver);
//flp.getSearchTextField().sendKeys("Nike");

flp.methodText("Bluetooth");
flp.icon();
	}

}
