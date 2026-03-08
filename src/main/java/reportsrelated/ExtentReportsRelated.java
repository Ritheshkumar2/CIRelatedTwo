package reportsrelated;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsRelated {
	
	private static ExtentReports extent=null;
	
	public static ExtentReports instance() {
		
		if(extent == null) {
			ExtentSparkReporter  spk=new ExtentSparkReporter("reports/extentReport.html");
			spk.config().setReportName("Automation Test Results");
			spk.config().setDocumentTitle("Test Results");
			extent = new ExtentReports();
			extent.attachReporter(spk);
		}
		return extent;
		
	}

}
