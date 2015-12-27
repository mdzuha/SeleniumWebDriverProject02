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
public class AbercrombieBecomeAMemberTabFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieBecomeAMemberTabFunctionality.class.getName());
	
	@Test
	public void firstTabPressFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		test = reportBecomeAMemberTab.startTest("FIRST TAB PRESS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		RenameFile.toBeRenamed.add("TestVideos/BF_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().firstTab();
		log.info("Pressing Tab From First Text Box");
		test.log(LogStatus.INFO, "FIRST TAB", "Pressing Tab From First Text Box");
		RenameFile.toBeRenamed.add("TestVideos/BTF_FirstTabPressFunctionality "+dateFormat.format(new Date())+".avi");
		reportBecomeAMemberTab.endTest(test);
		reportBecomeAMemberTab.flush();
	}
	@Test
	public void secondTabPressFunctionality(){
		test = reportBecomeAMemberTab.startTest("SECOND TAB PRESS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().secondTab();
		log.info("Pressing Tab From Second Text Box");
		test.log(LogStatus.INFO, "SECOND TAB", "Pressing Tab From Second Text Box");
		RenameFile.toBeRenamed.add("TestVideos/BTF_SecondTabPressFunctionality "+dateFormat.format(new Date())+".avi");
		reportBecomeAMemberTab.endTest(test);
		reportBecomeAMemberTab.flush();
	}
	@Test
	public void thirdTabPressFunctionality(){
		test = reportBecomeAMemberTab.startTest("THIRD TAB PRESS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().thirdTab();
		log.info("Pressing Tab From Third Text Box");
		test.log(LogStatus.INFO, "THIRD TAB", "Pressing Tab From Third Text Box");
		RenameFile.toBeRenamed.add("TestVideos/BTF_ThirdTabPressFunctionality "+dateFormat.format(new Date())+".avi");
		reportBecomeAMemberTab.endTest(test);
		reportBecomeAMemberTab.flush();
	}
	@Test
	public void fourthTabPressFunctionality(){
		test = reportBecomeAMemberTab.startTest("FOURTH TAB PRESS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().fourthTab();
		log.info("Pressing Tab From Fourth Text Box");
		test.log(LogStatus.INFO, "FOURTH TAB", "Pressing Tab From Fourth Text Box");
		RenameFile.toBeRenamed.add("TestVideos/BF_FourthTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		reportBecomeAMemberTab.endTest(test);
		reportBecomeAMemberTab.flush();
	}
	@Test
	public void fifthTabPressFunctionality(){
		test = reportBecomeAMemberTab.startTest("FIFTH TAB PRESS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		test.log(LogStatus.INFO, "BECOME A MEMBER LINK", "Click the Become A Member Link");
		abercrombie().becomeAMember().fifthTab();
		log.info("Pressing Tab From Fifth Text Box");
		test.log(LogStatus.INFO, "FIFTH TAB", "Pressing Tab From Fifth Text Box");
		RenameFile.toBeRenamed.add("TestVideos/BF_FifthTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		reportBecomeAMemberTab.endTest(test);
		reportBecomeAMemberTab.flush();
	}
	
}
