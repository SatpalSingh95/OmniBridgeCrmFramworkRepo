package practiceTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.omniBridge.crm.basetest.BaseClass;
import com.omniBridge.crm.objectrepositoryutility.CampaignPage;
import com.omniBridge.crm.objectrepositoryutility.CampaignSourceLookUpPage;
import com.omniBridge.crm.objectrepositoryutility.CreateCampaignProductLookUp;
import com.omniBridge.crm.objectrepositoryutility.CreateNewOrganizationLookUp;
import com.omniBridge.crm.objectrepositoryutility.CreateVendorInfoLookUpPage;
import com.omniBridge.crm.objectrepositoryutility.HomePage;
import com.omniBridge.crm.objectrepositoryutility.OpportunityPage;
import com.omniBridge.crm.objectrepositoryutility.ProductPage;
import com.omniBridge.crm.webdriverutility.WebDriverUtility;

public class Opptortunity extends BaseClass
{
@Test
public void opporTest() throws Throwable, IOException
{

	String opportunityName = eLib.getDataFromExcel("opportunities", 1, 0) + jLib.getRandomNumber();
	String amount = eLib.getDataFromExcel("opportunities", 1, 1);
	String nextStep = eLib.getDataFromExcel("opportunities", 1, 2);
	String probability  = eLib.getDataFromExcel("opportunities", 1, 3);
	HomePage   hp=new HomePage(driver);
	  hp.navigateToOpptortunitiesPage();
	OpportunityPage opr=new OpportunityPage(driver);
	opr.clickNewOpportunityLink();
	opr.setOppotunityName(opportunityName);
	opr.setProbability(probability);
	opr.setAmount(amount);
	opr.setnextStep(nextStep);
	opr.orgLookUp();
	

}
@Test
public void cmpTest() throws Throwable, IOException
{
	String opportunityName = eLib.getDataFromExcel("opportunities", 1, 0) + jLib.getRandomNumber();
	String amount = eLib.getDataFromExcel("opportunities", 1, 1);
	String nextStep = eLib.getDataFromExcel("opportunities", 1, 2);
	String probability  = eLib.getDataFromExcel("opportunities", 1, 3);

	HomePage hp=new HomePage(driver);
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
	cnp.searchInfo("jkl");
	cnp.searchButton();
	driver.findElement(By.xpath("//a[text()='" + "jkl" + "']")).click();
	

		WebDriverUtility wLib = null;
		// switch to parent window
		wLib.switchToTabOnURL(driver, "Contacts&action");
		
		
		opr.clickCampaignLookUp();
		
		//switch to child window
	WebDriverUtility wLibr = new WebDriverUtility();
	wLibr.switchToTabOnURL(driver, "http://localhost:8888/index.php?module=Campaigns&action=Popup&html=Popup_picker&popuptype=specific_campaign&form=EditView&fromlink=");
	
		CampaignSourceLookUpPage cslp=new CampaignSourceLookUpPage(driver);
		cslp.setData("firstName");
		cslp.clickSearchBtn();
		driver.findElement(By.xpath("//a[text()='" + "firstName" + "']")).click();
		

		// switch to parent window
		wLib.switchToTabOnURL(driver, "Campaigns&action");
		
		
		opr.saveBtn();

}
}
