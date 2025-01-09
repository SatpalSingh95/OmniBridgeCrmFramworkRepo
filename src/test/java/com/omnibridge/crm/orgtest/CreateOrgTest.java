package com.omnibridge.crm.orgtest;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.omniBridge.crm.basetest.BaseClass;
import com.omniBridge.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.omniBridge.crm.objectrepositoryutility.OrganizationInfoPage;
import com.omniBridge.crm.objectrepositoryutility.OrganizationsPage;
import com.omniBridge.crm.webdriverutility.UtilityClassObject;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;




public class CreateOrgTest extends BaseClass
{
@Test(groups="smokeTest")
public void createOrgTest() throws EncryptedDocumentException, IOException
{
	System.out.println("execute createOrgTest & verify");
	

	
	// Read TestScript data from Excel file
				String orgName =eLib.getDataFromExcel("org", 1, 2)+jLib.getRandomNumber();
			
				
			
			
			OrganizationsPage op=new OrganizationsPage(driver);
			op.createOrg();
		    op.getCreateNewOrgBtn().click();
		 // enter all the details and create  new Organization
		    
		    
		
		    CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		    cnop.createorg(orgName);
		    
		WebDriverUtility wb=new WebDriverUtility();
		wb.select(cnop.getIndustry(),1);
		wb.select(cnop.getAccounttype(),1);
        wb.select(cnop.getRating(),1);
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", cnop.getEmailoptout());
      //  js.executeScript("arguments[0].click();", cnop.getEmailoptout());
        
       // js.executeScript("arguments[0].click();", cnop.getNotify_owner());
		//cnop.clickNotifyRadioBtn();
	//	cnop.clickRadioBtn();
			   
			
			// verify header msg expected result
			OrganizationInfoPage oip=new OrganizationInfoPage(driver);
			String actOrgName = oip.getHeaderMsg().getText();
			if(actOrgName.contains(orgName))
			{
			System.out.println(orgName + "name is verified ==Pass");	
			}
			else 
			{
				System.out.println(orgName + "name is not verified ==Fail");	
				
			}
			
}
@Test(groups="regressionTest")
public void createContactWithPhoneNumber() throws EncryptedDocumentException, IOException
{
	System.out.println("execute createOrgWithIndustries & verify");
	
	// Read TestScript data from Excel file
	String orgName =eLib.getDataFromExcel("org", 7, 2)+jLib.getRandomNumber();
	// Read TestScript data from Excel file
	String phoneNumber =eLib.getDataFromExcel("org", 7, 3);

	
	OrganizationsPage op=new OrganizationsPage(driver);
	op.createOrg();
    op.getCreateNewOrgBtn().click();
 // enter all the details and create  new Organization
    CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
    cnop.createorg(orgName);
	cnop.enterPhn(phoneNumber);
	
	cnop.getSaveBtn();
	

	// verify header phone Number info Expected Result

	
	String actPhoneNumber = driver.findElement(By.id("dtlview_Phone")).getText();
	if(actPhoneNumber.trim().contains(phoneNumber))
	{
		System.out.println(phoneNumber + "is created == PASS");
		}
	else
	{
		System.out.println(phoneNumber + "is not created == FAIL");
	}
}


}
