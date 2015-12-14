/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;



/**
 * @author masihur
 *
 */
public class Application{
	
	private WebDriver driver;
	
	public Application(WebDriver driver){
		this.driver = driver;
	}

	private AdvertisementPageController advertisement;
	private PageHeaderController pageHeader;
	private PageFooterController pageFooter;
	private BecomeAMemeberController becomeAMember;
	private SignInPageController signIn;
	
	public AdvertisementPageController advertisement(){
		if(advertisement == null){
			advertisement = new AdvertisementPageController(driver);
		}
		return advertisement;
	}
	public PageHeaderController pageHeader (){
		if(pageHeader == null){
			pageHeader = new PageHeaderController(driver);
		}
		return pageHeader;
	}
	public PageFooterController pageFooter (){
		if(pageFooter == null){
			pageFooter = new PageFooterController(driver);
		}
		return pageFooter;
	}
	public BecomeAMemeberController becomeAMember(){
		if(becomeAMember == null){
			becomeAMember = new BecomeAMemeberController(driver);
		}
		return becomeAMember;
	}
	public SignInPageController signIn(){
		if(signIn == null){
			signIn = new SignInPageController(driver);
		}
		return signIn;
	}

}
