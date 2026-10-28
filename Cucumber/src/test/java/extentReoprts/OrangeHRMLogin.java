package extentReoprts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class OrangeHRMLogin {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent=OrangeHRMExtentReport.getReportInstance();
	}
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(3000);
		test=extent.createTest("OrangeHRM Login TestCase");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");Thread.sleep(2000);
		test.info("Opened orangehrm URL");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin"); Thread.sleep(2000);
		test.info("Entered username");
		driver.findElement(By.name("password")).sendKeys("admin123"); Thread.sleep(2000);
		test.info("Entered password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();  Thread.sleep(2000);
		test.info("Clicked on Login button");
		
//		driver.findElement(By.linkText("Admin")).click();
//		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
//		
		
		String expected="Admin";
		String actual=driver.findElement(By.xpath("//button[@class=\\\"oxd-button oxd-button--medium oxd-button--secondary\\\"]")).getText(); 
		
		if(actual.equals(expected)) {
			test.pass("Login successful");
			System.out.println("Login successful");
			}
		else {
			test.fail("Login failed");
			System.out.println("Login failed");
		}
	}
//	driver.findElement(By.linkText("Admin")).click();
//	driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
//	
		
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		 driver.quit();
	}
	@AfterSuite
	public void flushReport() {
		extent.flush();
	}

}
