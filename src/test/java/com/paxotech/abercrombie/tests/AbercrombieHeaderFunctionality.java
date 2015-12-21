/**
 * 
 */
package com.paxotech.abercrombie.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import java.util.Date;

import org.apache.log4j.Logger;

import com.paxotech.abercrombie.framework.scripts.RenameFile;
import com.paxotech.abercrombie.framework.scripts.ScriptBase;

/**
 * @author masihur
 *
 */


public class AbercrombieHeaderFunctionality extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieHeaderFunctionality.class.getName());
	
	@Test(alwaysRun=true)
	public void closeAdvertisement(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		RenameFile.toBeRenamed.add("TestVideos/PH_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		log.info("Advertisement CLosed");
	}
	
	@Test(dependsOnMethods= {"closeAdvertisement"})
	public void logoLinkFunctionality(){
		abercrombie().pageHeader().logoLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_LogoLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Abercrombie Logo");
	}
	@Test(dependsOnMethods= {"closeAdvertisement"})
	public void mensPageLinkFunctionality(){
		abercrombie().pageHeader().mensPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_MensPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Mens Page Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void womensPageLinkFunctionality(){
		abercrombie().pageHeader().womensPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_WomensPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Womens Page Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void kidsPageLinkFunctionality(){
		abercrombie().pageHeader().kidsPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_KidsPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Kids Page Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void salePageLinkFunctionality(){
		abercrombie().pageHeader().salePageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_SalePageFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Sale PAge Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void signinLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		abercrombie().pageHeader().signinLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_SignalLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Signin Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void becomeAMemberLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		abercrombie().pageHeader().becomeAMemberLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_BecomeAMemberLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Become a Memeber Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void trackMyOrderLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		abercrombie().pageHeader().trackMyOrderLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_TrackMyOrderLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Trach My Order Link");
	}

	
	

}
