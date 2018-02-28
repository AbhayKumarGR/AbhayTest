package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Old_TestCase_POF {
	static WebDriver driver;
	 @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
	 
	 static WebElement lnk_MyAccount;
 
	 @FindBy(how = How.ID, using = "log")
 
	 static WebElement txtbx_UserName;
 
	 @FindBy(how = How.ID, using = "pwd")
 
	 static WebElement txtbx_Password;
 
	 @FindBy(how = How.NAME, using = "submit")
 
	 static WebElement btn_Login ;
 
	 @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
 
	 static WebElement lnk_LogOut;
	
	public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "../WebdriverTest/src/test/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	   
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://store.demoqa.com");
 
		// In order for this code to work and not throw a NullPointerException because 
 
		// the "log", "pwd" nd "submit" fields aren't instantiated, we need to initialise the PageObject
 
		PageFactory.initElements(driver, Old_TestCase_POF.class);
 
		// Once Instantiated, we can now use the above created WebElements
 
		PageFactory.initElements(driver, Old_TestCase_POF.class);
		 
        lnk_MyAccount.click();
 
        txtbx_UserName.sendKeys("testuser_1");
 
        txtbx_Password.sendKeys("Test@123");
 
        btn_Login.click();
 
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
        lnk_LogOut.click();
 
        driver.quit();
}
}
