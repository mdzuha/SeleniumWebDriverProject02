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
public class AbercrombieMensPageFunctionality extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieMensPageFunctionality.class.getName());
	@Test
	public void categoriesMensPage(){
		DOMConfigurator.configure("log4j.xml");
		test = reportMens.startTest("CATEGORIES MENS PAGE");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().categoryMensPage();
		log.info("Ctegories of Mens Page");
		test.log(LogStatus.INFO, "MENS PAGE CATEGORIES", "Verify all the Categories in Mens Page Present");
		RenameFile.toBeRenamed.add("TestVideos/MP_CategoriesMensPage "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
		
	}
	@Test
	public void hoverParkaFunctionality(){
		test = reportMens.startTest("HOVER PARKA FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverParka();
		log.info("Hover Parka");
		test.log(LogStatus.INFO, "PARKA", "Hover Parka");
		RenameFile.toBeRenamed.add("TestVideos/MP_HoverParkaFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void clickParkaFunctionality(){
		test = reportMens.startTest("CLICK PARKA FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverParka();
		log.info("Hover Parka");
		test.log(LogStatus.INFO, "PARKA", "Hover Parka");
		abercrombie().mensPage().clickParka();
		log.info("Click Parka");
		test.log(LogStatus.INFO, "PARKA", "Click Parka");
		RenameFile.toBeRenamed.add("TestVideos/MP_ClickParkaFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void hoverPufferFunctionality(){
		test = reportMens.startTest("HOVER PUFFER FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverPuffer();
		log.info("Hover Puffer");
		test.log(LogStatus.INFO, "PUFFER", "Hover Puffer");
		RenameFile.toBeRenamed.add("TestVideos/MP_HoverPufferFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void clickPufferFunctionality(){
		test = reportMens.startTest("CLICK PUFFER FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverPuffer();
		log.info("Hover Puffer");
		test.log(LogStatus.INFO, "PUFFER", "Hover Puffer");
		abercrombie().mensPage().clickPuffer();
		log.info("Click Puffer");
		test.log(LogStatus.INFO, "PUFFER", "Click Puffer");
		RenameFile.toBeRenamed.add("TestVideos/MP_ClickPufferFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void hoverJacketsFunctionality(){
		test = reportMens.startTest("HOVER JACKETS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverJackets();
		log.info("Hover Jackets");
		test.log(LogStatus.INFO, "JACKETS", "Hover Jackets");
		RenameFile.toBeRenamed.add("TestVideos/MP_HoverJacketsFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void clickJacketsFunctionality(){
		test = reportMens.startTest("HOVER JACKETS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().hoverJackets();
		log.info("Hover Jackets");
		test.log(LogStatus.INFO, "JACKETS", "Hover Jackets");
		abercrombie().mensPage().clickJackets();
		log.info("Click Jackets");
		test.log(LogStatus.INFO, "JACKETS", "Click Jackets");
		RenameFile.toBeRenamed.add("TestVideos/MP_ClickJacketsFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
	@Test
	public void clickShopJustYourStyleFunctionality(){
		test = reportMens.startTest("CLICK SHOP JUST YOUR STYLE FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().pageHeader().mensPageLink();
		log.info("Click Mens Page Link");
		test.log(LogStatus.INFO, "MENS PAGE LINK FUNCTIONALITY", "Click the Mens Page Link");
		abercrombie().mensPage().clickShopJustYourStyle();
		log.info("Click Shop Just Your Style Link");
		test.log(LogStatus.INFO, "SHOP YOUR STYLE", "Click Shop Your Style Link");
		RenameFile.toBeRenamed.add("TestVideos/MP_ClickShopJustYourStyleFunctionality "+dateFormat.format(new Date())+".avi");
		reportMens.endTest(test);
		reportMens.flush();
	}
}
