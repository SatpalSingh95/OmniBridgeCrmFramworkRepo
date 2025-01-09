package com.omniBridge.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;

public class LoginPage  extends WebDriverUtility
{
	
	
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="user_name")
	private WebElement usernameEdit;
	
	@FindBy(name="user_password")
	private	WebElement passwordEdit;
	
	@FindBy(id="submitButton")
	private	WebElement loginBtn;

	

	
	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

	
	
	// provide Action
	// Business method only for specific script
	public void loginToapp( String username, String password,String url)
	{
		
	driver.get(url);
driver.manage().window().maximize();
	WaitForPageToLoad(driver);
	    usernameEdit.sendKeys(username);
        passwordEdit.sendKeys(password);
        loginBtn.click();
	}
	
	
}
