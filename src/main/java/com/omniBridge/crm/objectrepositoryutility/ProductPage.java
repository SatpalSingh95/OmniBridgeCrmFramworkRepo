package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	

	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductLink;
	
	@FindBy(name="productname")
	private WebElement productNametextField;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement vendorLookUp;
	
	@FindBy(id="search_txt")
	private WebElement searchTxtField;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	public WebElement getCreateProductLink() {
		return createProductLink;
	}

	public WebElement getProductNametextField() {
		return productNametextField;
	}

	public WebElement getVendorLookUp() {
		return vendorLookUp;
	}

	public WebElement getSearchTxtField() {
		return searchTxtField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void clickOnLink()
	{
		createProductLink.click();
		
	}
	
	public void setProductName(String productName)
	{
		productNametextField.sendKeys(productName);
		
	}
	
	public void clickOnLookUp()
	{
		vendorLookUp.click();
		
	}
	
	public void setTextFieldData(String vendorName)
	{
		searchTxtField.sendKeys(vendorName);
		
	}
	public void clickOnSearchBtn()
	{
		searchBtn.click();
		
	}
	
	@FindBy(xpath="//input[@name='button']")
	private WebElement saveBtn;
	public void ClickOnSaveBtn()
	{
		
		saveBtn.click();
	}
	
	
	
}
