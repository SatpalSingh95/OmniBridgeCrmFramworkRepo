package com.omnibridge.crm.compaigntest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.omniBridge.crm.basetest.BaseClass;
import com.omniBridge.crm.objectrepositoryutility.CampaignPage;
import com.omniBridge.crm.objectrepositoryutility.CreateCampaignProductLookUp;
import com.omniBridge.crm.objectrepositoryutility.CreateVendorInfoLookUpPage;
import com.omniBridge.crm.objectrepositoryutility.HomePage;
import com.omniBridge.crm.objectrepositoryutility.ProductPage;
import com.omniBridge.crm.objectrepositoryutility.VendorPage;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;

public class CreateCampaignTest extends BaseClass
{
	@Test(groups="smokeTest")
	public void createVendorTest() throws Throwable, IOException
	{
		System.out.println("============Create New vendor======= ");
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
	 
	}
	
	@Test(groups="regressionTest")
	public void createProductWithVendorTest() throws Throwable, IOException
	{

		System.out.println("============Create New vendor======= ");
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

String actProductName = driver.findElement(By.className("lvtHeaderText")).getText();
if (actProductName.trim().contains(productName)) {
	System.out.println(productName + "is verified == PASS");
} else {
	System.out.println(productName + "is not verified == FAIL");
}
		
	}
	
	
@Test(groups="regressionTest")
public void campaignTestWithProduct() throws Throwable, IOException
{
	System.out.println("============Create New vendor======= ");
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
	System.out.println("================================");
	
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
		
		  
		  
}
}
