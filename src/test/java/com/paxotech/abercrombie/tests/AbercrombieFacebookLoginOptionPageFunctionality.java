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

/**
 * @author Masihur
 *
 */
public class AbercrombieFacebookLoginOptionPageFunctionality extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieFacebookLoginOptionPageFunctionality.class.getName());
	
	@Test
	public void facebookPageLinkFromSignInPageFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		RenameFile.toBeRenamed.add("TestVideos/FBF_FacebookPageLinkFromSignInPageFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Moved to Facebook Page");
	
	}
	@Test
	public void facebookPageLinkFrombecomeAMemberPageFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().becomeAMember().clickFacebookFromBecomeAMemberPage();;
		log.info("Click Facebook From Become A Member Page");
		abercrombie().facebookOption().moveToFacebookPage();
		RenameFile.toBeRenamed.add("TestVideos/FBF_FacebookPageLinkFrombecomeAMemberPageFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Moved to Facebook Page");
		
	}
	@Test
	public void fillFacebookPageLogInForm(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		abercrombie().facebookOption().signInWithFacebook("marufrahman1349@gmail.com", "m17-0985");
		RenameFile.toBeRenamed.add("TestVideos/FBF_FillFacebookPageLogInForm "+dateFormat.format(new Date())+".avi");
		log.info("Fill in Facebook Sign in Form");
	}
	@Test
	public void checkBoxFacebookPageLogInForm(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		abercrombie().facebookOption().clickCheckBox();
		RenameFile.toBeRenamed.add("TestVideos/FBF_CheckBoxFacebookPageLogInForm "+dateFormat.format(new Date())+".avi");
		log.info("Check Check Box");
		
	}
	
}
