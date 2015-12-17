/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.AbercrombieFacebookLoginOptionPageModel;

/**
 * @author masihur
 *
 */
public class AbercrombieFacebookLoginOptionPageController extends ControllerBase{
	
	private AbercrombieFacebookLoginOptionPageModel facebookLoginOption;
	
	public AbercrombieFacebookLoginOptionPageController(WebDriver driver) {
		super(driver);
		facebookLoginOption = new AbercrombieFacebookLoginOptionPageModel(driver);
	}
	public void signInWithFacebook(String email, String password){
		this.matrixTyping(email, facebookLoginOption.emailTextBox());
		this.matrixTyping(password, facebookLoginOption.passwordTextBox());
	}
	public void clickCheckBox(){
		this.checkCheckBox(facebookLoginOption.checkBox());
	}
	public void moveToFacebookPage(){
		this.switchWindowByTitle("Facebook");
	}
	public void pressTab(){
		this.tabSwitch("TEXT", "TESTTEXT", facebookLoginOption.emailTextBox(), facebookLoginOption.passwordTextBox());
	}

}
