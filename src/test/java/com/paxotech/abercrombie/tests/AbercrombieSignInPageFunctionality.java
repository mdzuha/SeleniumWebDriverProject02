/**
 * 
 */
package com.paxotech.abercrombie.tests;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.paxotech.abercrombie.framework.scripts.RenameFile;
import com.paxotech.abercrombie.framework.scripts.ScriptBase;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author masihur
 *
 */
public class AbercrombieSignInPageFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieSignInPageFunctionality.class.getName());
	
	@Test
	public void signIn(){
		DOMConfigurator.configure("log4j.xml");
		test = reportSignInFunc.startTest("SIGN IN");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().signIn("marufrahman1349@gmail.com", "m17-0985");
		log.info("Typing the Email and Password Text Box");
		test.log(LogStatus.INFO, "SIGN IN", "Typing Email And Password");
		RenameFile.toBeRenamed.add("TestVideos/SF_SignIn "+dateFormat.format(new Date())+".avi");
		reportSignInFunc.endTest(test);
		reportSignInFunc.flush();
		
	}
	@Test
	public void continueLinkFunctionality(){
		test = reportSignInFunc.startTest("CONTINUE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().clickContinue();
		log.info("Click Continue Button");
		test.log(LogStatus.INFO, "CONTINUE BUTTON", "Click the Continue Button");
		RenameFile.toBeRenamed.add("TestVideos/SF_ContinueLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportSignInFunc.endTest(test);
		reportSignInFunc.flush();
	}
	@Test
	public void facebookLinkFunctionality(){
		test = reportSignInFunc.startTest("FACEBOOK LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		test.log(LogStatus.INFO, "FACEBOOK LINK FROM SIGN IN PAGE", "Click Facebook From SignIn Page");
		RenameFile.toBeRenamed.add("TestVideos/SF_FacebookLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportSignInFunc.endTest(test);
		reportSignInFunc.flush();
	}
	
}
