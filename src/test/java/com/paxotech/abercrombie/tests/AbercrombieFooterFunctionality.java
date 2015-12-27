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
public class AbercrombieFooterFunctionality extends ScriptBase{
	
private static Logger log = Logger.getLogger(AbercrombieFooterFunctionality.class.getName());
	
	@Test(alwaysRun=true, groups={"functest"})
	public void closeAdvertisement(){
		DOMConfigurator.configure("log4j.xml");
		test = reportFooter.startTest("CLOSE ADVERTISEMENT");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		RenameFile.toBeRenamed.add("TestVideos/PH_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		reportFooter.endTest(test);
		reportFooter.flush();
	}

	@Test(dependsOnMethods="closeAdvertisement")
	public void facebookLinkFunctionality(){
		test = reportFooter.startTest("FACEBOOK LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().facebookLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_FacebookLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Facebook Logo");
		test.log(LogStatus.INFO, "FACEBOOK LINK FUNCTIONALITY", "Click the Facebook Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void twitterLinkFunctionality(){
		test = reportFooter.startTest("TWITTER LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().twitterLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_TwitterLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Twitter Link");
		test.log(LogStatus.INFO, "TWITTER LINK FUNCTIONALITY", "Click the Twitter Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void pinterestLinkFunctionality(){
		test = reportFooter.startTest("PINTEREST LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().pinterestLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_PinterestLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Pinterest Link");
		test.log(LogStatus.INFO, "PINTEREST LINK FUNCTIONALITY", "Click the Pinterest Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void instagramLinkFunctionality(){
		test = reportFooter.startTest("INSTAGRAM LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().instagramLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_InstagramLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Instagram Link");
		test.log(LogStatus.INFO, "INSTAGRAM LINK FUNCTIONALITY", "Click the Instagram Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void youtubeLinkFunctionality(){
		test = reportFooter.startTest("YOUTUBE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().youtubeLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_YoutubeLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Youtube Link");
		test.log(LogStatus.INFO, "YOUTUBE LINK FUNCTIONALITY", "Click the Youtube Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void waneloLimkfunctionality(){
		test = reportFooter.startTest("WANELO LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().waneloLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_WaneloLinkfunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Wanelo Link");
		test.log(LogStatus.INFO, "WANELO LINK FUNCTIONALITY", "Click the Wanelo Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void socialMediaTermsLinkFunctionality(){
		test = reportFooter.startTest("SOCIAL MEDIA TERMS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().socialMediaTerms();
		RenameFile.toBeRenamed.add("TestVideos/PF_SocialMediaTermsLinkfunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Social Media Terms Link");
		test.log(LogStatus.INFO, "SOCIAL MEDIA TERMS LINK FUNCTIONALITY", "Click the Social Media Terms Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void findStoreLinkFunctionality(){
		test = reportFooter.startTest("FIND STORE LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().findStoreLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_FindStoreLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Find Store Link");
		test.log(LogStatus.INFO, "FIND STORE LINK FUNCTIONALITY", "Click the Find Store Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void giftCardsLinkFunctionality(){
		test = reportFooter.startTest("GIFT CARD LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().giftCardsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_GiftCardsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Gift Cards Link");
		test.log(LogStatus.INFO, "GIFT CARD LINK FUNCTIONALITY", "Click the Gift Card Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void afTextLinkFunctionality(){
		test = reportFooter.startTest("A & F TEXT LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().afTextLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_A&FTextLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click A&F Text Link");
		test.log(LogStatus.INFO, "A & F TEXT LINK FUNCTIONALITY", "Click the A & F Text Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void giveUsFeedbackLinkFunctionality(){
		test = reportFooter.startTest("GIVE US FEEDBACK LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().giveUsFeedbackLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_GiveUsFeedbackLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Give Us Feedback Link");
		test.log(LogStatus.INFO, "GIVE US FEEDBACK LINK FUNCTIONALITY", "Click the Give Us Feedback Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void helpLinkFunctionality(){
		test = reportFooter.startTest("HELP LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageFooter().helpLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_HelpLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Help Link");
		test.log(LogStatus.INFO, "HELP LINK FUNCTIONALITY", "Click the Help Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void aboutUsLinkFunctionality(){
		test = reportFooter.startTest("ABOUT US LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageFooter().aboutUsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_AboutUsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click About Us Link");
		test.log(LogStatus.INFO, "ABOUT US LINK FUNCTIONALITY", "Click the About Us Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void privacyTermsLinkFunctionality(){
		test = reportFooter.startTest("PRIVACY TERMS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageFooter().privacyTermsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_PrivacyTermsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Privacy Terms Link");
		test.log(LogStatus.INFO, "PRIVACY TERMS LINK FUNCTIONALITY", "Click the Privacy Terms Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void upArrowFunctionality(){
		test = reportFooter.startTest("UP ARROW LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().pageFooter().upArrow();
		RenameFile.toBeRenamed.add("TestVideos/PF_UpArrowFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Up Arrow");
		test.log(LogStatus.INFO, "UP ARROW LINK FUNCTIONALITY", "Click the Up Arrow Link");
		reportFooter.endTest(test);
		reportFooter.flush();
	}
	

}
