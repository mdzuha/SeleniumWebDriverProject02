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
 * @author Masihur
 *
 */
public class AbercrombieFacebookLoginOptionPageFunctionality extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieFacebookLoginOptionPageFunctionality.class.getName());
	
	@Test
	public void facebookPageLinkFromSignInPageFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		test = reportFacebookFunc.startTest("FACEBOOK PAGE LINK FROM SIGN IN FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		test.log(LogStatus.INFO, "FACEBOOK FROM SIGN IN PAGE", "Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		test.log(LogStatus.INFO, "FACEBOOK PAGE", "Moved to Facebook Page");
		RenameFile.toBeRenamed.add("TestVideos/FBF_FacebookPageLinkFromSignInPageFunctionality "+dateFormat.format(new Date())+".avi");
		reportFacebookFunc.endTest(test);
		reportFacebookFunc.flush();
	
	}
	@Test
	public void facebookPageLinkFrombecomeAMemberPageFunctionality(){
		test = reportFacebookFunc.startTest("FACEBOOK PAGE LINK FROM BECOME A MEMBER PAGE FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().clickFacebookFromBecomeAMemberPage();;
		log.info("Click Facebook From Become A Member Page");
		test.log(LogStatus.INFO, "FACEBOOK FROM BECOME A MEMBER PAGE", "Click Facebook From Become A Member Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		test.log(LogStatus.INFO, "FACEBOOK PAGE", "Moved to Facebook Page");
		RenameFile.toBeRenamed.add("TestVideos/FBF_FacebookPageLinkFrombecomeAMemberPageFunctionality "+dateFormat.format(new Date())+".avi");
		reportFacebookFunc.endTest(test);
		reportFacebookFunc.flush();
	}
	@Test
	public void fillFacebookPageLogInForm(){
		test = reportFacebookFunc.startTest("FACEBOOK PAGE LOGIN FORM");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		test.log(LogStatus.INFO, "FACEBOOK FROM SIGN IN PAGE", "Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		test.log(LogStatus.INFO, "FACEBOOK PAGE", "Moved to Facebook Page");
		abercrombie().facebookOption().signInWithFacebook("marufrahman1349@gmail.com", "m17-0985");
		log.info("Fill in Facebook Sign in Form");
		test.log(LogStatus.INFO, "FACEBOOK LOGIN FORM", "Fill in Facebook Sign in Form");
		RenameFile.toBeRenamed.add("TestVideos/FBF_FillFacebookPageLogInForm "+dateFormat.format(new Date())+".avi");
		reportFacebookFunc.endTest(test);
		reportFacebookFunc.flush();
	}
	@Test
	public void checkBoxFacebookPageLogInForm(){
		test = reportFacebookFunc.startTest("FACEBOOK PAGE LOGIN FORM CHECKBOX");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "SIGN IN LINK", "Click the Sign In Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		test.log(LogStatus.INFO, "FACEBOOK FROM SIGN IN PAGE", "Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		test.log(LogStatus.INFO, "FACEBOOK PAGE", "Moved to Facebook Page");
		abercrombie().facebookOption().clickCheckBox();
		log.info("Check Check Box");
		test.log(LogStatus.INFO, "FACEBOOK PAGE CHECKBOX", "Check Check Box");
		RenameFile.toBeRenamed.add("TestVideos/FBF_CheckBoxFacebookPageLogInForm "+dateFormat.format(new Date())+".avi");
		reportFacebookFunc.endTest(test);
		reportFacebookFunc.flush();
		
	}
	
}
