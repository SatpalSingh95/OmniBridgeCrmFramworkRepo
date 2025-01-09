package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage 
{
	
	WebDriver driver;
	public LeadPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement  headerMsg;
	
	
	public WebElement getHeaderMsg() {
		return headerMsg;
	}

	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement  leadBtn;
	
	@FindBy(id="fax")
	private WebElement faxField;
	 
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteField;
	
	@FindBy(id="secondaryemail")
	private WebElement secondaryEmail;
	
	
	
	public WebElement getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryemail) {
		secondaryEmail.sendKeys(secondaryemail);
	}

	public WebElement getWebsiteField() {
		return websiteField;
	}
	
	public void setWebsite(String website) {
		 websiteField.sendKeys(website);
	}

	public WebElement getFaxField() {
		return faxField;
	}
	
	public void setFax(String fax)
	{
		faxField.sendKeys(fax);
	}
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName;
	
	@FindBy(id="phone")
	private WebElement phoneNo;
	
	@FindBy(id="mobile")
	private WebElement mobileNo;
	
	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="noofemployees")
	private WebElement employeeNo;
	
	
	@FindBy(name="annualrevenue")
	private WebElement annualRevenue;
	
	@FindBy(id="designation")
	private WebElement titleField;
	
	
	
	public WebElement getLeadBtn() {
		return leadBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastNameField;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getEmployeeNo() {
		return employeeNo;
	}

	public WebElement getAnnualRevenue() {
		return annualRevenue;
	}

	public WebElement getTitleField() {
		return titleField;
	}
	
	
	
	public void setTitle(String title)
	{
		titleField.sendKeys(title);
	}

	public void clickOnLink()
	{
		leadBtn.click();
	}
	public void setFirstName(String FirstName)
	{
		firstName.sendKeys(FirstName);
	}
	
	public void  setlastName(String lastName)
	{
		lastNameField.sendKeys(lastName);
	}
	
	public void setCompanyName(String cname)
	{
		companyName.sendKeys(cname);
		
	}
	
	public void setPhone(String phNo)
	{
		
		phoneNo.sendKeys(phNo);
	}
	
	public void setMobNo(String phNo)
	{
		
		mobileNo.sendKeys(phNo);
	}
	public void setEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void setEmpNo(String empNo)
	{
		employeeNo.sendKeys(empNo);
	}
	
	public void setAnnualRevenue(String annualRev)
	{
		annualRevenue.sendKeys(annualRev);
		
	}
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void saveBtn()
	{
		saveBtn.click();
		
	}

	@FindBy(xpath="//td[@class='dvtTabCache']/../..//input[@title='Edit [Alt+E]']")
	private WebElement editBtn;
	public WebElement getEditBtn() {
		return editBtn;
	}
	
	public void editBtn()
	{
		editBtn.click();
	}
	 
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement editLastName;
	
	public WebElement getEditLastName() {
		return editLastName;
	}

	public void clearLastName()
	{
		editLastName.clear();
	}
	/*
	 * public void setNewLastName(String lastName1) {
	 * 
	 * editLastName.sendKeys(lastName1); }
	 */
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement newLastName1;
	public WebElement newEditLastName1() {
		return newLastName1;
	}
	public void setNewLastName(String newLastName)
	{
		newLastName1.sendKeys(newLastName);
	}
	
	
	@FindBy(xpath="//td[@class='dvtTabCache']/descendant::input[@name='Delete']")
	private WebElement clickDeleteBtn;
	public WebElement getClickDeleteBtn() {
		return clickDeleteBtn;
	}
	public void clickDeleteBtn()
	{
		clickDeleteBtn.click();
	}
	
	@FindBy(name="search_text")
	private WebElement searchText;
	public WebElement getSearchText() {
		return searchText;
	}
	
	public void setlastName1(String newLastName1)
	{
	searchText.sendKeys(newLastName1);	
	}
	/*
	@FindBy(name="search_field")
	private WebElement dropdown;
	public WebElement getDropdown() {
		return dropdown;
	}
	*/
	@FindBy(xpath="//select[@name='leadsource']")
			private WebElement leadSource;
	public WebElement getDropdown() {
		return leadSource;
	}
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement  industry;
	public WebElement getIndustry()
	{
		return industry;
	}
	
	@FindBy(xpath="//select[@name='leadstatus']")
	private WebElement leadStatus;
	public WebElement getLeadStatus() {
		return leadStatus;
	}

	@FindBy(xpath="//select[@name='rating']")
	private WebElement rating;
	public WebElement getRating() {
		return rating;
	}
	
	
	
	
}
