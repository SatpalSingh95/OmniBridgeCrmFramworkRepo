package com.omnibridge.crm.leadtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.omniBridge.crm.basetest.BaseClass;
import com.omniBridge.crm.objectrepositoryutility.HomePage;
import com.omniBridge.crm.objectrepositoryutility.LeadPage;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;

public class CreateLeadTest extends BaseClass
{
	@Test(groups={"smokeTest"})
	public void createNewLead() throws Throwable, IOException
	{
		System.out.println("==============================Create new Lead=========================");
		
		String firstName=eLib.getDataFromExcel("lead", 1, 0)+jLib.getRandomNumber();
		String lastName = eLib.getDataFromExcel("lead", 1, 1) + jLib.getRandomNumber();
		String phnNo=eLib.getDataFromExcel("lead", 1, 2);
		String mobNo = eLib.getDataFromExcel("lead", 1, 3);
		String title=eLib.getDataFromExcel("lead", 1, 4);
		String fax = eLib.getDataFromExcel("lead", 1, 5);
		
		String email =eLib.getDataFromExcel("lead", 1, 6);
		String website = eLib.getDataFromExcel("lead", 1, 7);
		String annualRevenue=eLib.getDataFromExcel("lead", 1, 8);
		String NoOfEmp = eLib.getDataFromExcel("lead", 1, 9);
		
		String cname=eLib.getDataFromExcel("lead", 1, 10);
		String secondaryEmail = eLib.getDataFromExcel("lead", 1, 11);
		
		HomePage hp=new HomePage(driver);
		hp.getLeadLink().click();
		
	LeadPage lp=new LeadPage(driver);
		lp.clickOnLink();
		
		lp.setFirstName(firstName);
		lp.setlastName(lastName);
		lp.setPhone(phnNo);
		lp.setMobNo(mobNo);
		lp.setTitle(title);
		lp.setFax(fax);
		lp.setEmail(email);
		lp.setWebsite(website);
		lp.setAnnualRevenue(annualRevenue);
		lp.setEmpNo(NoOfEmp);
		lp.setCompanyName(cname);
		lp.setSecondaryEmail(secondaryEmail);
		
		
		//WebElement leadsource = driver.findElement(By.xpath("//select[@name='leadsource']"));
		
		WebDriverUtility wb=new WebDriverUtility();
		wb.select(lp.getDropdown(), 5);
		wb.select(lp.getIndustry(), 11);
		wb.select(lp.getLeadStatus(),"Hot");
		wb.select(lp.getRating(),"Active");
		lp.saveBtn();
		
		
		
		//verify Header lastName Info Expected Result
				String  actHeader=lp.getHeaderMsg().getText();
				boolean status=actHeader.contains(lastName);
				
				
				Assert.assertEquals(status, true);
				
				
				String actLastName = driver.findElement(By.id("mouseArea_Last Name")).getText();
				
				SoftAssert soft=new SoftAssert();
				soft.assertEquals(actLastName, lastName);
		
	}
	@Test(groups={"regressionTest"})
	public void createLeadAndEdit() throws Throwable, IOException
	{
	System.out.println("=================CreateLeadAndEdit==================");	
		
	String firstName=eLib.getDataFromExcel("lead", 1, 0)+jLib.getRandomNumber();
	String lastName = eLib.getDataFromExcel("lead", 1, 1) + jLib.getRandomNumber();
	String phnNo=eLib.getDataFromExcel("lead", 1, 2);
	String mobNo = eLib.getDataFromExcel("lead", 1, 3);
	String title=eLib.getDataFromExcel("lead", 1, 4);
	String fax = eLib.getDataFromExcel("lead", 1, 5);
	
	String email =eLib.getDataFromExcel("lead", 1, 6);
	String website = eLib.getDataFromExcel("lead", 1, 7);
	String annualRevenue=eLib.getDataFromExcel("lead", 1, 8);
	String NoOfEmp = eLib.getDataFromExcel("lead", 1, 9);
	
	String cname=eLib.getDataFromExcel("lead", 1, 10);
	String secondaryEmail = eLib.getDataFromExcel("lead", 1, 11);
	String newLastName = eLib.getDataFromExcel("lead", 2, 1);
	
	HomePage hp=new HomePage(driver);
	hp.getLeadLink().click();
	
LeadPage lp=new LeadPage(driver);
	lp.clickOnLink();
	
	lp.setFirstName(firstName);
	lp.setlastName(lastName);
	lp.setPhone(phnNo);
	lp.setMobNo(mobNo);
	lp.setTitle(title);
	lp.setFax(fax);
	lp.setEmail(email);
	lp.setWebsite(website);
	lp.setAnnualRevenue(annualRevenue);
	lp.setEmpNo(NoOfEmp);
	lp.setCompanyName(cname);
	lp.setSecondaryEmail(secondaryEmail);
	
	lp.saveBtn();
	
	lp.editBtn();
	
	lp.clearLastName();
	lp.setNewLastName(newLastName);
	
	lp.saveBtn();
	
	//verify Header lastName Info Expected Result
	String  actHeader=lp.getHeaderMsg().getText();
	boolean status=actHeader.contains(newLastName);
	
	
	Assert.assertEquals(status, true);
	
	
	String actLastName = driver.findElement(By.id("mouseArea_Last Name")).getText();
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actLastName,newLastName);
	}
	
	
	@Test(groups={"regressionTest"})
	public void createLeadAndDelete() throws Throwable, IOException
	{
	System.out.println("=================CreateLeadAndEdit==================");	
		
	String firstName=eLib.getDataFromExcel("lead", 1, 0)+jLib.getRandomNumber();
	String lastName = eLib.getDataFromExcel("lead", 1, 1) + jLib.getRandomNumber();
	String phnNo=eLib.getDataFromExcel("lead", 1, 2);
	String mobNo = eLib.getDataFromExcel("lead", 1, 3);
	String title=eLib.getDataFromExcel("lead", 1, 4);
	String fax = eLib.getDataFromExcel("lead", 1, 5);
	
	String email =eLib.getDataFromExcel("lead", 1, 6);
	String website = eLib.getDataFromExcel("lead", 1, 7);
	String annualRevenue=eLib.getDataFromExcel("lead", 1, 8);
	String NoOfEmp = eLib.getDataFromExcel("lead", 1, 9);
	
	String cname=eLib.getDataFromExcel("lead", 1, 10);
	String secondaryEmail = eLib.getDataFromExcel("lead", 1, 11);
	String newLastName = eLib.getDataFromExcel("lead", 2, 1);
	
	HomePage hp=new HomePage(driver);
	hp.getLeadLink().click();
	
LeadPage lp=new LeadPage(driver);
	lp.clickOnLink();
	
	lp.setFirstName(firstName);
	lp.setlastName(lastName);
	lp.setPhone(phnNo);
	lp.setMobNo(mobNo);
	lp.setTitle(title);
	lp.setFax(fax);
	lp.setEmail(email);
	lp.setWebsite(website);
	lp.setAnnualRevenue(annualRevenue);
	lp.setEmpNo(NoOfEmp);
	lp.setCompanyName(cname);
	lp.setSecondaryEmail(secondaryEmail);
	
	lp.saveBtn();
	
	lp.clickDeleteBtn();
	
	driver.switchTo().alert().accept();
	

	}
}
