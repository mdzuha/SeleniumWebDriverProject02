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
public class AbercrombieSignInPageTabFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieSignInPageTabFunctionality.class.getName());
	
	@Test
	public void signInTabFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		test = reportSignInTab.startTest("SIGN IN TAB FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("SignIn Link Clicked");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().tabPress();
		log.info("Pressing Tab");
		RenameFile.toBeRenamed.add("TestVideos/STF_signInTabFunctionality "+dateFormat.format(new Date())+".avi");
		test.log(LogStatus.INFO, "TAB FUNCTIONALITY", "Press the Tab Button");
		reportSignInTab.endTest(test);
		reportSignInTab.flush();
	}
}
