package utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentReports extent;
	public static ExtentReports getInstance() {
	    
	    	String basePath = System.getProperty("user.dir");
	    	String reportPath = basePath + "/reports/AutomationReport.html";

	        // Ensure reports folder exists
	        File reportFolder = new File("reportPath");
	       

	        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
	        spark.config().setReportName("Automation Test Report");
	        spark.config().setDocumentTitle("Extent Report");

	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	        extent.setSystemInfo("OS", System.getProperty("os.name"));
	        extent.setSystemInfo("Tester", "YourName");
	        System.out.println("reports");
	    return extent;
	}
}
