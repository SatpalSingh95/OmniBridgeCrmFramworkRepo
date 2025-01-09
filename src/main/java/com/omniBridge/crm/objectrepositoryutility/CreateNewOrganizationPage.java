package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage 
{
	WebDriver driver;
	public CreateNewOrganizationPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="accountname")
	private WebElement orgNameEdit;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	//@FindBy(name="button")
	private WebElement saveBtn;

	@FindBy(name="industry")
	private WebElement industryDB;
	
	@FindBy(id="phone")
	private WebElement phoneNumberTextField;
	
	public WebElement getPhoneNumber() {
		return phoneNumberTextField;
	}

	public WebElement getOrgNameEdit() {
		return orgNameEdit;
	}
   
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createorg(String orgName)
	{
		orgNameEdit.sendKeys(orgName);
		saveBtn.click();
		
	}
	
	public void createorg(String orgName,String industry)
	{
		orgNameEdit.sendKeys(orgName);
		Select sel = new Select(industryDB);
		sel.selectByVisibleText(industry);
		saveBtn.click();
		
	}
	
	public void enterPhn(String phoneNumber)
	{
		phoneNumberTextField.sendKeys(phoneNumber);
		
		
	}
	
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industry;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement accounttype;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement rating;
	
	@FindBy(xpath="//input[@name='emailoptout']")
	private WebElement emailoptout;
	
	@FindBy(xpath="//input[@name='notify_owner']")
	private WebElement notify_owner;
	
	
	public WebElement getAccounttype() {
		return accounttype;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getEmailoptout() {
		return emailoptout;
	}

	public WebElement getNotify_owner() {
		return notify_owner;
	}
	
	/*public void clickRadioBtn()
	{		emailoptout.click();
	}
	
	public void clickNotifyRadioBtn()
	{
		notify_owner.click();
	}
	*/
	
	
	
	
}
