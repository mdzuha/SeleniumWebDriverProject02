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
public class AbercrombieFooterFunctionality extends ScriptBase{
	
private static Logger log = Logger.getLogger(AbercrombieFooterFunctionality.class.getName());
	
	@Test(alwaysRun=true)
	public void closeAdvertisement(){
		DOMConfigurator.configure("log4j.xml");
		abercrombie().advertisement().clickCloseAdd();
		RenameFile.toBeRenamed.add("TestVideos/PF_CloseAdvertisement "+dateFormat.format(new Date())+".avi");
		log.info("Advertisement Closed");
	}

	@Test(dependsOnMethods="closeAdvertisement")
	public void facebookLinkFunctionality(){
		abercrombie().pageFooter().facebookLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_FacebookLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Facebook Logo");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void twitterLinkFunctionality(){
		abercrombie().pageFooter().twitterLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_TwitterLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Twitter Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void pinterestLinkFunctionality(){
		abercrombie().pageFooter().pinterestLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_PinterestLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Pinterest Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void instagramLinkFunctionality(){
		abercrombie().pageFooter().instagramLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_InstagramLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Instagram Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void youtubeLinkFunctionality(){
		abercrombie().pageFooter().youtubeLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_YoutubeLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Youtube Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void waneloLimkfunctionality(){
		abercrombie().pageFooter().waneloLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_WaneloLinkfunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Wanelo Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void socialMediaTermsLinkFunctionality(){
		abercrombie().pageFooter().socialMediaTerms();
		RenameFile.toBeRenamed.add("TestVideos/PF_SocialMediaTermsLinkfunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Social Media Terms Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void findStoreLinkFunctionality(){
		abercrombie().pageFooter().findStoreLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_FindStoreLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Find Store Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void giftCardsLinkFunctionality(){
		abercrombie().pageFooter().giftCardsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_GiftCardsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Gift Cards Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void afTextLinkFunctionality(){
		abercrombie().pageFooter().afTextLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_A&FTextLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click A&F Text Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void giveUsFeedbackLinkFunctionality(){
		abercrombie().pageFooter().giveUsFeedbackLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_GiveUsFeedbackLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Give Us Feedback Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void helpLinkFunctionality(){
		abercrombie().pageFooter().helpLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_HelpLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Help Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void aboutUsLinkFunctionality(){
		abercrombie().pageFooter().aboutUsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_AboutUsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click About Us Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void privacyTermsLinkFunctionality(){
		abercrombie().pageFooter().privacyTermsLink();
		RenameFile.toBeRenamed.add("TestVideos/PF_PrivacyTermsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Privacy Terms Link");
	}
	@Test(dependsOnMethods="closeAdvertisement")
	public void upArrowFunctionality(){
		abercrombie().pageFooter().upArrow();
		RenameFile.toBeRenamed.add("TestVideos/PF_UpArrowFunctionality "+dateFormat.format(new Date())+".avi");
		log.info("Click Up Arrow");
	}
	

}
