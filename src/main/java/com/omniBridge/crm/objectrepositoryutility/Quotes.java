package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quotes
{

	
	WebDriver driver;
	public Quotes(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(xpath="//img[@onclick='selectPotential()']")
	private WebElement potential_nameLookup;
	
	@FindBy(xpath="//img[@onclick='selectContact(\"false\",\"general\",document.EditView)']")
	private WebElement contact_nameLookup;
	
	@FindBy(xpath="//tbody/tr[7]/td[4]/img[1]")
	private WebElement organization_nameLookup;
	
	@FindBy(xpath="//input[@onclick=\"this.form.action.value='Save';  return validateInventory('Quotes')\"]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@name='shipping']")
	private WebElement shipping;
}
