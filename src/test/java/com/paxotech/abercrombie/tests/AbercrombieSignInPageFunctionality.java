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
 * @author masihur
 *
 */
public class AbercrombieSignInPageFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieSignInPageFunctionality.class.getName());
	
	@Test
	public void signIn(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().signIn("marufrahman1349@gmail.com", "m17-0985");
		RenameFile.toBeRenamed.add("TestVideos/PF_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		log.info("Typing the Email and Password Text Box");
		
	}
	@Test
	public void continueLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickContinue();
		RenameFile.toBeRenamed.add("TestVideos/SF_ContinueLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Continue Button");
	}
	@Test
	public void facebookLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		RenameFile.toBeRenamed.add("TestVideos/SF_FacebookLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Facebook From SignIn Page");
	}
	
}
