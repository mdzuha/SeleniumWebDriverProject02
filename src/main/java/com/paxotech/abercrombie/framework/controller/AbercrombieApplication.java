/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;



/**
 * @author masihur
 *
 */
public class AbercrombieApplication{
	
	private WebDriver driver;
	
	public AbercrombieApplication(WebDriver driver){
		this.driver = driver;
	}

	private AbercrombieAdvertisementPageController advertisement;
	private AbercrombiePageHeaderController pageHeader;
	private AbercrombiePageFooterController pageFooter;
	private AbercrombieBecomeAMemeberPageController becomeAMember;
	private AbercrombieSignInPageController signIn;
	private AbercrombieFacebookLoginOptionPageController facebookOption;
	private AbercrombieHomePageController homePage;
	
	public AbercrombieAdvertisementPageController advertisement(){
		if(advertisement == null){
			advertisement = new AbercrombieAdvertisementPageController(driver);
		}
		return advertisement;
	}
	public AbercrombiePageHeaderController pageHeader (){
		if(pageHeader == null){
			pageHeader = new AbercrombiePageHeaderController(driver);
		}
		return pageHeader;
	}
	public AbercrombiePageFooterController pageFooter (){
		if(pageFooter == null){
			pageFooter = new AbercrombiePageFooterController(driver);
		}
		return pageFooter;
	}
	public AbercrombieBecomeAMemeberPageController becomeAMember(){
		if(becomeAMember == null){
			becomeAMember = new AbercrombieBecomeAMemeberPageController(driver);
		}
		return becomeAMember;
	}
	public AbercrombieSignInPageController signIn(){
		if(signIn == null){
			signIn = new AbercrombieSignInPageController(driver);
		}
		return signIn;
	}
	public AbercrombieFacebookLoginOptionPageController facebookOption(){
		if(facebookOption == null){
			facebookOption = new AbercrombieFacebookLoginOptionPageController(driver);
		}
		return facebookOption;
	}
	public AbercrombieHomePageController homePage(){
		if(homePage == null){
			homePage = new AbercrombieHomePageController(driver);
		}
		return homePage;
	}
	

}
