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
public class AbercrombieFacebookLoginOptionPageTab extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieFacebookLoginOptionPageTab.class.getName());
	
	@Test
	public void tabFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("Click Signin Link");
		abercrombie().signIn().clickFacebookFromSignInPage();
		log.info("Click Facebook From SignIn Page");
		abercrombie().facebookOption().moveToFacebookPage();
		log.info("Moved to Facebook Page");
		abercrombie().facebookOption().pressTab();
		RenameFile.toBeRenamed.add("TestVideos/FB_FacebookTabFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing the Tab");
	}

}
