package reportsrelated;

import com.aventstack.extentreports.ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	
	  ExtentReports extent = ExtentReportsRelated.instance();

	    public void onTestStart(ITestResult result) {

	        ExtentTestManager.setTest(
	                extent.createTest(result.getMethod().getMethodName()));
	    }

	    public void onTestSuccess(ITestResult result) {

	        ExtentTestManager.getTest().pass("Test Passed");
	    }

	    public void onTestFailure(ITestResult result) {

	        ExtentTestManager.getTest().fail(result.getThrowable());
	    }
	    public void onFinish(ITestContext context) {

	        extent.flush();   
	    }
}
