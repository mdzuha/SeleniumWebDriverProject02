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
public class AbercrombieBecomeAMemberTabFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieBecomeAMemberTabFunctionality.class.getName());
	
	@Test
	public void firstTabClickFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		abercrombie().becomeAMember().firstTab();
		RenameFile.toBeRenamed.add("TestVideos/BF_FirstTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab From First Text Box");
	}
	@Test
	public void secondTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		abercrombie().becomeAMember().secondTab();
		RenameFile.toBeRenamed.add("TestVideos/BF_SecondTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab From Second Text Box");
	}
	@Test
	public void thirdTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		abercrombie().becomeAMember().thirdTab();
		RenameFile.toBeRenamed.add("TestVideos/BF_ThirdTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab From Third Text Box");
	}
	@Test
	public void fourthTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		abercrombie().becomeAMember().fourthTab();
		RenameFile.toBeRenamed.add("TestVideos/BF_FourthTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab From Fourth Text Box");
	}
	@Test
	public void fifthTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		abercrombie().pageHeader().becomeAMemberLink();
		log.info("Click Become A Member Link");
		abercrombie().becomeAMember().fifthTab();
		RenameFile.toBeRenamed.add("TestVideos/BF_FifthTabClickFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Pressing Tab From Fifth Text Box");
	}
	
}
