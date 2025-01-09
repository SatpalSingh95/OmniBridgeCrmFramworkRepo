package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage 
{


	WebDriver driver;
	public CampaignPage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement campaignLink;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement UserNameField;
	
	@FindBy(name="campaigntype")
	private WebElement campaigntypeField;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement productLookUp;
	
	@FindBy(xpath="//input[@id='targetaudience']")
	private WebElement targetAudienceField;
	
	@FindBy(id="sponsor")
	private WebElement SponserField;
	
	@FindBy(id="numsent")
	private WebElement numsentField;
	
	@FindBy(id="targetsize")
	private WebElement targetsize;
	
	@FindBy(xpath="//input[@name='budgetcost']")
	private WebElement budgetCostField;
	
	@FindBy(id="expectedsalescount")
	private WebElement expectedsalescountField;
	
	@FindBy(name="expectedresponsecount")
	private WebElement expectedresponsecountField;
	
	@FindBy(name="expectedroi")
	private WebElement expectedRoiField;
	
	@FindBy(name="actualcost")
   private WebElement actualcostField;
	
	@FindBy(name="expectedrevenue")
	private WebElement expectedrevenue;
	
	@FindBy(id="actualsalescount")
	private WebElement actualsalesCountField;
	
	@FindBy(id="actualresponsecount")
	private WebElement actualresponsecountField;
	
	@FindBy(name="actualroi")
	private WebElement actualroi;
	
	@FindBy(name="description")
	private WebElement descriptionField;
	
	
	@FindBy(name="campaignstatus")
	private WebElement campaignstatusDropdown;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCampaignLink() {
		return campaignLink;
	}
	
	public void createNewCampaign()
	{
		campaignLink.click();
		
	}
	
	public WebElement getUserNameField() {
		return UserNameField;
	}
	
	public void setUsername(String firstName)
	{
		UserNameField.sendKeys(firstName);
		
	}
	public WebElement getCampaigntypeField() {
		return campaigntypeField;
	}
	public WebElement getProductLookUp() {
		return productLookUp;
	}
	public WebElement getTargetAudienceField() {
		return targetAudienceField;
	}
	public WebElement getSponserField() {
		return SponserField;
	}
	public WebElement getNumsentField() {
		return numsentField;
	}
	public WebElement getTargetsize() {
		return targetsize;
	}
	public WebElement getBudgetCostField() {
		return budgetCostField;
	}
	public WebElement getExpectedsalescountField() {
		return expectedsalescountField;
	}
	public WebElement getExpectedresponsecountField() {
		return expectedresponsecountField;
	}
	public WebElement getExpectedRoiField() {
		return expectedRoiField;
	}
	public WebElement getActualcostField() {
		return actualcostField;
	}
	public WebElement getExpectedrevenue() {
		return expectedrevenue;
	}
	public WebElement getActualsalesCountField() {
		return actualsalesCountField;
	}
	public WebElement getActualresponsecountField() {
		return actualresponsecountField;
	}
	public WebElement getActualroi() {
		return actualroi;
	}
	public WebElement getDescriptionField() {
		return descriptionField;
	}
	public WebElement getCampaignstatusDropdown() {
		return campaignstatusDropdown;
	}

@FindBy(xpath="//input[@class='crmButton small save']")
private WebElement saveBtn;

public WebElement getSaveBtn() {
	return saveBtn;
}
public void clickSaveBtn() {
	saveBtn.click();
}

@FindBy(xpath="//img[@alt='Select']")
private WebElement lookup;
public WebElement getLookup() {
	return lookup;
}
public void clickLookUpBtn()
{
lookup.click();	
}


	
}
