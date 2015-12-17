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
	private AbercrombieBecomeAMemeberController becomeAMember;
	private AbercrombieSignInPageController signIn;
	private AbercrombieFacebookLoginOptionPageController facebookOption;
	
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
	public AbercrombieBecomeAMemeberController becomeAMember(){
		if(becomeAMember == null){
			becomeAMember = new AbercrombieBecomeAMemeberController(driver);
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
	

}
