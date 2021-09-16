package uitest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class CrossBrowserScript {
 
WebDriver driver;
 
/**
* This function will execute before each Test tag in testng.xml
* @param browser
* @throws Exception
*/

 
@Test
public void testParameterWithXML() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");   

	WebElement uname = driver.findElement(By.id("txtUsername"));
	
	uname.sendKeys("Admin");
	Thread.sleep(2000);
    WebElement passwd = driver.findElement(By.id("txtPassword"));
	
	passwd.sendKeys("admin123");
	
    WebElement submit = driver.findElement(By.id("btnLogin"));
	
	submit.click();
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
@Test
public void testParameterWithXML2() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");   

	WebElement uname = driver.findElement(By.id("txtUsername"));
	
	uname.sendKeys("Admin");
	Thread.sleep(2000);
    WebElement passwd = driver.findElement(By.id("txtPassword"));
	
	passwd.sendKeys("admin123");
	
    WebElement submit = driver.findElement(By.id("btnLogin"));
	
	submit.click();
	
	Thread.sleep(3000);
	
	driver.quit();
}
}