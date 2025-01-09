package com.omniBridge.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)   // Object Initialization
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Products")
	private WebElement productLink;
	
	
public WebElement getProductLink() 
{
		return productLink;
	}

@FindBy(linkText="Organizations")
private WebElement orgLink;

@FindBy(linkText="Contacts")
private WebElement contactLink;

@FindBy(linkText = "Campaigns")
private WebElement campaignlink;


@FindBy(linkText = "More")
private WebElement morelink;

@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement adminImg;

@FindBy(linkText = "Sign Out")
private WebElement signoutlink;

@FindBy(xpath="//a[@name='Vendors']")
private WebElement vendorLink;


@FindBy(xpath="//a[@href='index.php?module=Potentials&action=index']")
private WebElement opportunitiesLink;


public WebElement getVendorLink() {
	return vendorLink;
}

public WebElement getOrgLink() {
	return orgLink;
}

public WebElement getContactLink() {
	return contactLink;
}




// business library

public WebElement getCampaignlink() {
	return campaignlink;
}



public WebElement getMorelink() {
	return morelink;
}

public void navigateToCampaignPage()
{
	Actions act = new Actions(driver);
	act.moveToElement(morelink).perform();
	campaignlink.click();
}



public void navigateToVendorPage()
{
	Actions act = new Actions(driver);
	act.moveToElement(morelink).perform();
	vendorLink.click();
}


public void navigateToProductPage()
{
	Actions act = new Actions(driver);
	act.moveToElement(morelink).perform();
	productLink.click();
}

@FindBy(xpath="//a[text()='Leads']")
private WebElement leadLink;

public WebElement getLeadLink() {
	return leadLink;
}

public void navigateToLeadPage()
{
	Actions act = new Actions(driver);
	act.moveToElement(morelink).perform();
	leadLink.click();
}
public void navigateToOpptortunitiesPage()
{
	
	opportunitiesLink.click();
}



public void logout()
{
Actions act=new Actions(driver);
act.moveToElement(adminImg).perform();
signoutlink.click();

}

}
