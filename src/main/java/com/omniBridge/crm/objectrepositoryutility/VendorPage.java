package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage 
{
public WebDriver driver;

	
	
	public VendorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="lvtHeaderText")
	private WebElement headerMsg;
	
	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void clickBtn()
	{
		searchBtn.click();
		
	}
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement lookupBtn;	
	
	@FindBy(id="search_txt")
	private WebElement searchTextField;
	
	public WebElement getLookupBtn() {
		return lookupBtn;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	public void clickOnLookupBtn()
	{
		lookupBtn.click();
		
	}
	
	public void setVendor(String vendorName)
	{
		searchTextField.sendKeys(vendorName);
		
	}
	
	
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement vendorLink;	
	
	@FindBy(name="vendorname")
	private WebElement vendorNameTextField;
	
	@FindBy(id="email")
	private WebElement emailTextField;

	@FindBy(xpath="//input[@value='  Save  ']")
private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getVendorLink() {
		return vendorLink;
	}
	
	public void clickVendorLink()
	{
		getVendorLink().click();
		
	}

	public WebElement getVendorNameTextField() {
		return vendorNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	
	public void setVendorName(String vendorName)
	{
		vendorNameTextField.sendKeys(vendorName);
	}
	public void setEmail(String vendorEmail)
	{
		emailTextField.sendKeys(vendorEmail);
	}
	
	
}
