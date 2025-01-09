package practiceTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class HandleDropDown {
@Test
public void CampaignDropdownTest()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='More']")).click();
	
	driver.findElement(By.name("Campaigns")).click();
	driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
	
	WebElement drop = driver.findElement(By.xpath("//select[@name='campaigntype']"));
	
	
	Select drpCampaign=new Select(drop);
	drpCampaign.selectByIndex(3);
	
	
	
	//drpCountry.selectByVisibleText("France");
	//drpCountry.selectByValue("japan");
	//drpCountry.selectByIndex(2);

}
}
