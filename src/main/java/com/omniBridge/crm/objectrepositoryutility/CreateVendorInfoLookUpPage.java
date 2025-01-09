package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorInfoLookUpPage {

	
	
public WebDriver driver;

	
	
	public CreateVendorInfoLookUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="search_txt")
	private WebElement venderTextField;
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBtn;



	public WebElement getVenderTextField() {
		return venderTextField;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void setVendorInfo(String vendorName)
	{
		
		venderTextField.sendKeys(vendorName);;
	}
	public void clickOnSearchBtn()
	{
		searchBtn.click();
	}
}
