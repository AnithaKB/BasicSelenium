package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	public Flipkart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title='Search for Products, Brands and More']")})
	private WebElement searchTextField;

	@FindAll({@FindBy(css="[type='submit']"),@FindBy(xpath="//button[@aria-label='Search for Products, Brands and More']")})
	private WebElement searchIcon;
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	
	public WebElement getSearchIcon() {
		return searchIcon;
	}

    public void methodText(String name)
	{
		searchTextField.sendKeys(name);
	}
	
	public void icon()
	{
		searchIcon.click();
	}
}
