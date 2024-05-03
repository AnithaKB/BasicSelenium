package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LaunchingBrowser {

	public static void main(String[] args) {
	
		//case1:-Selenium version :-3.141.59 with BrowserSever
		
	/*	String key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(key, Value);
        WebDriver driver=new ChromeDriver();*/
		
//case2:-Selenium version:-3.141.59, webdrivermanager version:-5.7.0
	
	//  WebDriverManager.chromedriver().setup();
	//  WebDriver driver=new ChromeDriver();
	
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver=new FirefoxDriver();
	
	//	WebDriverManager.edgedriver().setup();
	//	WebDriver driver=new EdgeDriver();
		
	//case3:-Selenium version:-4.18.1	
	
		//	WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver=new EdgeDriver();
		
	}

}
