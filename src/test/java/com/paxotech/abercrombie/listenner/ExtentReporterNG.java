package com.paxotech.abercrombie.listenner;

/**
 * Created by shrofs on 7/16/2015.
 */

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG implements IReporter {
    private ExtentReports extent;

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
    	String filePath = System.getProperty("user.dir")+"/test-output/extent-report/test-result.html";
    	extent = new ExtentReports(filePath, true);

        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();

            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();

                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
            }
        }

        extent.flush();
    }

    private void buildTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;

        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
            	String testName = result.getMethod().getMethodName().toUpperCase();
                test = extent.startTest(testName);

                String message = "TEST " + status.toString().toUpperCase() + "ED";

                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
                
                System.out.println(result.getStatus());
                
                if(result.getStatus() == 0)
                	test.addScreenCapture("C:/Users/Masihur/Pictures/flower.jpg");
                test.assignAuthor("Masihur");
                test.log(status, "Result of test "+"'"+testName+"'", message);

                extent.endTest(test);
            }
        }
    }
}