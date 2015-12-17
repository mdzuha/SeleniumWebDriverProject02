/**
 * 
 */
package com.paxotech.abercrombie.framework.scripts;

import java.awt.AWTException;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;




import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.xml.DOMConfigurator;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.log4j.Logger;
import com.paxotech.abercrombie.framework.controller.AbercrombieApplication;





/**
 * @author masihur
 *
 */

public class ScriptBase {
	
	protected WebDriver driver;
	protected SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh.mm.ss");
	protected AbercrombieApplication abercrombie;
	private static Logger log = Logger.getLogger(ScriptBase.class.getName());
	
	private ScreenRecorder screenRecorder;
	private File file = new File(System.getProperty("user.dir") + "/TestVideos/");

	
	
	/*----------------------------------------------*/
	
//	@BeforeSuite
//	public void startSuit(){
//
//		ClearDir.runPng();
//		ClearDir.runAvi();
//		ClearDir.runLog();
//	}


	/*----------------------------------------------*/
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(@Optional("ff") String browser) throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
			log.info("**********New Test Started**********");
		this.startRecording("AbercrombieTest");
		if (browser.contentEquals("ff")) {
			driver = new FirefoxDriver();
			log.info("New Fire Fox Driver Initiated");
		}

		else if (browser.contentEquals("ch")) {
			File chromeDriverFile = new File(System.getProperty("user.dir") + "/driver/32/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
			driver = new ChromeDriver();
			log.info("New Chrome Driver Initiated");
		} 
		else if (browser.contentEquals("ie")) {

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("internet explorer");
			capabilities.setCapability("ignoreZoomSetting", true);
			capabilities.setCapability("requireWindowFocus", true);

			File driverFile = new File(System.getProperty("user.dir") + "/driver/32/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", driverFile.getAbsolutePath());
			driver = new InternetExplorerDriver(capabilities);
			log.info("New Internet Explorer Driver Initiated");

		}
		else if(browser.contentEquals("rd_ff")){
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			
			driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"), capability);
			log.info("Remote Firefox Driver Initiated");
		}
		else if(browser.contentEquals("rd_ch")){
			File chromeDriverFile = new File(System.getProperty("user.dir") + "/driver/32/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
			
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setPlatform(Platform.ANY);
			
			driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"), capability);
			log.info("Remote Chrome Driver Initiated");
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Implicit Wait 30 Seconds Used");
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		log.info("Script Timeout Set to 30 Seconds");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("Page Load TimeOut Set to 60 Seconds");
		
		driver.manage().deleteAllCookies();
		log.info("All Cookies Deleted");
		
		driver.manage().window().maximize();
		log.info("Window Maximised");
		driver.navigate().to("http://www.abercrombie.com");
		log.info("Web Application Started");
	
	}
	
	
	/*----------------------------------------------*/
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws Exception{
		String desiredName = testResult.getName();
		System.out.println("Test Name: " + testResult.getName());
		
		if(testResult.getStatus() == ITestResult.FAILURE){
			this.captureScreen(desiredName);

		}
//		driver.close();
//		driver.quit();
		log.info("Browser Closed");
		this.stopRecording();

		abercrombie = null;
	}
	
	/*----------------------------------------------*/

	
//	@AfterSuite
//	public void endSuit(){
//		RenameFile.run();
//	}
	
	/*----------------------------------------------*/
	
	public AbercrombieApplication abercrombie(){
		if(abercrombie == null){
			abercrombie = new AbercrombieApplication(driver);
		}
		return abercrombie;
	}
	
	public  void startRecording(String fileName) throws Exception{
		
		this.screenRecorder = new SpecializedScreenRecorder(file, fileName);
		this.screenRecorder.start();
	}

	public void stopRecording() throws Exception {
		
		this.screenRecorder.stop();
	}
	
	
	
	public void captureScreen(String testName) {
		
		String path;
	    try {
	        
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        path = testName+"_" + source.getName();
	        FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"/FailedTestCases/"+path)); 
	    }
	    catch(IOException e) {
	        path = "Failed to capture screenshot: " + e.getMessage();
	    }
    }
	public void Screenshot(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle rectangle = new Rectangle(0, 0, screenSize.width, screenSize.height);
		
		try{
			Robot robot = new Robot();
			BufferedImage image = robot.createScreenCapture(rectangle);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image,  "png", baos);
			baos.flush();
			byte[] imageInByte = baos.toByteArray();
			baos.close();
//			KWDReporter.ReportEvent.log(LogStatus.INFO, "Screenshot", "Screenshot", imageInByte);			
		}catch(IOException e){
			e.printStackTrace();
		}catch(AWTException e){
			e.printStackTrace();
		}
	}
	public void captureScreenShot(){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	   
	
	

}
