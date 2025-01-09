package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignProductLookUp {

	
public WebDriver driver;

	
	
	public CreateCampaignProductLookUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="search_txt")
	private WebElement  searchTextField;
	
	@FindBy(name="search")
	private WebElement  searchBtn;





	
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void setData(String productName)
	{
		
		searchTextField.sendKeys(productName);
	}
	
	public void clickonSearchBtn()
	{
		searchBtn.click();
	}
	
	
}
