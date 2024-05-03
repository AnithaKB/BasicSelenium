package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbElementMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.get("https://www.amazon.in");
		//method1,2,3,4:-sendKeys(),click(),submit(),clear()
/*WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
searchBar.sendKeys("puma");
//searchBar.click();
//searchBar.submit();
searchBar.clear();
searchBar.sendKeys("Bluetooth");*/

		//method5:-getLocation()
	/*WebElement Txt = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
	System.out.println(Txt.getLocation().getX());
	System.out.println(Txt.getLocation().getY());
	
	//method6:-getSize()
	System.out.println(Txt.getSize().getHeight());
	System.out.println(Txt.getSize().getWidth());
	
	//method7:-getRect()
	System.out.println(Txt.getRect().getX());
	System.out.println(Txt.getRect().getY());
	System.out.println(Txt.getRect().getHeight());
	System.out.println(Txt.getRect().getWidth());*/
		
		//method8:-isDisplayed
	/*	driver.get("https://www.facebook.com");
 WebElement facebookLogo = driver.findElement(By.xpath("//img[contains(@class,'f')]"));
if(facebookLogo.isDisplayed())
 {
	 System.out.println("Logo is Displayed");
 }
 else
 {
	 System.out.println("Logo not Displayed");
 }

//method9:-isEnabled()
WebElement link = driver.findElement(By.xpath("//a[text()='Create new account']"));
if(link.isEnabled())
{
	link.click();
}
else
{
	System.out.println("Element not Enabled");
}

//method10:-isSelected()
Thread.sleep(2000);
	WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
	radio.click();  
		if(radio.isSelected())
     {
		System.out.println("radio button is Selected");
		}
	else
	{
		System.out.println("radio button is not Selected");
	}*/
		
		driver.get("https://www.amazon.in");
		WebElement Bar = driver.findElement(By.name("field-keywords"));
//method11:-getTagName()	
	System.out.println(Bar.getTagName());
	
/*	WebElement link = driver.findElement(By.linkText("Amazon miniTV"));
	System.out.println(link.getTagName());
	
//method12:-getAttribute()	
	System.out.println(link.getAttribute("class"));
	System.out.println(link.getAttribute("href"));
	
//method13:-getAriaRole()
	System.out.println(link.getAriaRole());
	System.out.println(Bar.getAriaRole());
	
	WebElement ele = driver.findElement(By.cssSelector("#nav-search-submit-button"));
	System.out.println(ele.getAriaRole());
	
	//method14:- DOM:-Domcument Object Model ----->getDomAttribute()
	WebElement txt = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	System.out.println(txt.getDomAttribute("tabindex"));
	
	//method15:-getDomProperty()
	System.out.println(txt.getDomProperty("baseURI"));*/
	
	//method16:-getCssValue()
	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	/*System.out.println(searchBar.getCssValue("color"));
	
	System.out.println(searchBar.getCssValue("font-size"));

	System.out.println(searchBar.getAccessibleName());
	
	//method17:-getAccessibleName
	WebElement icon = driver.findElement(By.cssSelector("#nav-search-submit-button"));
	System.out.println(icon.getAccessibleName());
	
	WebElement link = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
	System.out.println(link.getAccessibleName());*/
	
	//method18:-getText()
	searchBar.sendKeys("puma");
	searchBar.submit();
	String name = driver.findElement(By.xpath("//span[text()='Unisex-Adult Cat Backpack, Nrgy Blue-Ocean Tropic (9101704)']")).getText();
	System.out.println(name);
	}

}