/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.PageFooterModel;

/**
 * @author masihur
 *
 */
public class PageFooterController extends ControllerBase{
	
	private PageFooterModel pageFooter = null;
	public PageFooterController(WebDriver driver) {
		super(driver);
		pageFooter = new PageFooterModel(driver);
	}
	public void facebookLink(){
		this.click(pageFooter.facebookLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void twitterLink(){
		this.click(pageFooter.twitterLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void pinterestLink(){
		this.click(pageFooter.pinterestLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void instagramLink(){
		this.click(pageFooter.instagramLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void youtubeLink(){
		this.click(pageFooter.youtubeLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void waneloLink(){
		this.click(pageFooter.waneloLogo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void socialMediaTerms(){
		this.click(pageFooter.socialMediaTerms());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void findStoreLink(){
		this.click(pageFooter.findStore());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void giftCardsLink(){
		this.click(pageFooter.giftCards());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void afTextLink(){
		this.click(pageFooter.afText());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void giveUsFeedbackLink(){
		this.click(pageFooter.giveUsFeedBack());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void helpLink(){
		this.click(pageFooter.help());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void aboutUsLink(){
		this.click(pageFooter.aboutUs());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void privacyTermsLink(){
		this.click(pageFooter.privacyTerms());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void upArrow(){
		this.scrollDownJS();
		this.click(pageFooter.upArrow());
	}
	

}
