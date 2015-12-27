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
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author masihur
 *
 */


public class AbercrombieHeaderFunctionality extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieHeaderFunctionality.class.getName());
	
	@Test(alwaysRun=true)
	public void closeAdvertisement(){
		DOMConfigurator.configure("log4j.xml");
		test = reportHeader.startTest("CLOSE ADVERTISEMENT");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		RenameFile.toBeRenamed.add("TestVideos/PH_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		reportHeader.endTest(test);
		reportHeader.flush();
		
	}
	
	@Test(dependsOnMethods= {"closeAdvertisement"})
	public void logoLinkFunctionality(){
		test = reportHeader.startTest("LOGO LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageHeader().logoLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_LogoLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Abercrombie Logo");
		test.log(LogStatus.INFO, "LOGO LINK FUNCTIONALITY", "Click the Abercrombie Logo");
		reportHeader.endTest(test);
		reportHeader.flush();
		
	}
	@Test(dependsOnMethods= {"closeAdvertisement"})
	public void mensPageLinkFunctionality(){
		test = reportHeader.startTest("MENS PAGE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageHeader().mensPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_MensPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		reportHeader.endTest(test);
		reportHeader.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void womensPageLinkFunctionality(){
		test = reportHeader.startTest("WOMENS PAGE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageHeader().womensPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_WomensPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Womens Page Link");
		test.log(LogStatus.INFO, "WOMENS PAGE LINK FUNCTIONALITY", "Click the Womens Page Link");
		reportHeader.endTest(test);
		reportHeader.flush();
		
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void kidsPageLinkFunctionality(){
		test = reportHeader.startTest("KIDS PAGE LINK FUNCTIONALITY");
		abercrombie().pageHeader().kidsPageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_KidsPageLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		reportHeader.endTest(test);
		reportHeader.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void salePageLinkFunctionality(){
		test = reportHeader.startTest("SALE PAGE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageHeader().salePageLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_SalePageFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Sale PAge Link");
		test.log(LogStatus.INFO, "SALE PAGE LINK FUNCTIONALITY", "Click the Sale Page Link");
		reportHeader.endTest(test);
		reportHeader.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void signinLinkFunctionality(){
		test = reportHeader.startTest("SIGNIN LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().signinLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_SignalLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Signin Link");
		test.log(LogStatus.INFO, "LOGO LINK FUNCTIONALITY", "Click the Abercrombie Logo");
		reportHeader.endTest(test);
		reportHeader.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void becomeAMemberLinkFunctionality(){
		test = reportHeader.startTest("BECOME A MEMBER LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_BecomeAMemberLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Become a Memeber Link");
		test.log(LogStatus.INFO, "LOGO LINK FUNCTIONALITY", "Click the Abercrombie Logo");
		reportHeader.endTest(test);
		reportHeader.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void trackMyOrderLinkFunctionality(){
		test = reportHeader.startTest("TRACK MY ORDER LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement CLosed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().trackMyOrderLink();
		RenameFile.toBeRenamed.add("TestVideos/PH_TrackMyOrderLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Trach My Order Link");
		test.log(LogStatus.INFO, "LOGO LINK FUNCTIONALITY", "Click the Abercrombie Logo");
		reportHeader.endTest(test);
		reportHeader.flush();
	}

	
	

}
