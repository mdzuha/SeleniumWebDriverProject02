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
 *
 */
public class AbercrombieHomePageFunctionalty extends ScriptBase{
	private static Logger log = Logger.getLogger(AbercrombieHomePageFunctionalty.class.getName());
	@Test
	public void clickLimitEditionFunctionality(){
		DOMConfigurator.configure("log4j.xml");
		test = reportHome.startTest("CLOSE ADVERTISEMENT");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().clickLimitEdition();
		log.info("Click Limited Edition");
		test.log(LogStatus.INFO, "LIMITED EDITION", "Click Limited Edition");
		abercrombie().homePage().clickShopLimitedEdition();
		log.info("Click Shop Limited Edition");
		test.log(LogStatus.INFO, "LIMITED EDITION", "Click Shop Limited Edition");
		RenameFile.toBeRenamed.add("TestVideos/HP_ClickLimitEditionFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
		
		
	}
	@Test
	public void clickPartyShopMensFunctionality(){
		test = reportHome.startTest("PARTY SHOP MENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().clickPartyShop();
		log.info("Click Party Shop");
		test.log(LogStatus.INFO, "PARTY SHOP", "Click Party Shop");
		abercrombie().homePage().clickShopMens();
		log.info("Click Shop Mens");
		test.log(LogStatus.INFO, "PARTY SHOP", "Click Shop Mens");
		RenameFile.toBeRenamed.add("TestVideos/HP_ClickPartyShopMensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();

	}
	@Test
	public void clickPartyShopWomensFunctionality(){
		test = reportHome.startTest("PARTY SHOP WOMENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().clickPartyShop();
		log.info("Click Party Shop");
		test.log(LogStatus.INFO, "PARTY SHOP", "Click Party Shop");
		abercrombie().homePage().clickShopWomens();
		log.info("Click Shop Mens");
		test.log(LogStatus.INFO, "PARTY SHOP", "Click Shop Womens");
		RenameFile.toBeRenamed.add("TestVideos/HP_ClickPartyShpWomensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void hoverNewArrivalMensFunctionality(){
		test = reportHome.startTest("HOVER NEW ARRIVAL MENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().hoverNewArrivalMens();
		log.info("Hover New Arrival Mens");
		test.log(LogStatus.INFO, "NEW ARRIVAL", "Hover New Arrival Mens");
		RenameFile.toBeRenamed.add("TestVideos/HP_HoverNewArrivalMensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void clickNewArrivalMensFunctional(){
		test = reportHome.startTest("CLICK NEW ARRIVAL MENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().clickNewArrivalMens();
		log.info("Click New Arrival Mens");
		test.log(LogStatus.INFO, "NEW ARRIVAL", "Click New Arrival Mens");
		RenameFile.toBeRenamed.add("TestVideos/HP_ClickNewArrivalMensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void hoverNewArrivalWomensFunctional(){
		test = reportHome.startTest("HOVER NEW ARRIVAL WOMENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().hoverNewArrivalWomens();
		log.info("Hover New Arrival Womens");
		test.log(LogStatus.INFO, "NEW ARRIVAL", "Hover New Arrival Womens");
		RenameFile.toBeRenamed.add("TestVideos/HP_HoverNewArrivalWomensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void clickNewArrivalWomensFunctional(){
		test = reportHome.startTest("CLICK NEW ARRIVAL WOMENS FUNCTIONALITY");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().clickNewArrivalWomens();
		log.info("Click New Arrival Womens");
		test.log(LogStatus.INFO, "NEW ARRIVAL", "Click New Arrival Womens");
		RenameFile.toBeRenamed.add("TestVideos/HP_ClickNewArrivalWomensFunctionality "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void imagePartyShopPresentUI(){
		test = reportHome.startTest("PARTY SHOP IMAGE PRESENT UI");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().imagePartyShopPresent();
		log.info("Party Shop Image Present");
		test.log(LogStatus.INFO, "IMAGE", "Party Shop Image Present");
		RenameFile.toBeRenamed.add("TestVideos/HP_ImagePartyShopPresentUI "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
	@Test
	public void imageLimitedEditionPresentUI(){
		test = reportHome.startTest("LIMITED EDITION IMAGE PRESENT UI");
		test.assignAuthor("Masihur");
		abercrombie().advertisement().clickCloseAdd();
		log.info("Advertisement Closed");
		test.log(LogStatus.INFO, "CLOSE ADVERTISEMENT", "Click to Close Advertisement");
		abercrombie().homePage().scrollDownJS(1200);
		log.info("Scroll Down");
		test.log(LogStatus.INFO, "SCROLL", "Scroll Down");
		abercrombie().homePage().imageLimitedEditionPresent();
		log.info("Limited Edition Image Present");
		test.log(LogStatus.INFO, "IMAGE", "Limited Edition Image Present");
		RenameFile.toBeRenamed.add("TestVideos/HP_ImageLimitedEditionPresentUI "+dateFormat.format(new Date())+".avi");
		reportHome.endTest(test);
		reportHome.flush();
	}
}