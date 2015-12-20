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
public class AbercrombieSignInPageTabFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieSignInPageTabFunctionality.class.getName());
	
	@Test
	public void signInTabFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().signinLink();
		log.info("SignIn Link Clicked");
		abercrombie().signIn().tabPress();
		RenameFile.toBeRenamed.add("TestVideos/STF_signInTabFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab");
	}
}
