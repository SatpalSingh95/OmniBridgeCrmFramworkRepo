package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInfoPage {


	WebDriver driver;
	public LeadInfoPage(WebDriver driver)   // Object Initialization
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="firstname")
	private WebElement firstNameField;
	
	@FindBy(name="lastname")
	private WebElement lastNameField;
	
	
	@FindBy(name="company")
	private WebElement companyNameField;
	
	
	
	
}
