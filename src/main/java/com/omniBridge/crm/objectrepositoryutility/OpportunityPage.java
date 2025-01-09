package com.omniBridge.crm.objectrepositoryutility;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {

	WebDriver driver;
	public OpportunityPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createOpportunityLink;
	@FindBy(name="potentialname")
	private WebElement opportunityName;
	
	@FindBy(xpath="(//img[@alt='Select'])[1]")
	private WebElement orgLookUp;
	
	@FindBy(xpath="(//img[@alt='Select'])[2]")
	private WebElement campaignLookUp;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement typeDropdown;
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amount;
	
	@FindBy(xpath="//input[@name='nextstep']")
	private WebElement nextStep;
	
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement salesStage;
	
	@FindBy(xpath="//input[@name='probability']")
	private WebElement probability;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	public WebElement getCreateOpportunityLink() {
		return createOpportunityLink;
	}

	public WebElement getOpportunityName() {
		return opportunityName;
	}

	public WebElement getOrgLookUp() {
		return orgLookUp;
	}

	public WebElement getCampaignLookUp() {
		return campaignLookUp;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public WebElement getAmount() {
		return amount;
	}

	public WebElement getNextStep() {
		return nextStep;
	}

	public WebElement getSalesStage() {
		return salesStage;
	}

	public WebElement getProbability() {
		return probability;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void clickNewOpportunityLink()
	{
		getCreateOpportunityLink().click();
	}
	
	public void setOppotunityName(String opporName)
	{
		
		opportunityName.sendKeys(opporName);
	}
	
	public void setAmount(String amt)
	{
		
		amount.sendKeys(amt);
	}
	public void setnextStep(String step)
	{
		
		nextStep.sendKeys(step);
	}
	public void setProbability(String prob)
	{
		
		probability.sendKeys(prob);
	}
	
	public void orgLookUp()
	{
		orgLookUp.click();
	}
	
	public void saveBtn()
	{
		saveBtn.click();
	}
	
	public void clickCampaignLookUp()
	{
		campaignLookUp.click();
	}


	
}
