package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageFactory_TestCase {
	static WebDriver driver;	 
	Home_PG_POF HomePage;
	LogIn_PG_POF LoginPage;
	
	 @BeforeMethod
	 
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "../WebdriverTest/src/test/resources/chromedriver.exe");
		  driver = new ChromeDriver();	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	      driver.get("http://www.store.demoqa.com");	 
	      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);	 
	      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
	 
	  }
	 
	 @Test	 
	  public void test() {
	 
	      HomePage.lnk_MyAccount.click();	 
	      LoginPage.LogIn_Action("testuser_1", "Test@123");	 
	      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");	 
	      HomePage.lnk_LogOut.click();
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {	 
		  driver.quit();	 
	  }
}
