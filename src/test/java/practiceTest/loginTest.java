package practiceTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.omniBridge.crm.fileutility.FileUtility;
import com.omniBridge.crm.objectrepositoryutility.LoginPage;

public class loginTest {
@Test
public void loginTest() throws IOException
{
System.out.println("login Test");	
/*
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
 

driver.get(url);
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
driver.findElement(By.xpath("//input[@id='submitButton']")).click();
*/
WebDriver driver = new ChromeDriver();
FileUtility fLib=new FileUtility();
String url = fLib.getDataFromPropertiesFile("url");
String username=fLib.getDataFromPropertiesFile("username");
String password=fLib.getDataFromPropertiesFile("password");
LoginPage lp=new LoginPage(driver);
lp.loginToapp(username, password, url);


}
}
