package uitest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample{
	
	ExtentSparkReporter reporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp() {
		reporter = new ExtentSparkReporter("myreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	@Test
	public void TestMethod() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException{
		ExtentTest test = extent.createTest("My first test");
		test.log(Status.INFO, "This shows info");

		//System.setProperty("webdriver.chrome.driver","C:/Users/sanjayp/eclipse-workspace-PicnicSelenium/SeleniumProject/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//chrome web driver instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");   

		WebElement uname = driver.findElement(By.id("txtUsername"));
		
		uname.sendKeys("Admin");
		Thread.sleep(2000);
        WebElement passwd = driver.findElement(By.id("txtPassword"));
		
		passwd.sendKeys("admin123");
		
        WebElement submit = driver.findElement(By.id("btnLogin"));
		
		submit.click();
		
		Thread.sleep(3000);
		
		driver.quit();}
		
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
		
}
