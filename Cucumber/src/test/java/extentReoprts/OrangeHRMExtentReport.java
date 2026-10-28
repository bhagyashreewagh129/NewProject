package extentReoprts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class OrangeHRMExtentReport {

   //ExtentHTMLReporter is predefined class from com.aventstack package
   //it is used to store the report at given location
	
	public static ExtentSparkReporter reporter;
	
	public static ExtentReports extent;
	
	public static ExtentReports getReportInstance() {
		
		if(extent==null) {
		reporter=new ExtentSparkReporter("Reports/OrangeHRMReports.html");
		reporter.config().setReportName("OrangeHRM Login Test")	;
		reporter.config().setDocumentTitle("Automation Report");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Domain", "orangehrmlive.com");
		extent.setSystemInfo("Browser name", "chrome");
		extent.setSystemInfo("Host", "Deployed");
		extent.setSystemInfo("Tester name", "Bhagyashree");
		reporter.config().setTheme(Theme.DARK);
		}
		return extent;
		
	}
}
