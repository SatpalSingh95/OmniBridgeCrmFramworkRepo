package com.omnibridge.crm.opportunitiestest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.omniBridge.crm.basetest.BaseClass;
import com.omniBridge.crm.objectrepositoryutility.CampaignPage;
import com.omniBridge.crm.objectrepositoryutility.CampaignSourceLookUpPage;
import com.omniBridge.crm.objectrepositoryutility.CreateCampaignProductLookUp;
import com.omniBridge.crm.objectrepositoryutility.CreateNewOrganizationLookUp;
import com.omniBridge.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.omniBridge.crm.objectrepositoryutility.CreateVendorInfoLookUpPage;
import com.omniBridge.crm.objectrepositoryutility.HomePage;
import com.omniBridge.crm.objectrepositoryutility.OpportunityPage;
import com.omniBridge.crm.objectrepositoryutility.OrganizationInfoPage;
import com.omniBridge.crm.objectrepositoryutility.OrganizationsPage;
import com.omniBridge.crm.objectrepositoryutility.ProductPage;
import com.omniBridge.crm.objectrepositoryutility.VendorPage;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;

public class CreateNewOpportunities extends BaseClass
{
@Test(groups={"regressionTest"})
public void createNewOpportunitiesTest() throws Throwable, IOException
{
	System.out.println("=============Create Organization========================");

	

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
			
			
			System.out.println("============Create New vendor====================================");
			String vendorName = eLib.getDataFromExcel("campaign", 5, 1) + jLib.getRandomNumber();
			String vendorEmail = eLib.getDataFromExcel("campaign", 5, 2);


		    // Navigate to vendor module 
			
				 HomePage hp=new HomePage(driver);
				  hp.navigateToVendorPage();
				  
			  VendorPage vp=new VendorPage(driver);
			  vp.clickVendorLink();
				  vp.setVendorName(vendorName);
				  vp.setEmail(vendorEmail);
				  vp.clickOnSaveBtn();
				  Thread.sleep(2000);
				  
				//verify Header vendorName Info Expected Result
				String  actHeader=vp.getHeaderMsg().getText();
					boolean status=actHeader.contains(vendorName);
					
					
					Assert.assertEquals(status, true);
					
					
					String actLastName = driver.findElement(By.id("dtlview_Vendor Name")).getText();
					
					SoftAssert soft=new SoftAssert();
					soft.assertEquals(actLastName,vendorName);
				System.out.println("this is verified");
		 System.out.println("============================================================================================================");
			
			System.out.println("============Create New Product======= ");
			String productName = eLib.getDataFromExcel("campaign", 5, 3) + jLib.getRandomNumber();

		    // Navigate to Product module 
			
				 // hp=new HomePage(driver);
				  hp.navigateToProductPage();
				  
				  ProductPage pp= new ProductPage(driver);
				  pp.clickOnLink();
				  
				  pp.setProductName(productName);
		          
				  pp.clickOnLookUp();
				  
				  
				  
				  
				//switch to child window
					WebDriverUtility wLib = new WebDriverUtility();
					wLib.switchToTabOnURL(driver, "http://localhost:8888/index.php?module=Vendors&action=Popup&html=Popup_picker&popuptype=specific&form=EditView&fromlink=");
			System.out.println(driver.getCurrentUrl());
			
			CreateVendorInfoLookUpPage cvl=new CreateVendorInfoLookUpPage(driver);
			cvl.setVendorInfo(vendorName);
			cvl.clickOnSearchBtn();
			
			driver.findElement(By.xpath("//a[text()='" + vendorName + "']")).click();
			

				// switch to parent window
				wLib.switchToTabOnURL(driver, "Products&action");
				
		pp.ClickOnSaveBtn();
		
		
		
			System.out.println("=========================================================================================================================================================");
			
			System.out.println("========Create CampaignTest===============");
			
			String firstName = eLib.getDataFromExcel("campaign", 1, 1) + jLib.getRandomNumber();

			
		    // Navigate to campaign module 
			
				  hp=new HomePage(driver);
				  hp.navigateToCampaignPage();
				  
				  CampaignPage cp= new CampaignPage(driver);
				  cp.createNewCampaign();
				  
				  cp.setUsername(firstName);
				  
				  cp.clickLookUpBtn();
					//switch to child window
						 wLib = new WebDriverUtility();
						wLib.switchToTabOnURL(driver, "http://localhost:8888/index.php?module=Products&action=Popup&html=Popup_picker&form=HelpDeskEditView&popuptype=specific&fromlink=");
				System.out.println(driver.getCurrentUrl());
				
				
				CreateCampaignProductLookUp cpl=new CreateCampaignProductLookUp(driver);
				
				//System.out.println(productName);
			cpl.setData(productName);
				cpl.clickonSearchBtn();
				
				
				driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
				

				// switch to parent window
				wLib.switchToTabOnURL(driver, "Products&action");
				

				 // cpl.clickonSearchBtn();
				 cp.clickSaveBtn();
				 
				 
				 System.out.println("========================create Opportunity=============================");
				
				 
					String opportunityName = eLib.getDataFromExcel("opportunities", 1, 0) + jLib.getRandomNumber();
					String amount = eLib.getDataFromExcel("opportunities", 1, 1);
					String nextStep = eLib.getDataFromExcel("opportunities", 1, 2);
					String probability  = eLib.getDataFromExcel("opportunities", 1, 3);

					 hp=new HomePage(driver);
					 hp.navigateToOpptortunitiesPage();
					
					OpportunityPage opr=new OpportunityPage(driver);
					opr.clickNewOpportunityLink();
					opr.setOppotunityName(opportunityName);
					opr.setProbability(probability);
					opr.setAmount(amount);
					opr.setnextStep(nextStep);
					opr.orgLookUp();
					
					//switch to child window
					WebDriverUtility wLibrary = new WebDriverUtility();
					wLibrary.switchToTabOnURL(driver, "http://localhost:8888/index.php?module=Accounts&action=Popup&html=Popup_picker&form=vtlibPopupView&forfield=related_to&srcmodule=Potentials&forrecord=");
					
					CreateNewOrganizationLookUp cnp=new CreateNewOrganizationLookUp(driver);
					cnp.searchInfo(orgName);
					cnp.searchButton();
					driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
					

			  		// switch to parent window
			  		wLib.switchToTabOnURL(driver, "Contacts&action");
			  		
			  		
			  		opr.clickCampaignLookUp();
			  		
			  		//switch to child window
					WebDriverUtility wLibr = new WebDriverUtility();
					wLibr.switchToTabOnURL(driver, "http://localhost:8888/index.php?module=Campaigns&action=Popup&html=Popup_picker&popuptype=specific_campaign&form=EditView&fromlink=");
					
			  		CampaignSourceLookUpPage cslp=new CampaignSourceLookUpPage(driver);
			  		cslp.setData(firstName);
			  		cslp.clickSearchBtn();
			  		driver.findElement(By.xpath("//a[text()='" + firstName + "']")).click();
			  		

			  		// switch to parent window
			  		wLib.switchToTabOnURL(driver, "Campaigns&action");
			  		
			  		//JavascriptExecutor jse = (JavascriptExecutor) driver;
			      //  jse.executeScript("arguments[0].click()", opr.getSaveBtn());
			  		opr.saveBtn();
			  		
}
}
