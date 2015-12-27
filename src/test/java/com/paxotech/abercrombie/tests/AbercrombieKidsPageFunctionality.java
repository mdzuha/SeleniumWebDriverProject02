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
public class AbercrombieKidsPageFunctionality extends ScriptBase{
	
	private static Logger log = Logger.getLogger(AbercrombieHeaderFunctionality.class.getName());
	@Test
	public void imageKidsPageIsPresentUI(){
		DOMConfigurator.configure("log4j.xml");
		test = reportKids.startTest("KIDS PAGE IMAGE PRESENT");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().imageKidsPageIsPresent();
		log.info("Kids Page Image Present");
		test.log(LogStatus.INFO, "IMAGE", "Kids Page Image Present");
		RenameFile.toBeRenamed.add("TestVideos/KP_ImageKidsPageIsPresentUI "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();
	}
	@Test
	public void hoverShopBoysLinkFunctionality(){
		test = reportKids.startTest("HOVER SHOP BOYS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopBoys();
		log.info("Hover Shop Boys");
		test.log(LogStatus.INFO, "SHOP BOYS", "Hover Shop Boys");
		RenameFile.toBeRenamed.add("TestVideos/KP_HoverShopBoysLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();
		
	}
	@Test
	public void hoverShopGirlsLinkFunctionality(){
		test = reportKids.startTest("HOVER SHOP GIRLS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopGirls();
		log.info("Hover Shop GIrls");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Hover Shop Girls");
		RenameFile.toBeRenamed.add("TestVideos/KP_HoverShopGirlsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();
	}
	@Test
	public void clickShopBoysLinkFunctionality(){
		test = reportKids.startTest("CLICK SHOP BOYS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopBoys();
		log.info("Hover Shop Boys");
		test.log(LogStatus.INFO, "SHOP BOYS", "Hover Shop Boys");
		abercrombie().kidsPage().clickShopBoysLink();
		log.info("Click Shop Boys");
		test.log(LogStatus.INFO, "SHOP BOYS", "Click Shop Boys");
		RenameFile.toBeRenamed.add("TestVideos/KP_ClickShopBoysLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();
		
	}
	@Test
	public void clickShopGirlsLinkFunctionality(){
		test = reportKids.startTest("CLICK SHOP GIRLS LINK FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopGirls();
		log.info("Hover Shop GIrls");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Hover Shop Girls");
		abercrombie().kidsPage().clickShopGirlsLink();
		log.info("Click Shop GIrls");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Click Shop Girls");
		RenameFile.toBeRenamed.add("TestVideos/KP_ClickShopGirlsLinkFunctionality "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();                                                        
	}
	@Test
	public void categoriesBoysList(){
		test = reportKids.startTest("CATEGORY BOYS LIST");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopBoys();
		log.info("Hover Shop Boys");
		test.log(LogStatus.INFO, "SHOP BOYS", "Hover Shop Boys");
		abercrombie().kidsPage().clickShopBoysLink();
		log.info("Click Shop Boys");
		test.log(LogStatus.INFO, "SHOP BOYS", "Click Shop Boys");
		abercrombie().kidsPage().categoryBoysList();
		log.info("Categories of Boys Page");
		test.log(LogStatus.INFO, "SHOP BOYS", "Categories of Boys Page");
		RenameFile.toBeRenamed.add("TestVideos/KP_CategoriesBoysList "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush();
		
		
	}
	@Test
	public void categoriesGirlsList(){
		test = reportKids.startTest("CATEGORIES GIRLS LIST");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().kidsPageLink();
		log.info("Click Kids Page Link");
		test.log(LogStatus.INFO, "KIDS PAGE LINK FUNCTIONALITY", "Click the Kids Page Link");
		abercrombie().kidsPage().hoverShopGirls();
		log.info("Hover Shop Girls");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Hover Shop Girls");
		abercrombie().kidsPage().clickShopGirlsLink();
		log.info("Click Shop Girls");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Click Shop Girls");
		abercrombie().kidsPage().categoryGirlsList();
		log.info("Categories of Girls Page");
		test.log(LogStatus.INFO, "SHOP GIRLS", "Categories of Girls Page");
		RenameFile.toBeRenamed.add("TestVideos/KP_CategoriesGirlsList "+dateFormat.format(new Date())+".avi");
		reportKids.endTest(test);
		reportKids.flush(); 
		
		
	}
}
