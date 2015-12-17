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
	public void checkCheckBox(){
		if(facebookLoginOption.checkBox().getAttribute("checked").equals("false")){
			this.click(facebookLoginOption.checkBox());
		}
	}
	public void moveToFacebookPage(){
		this.switchWindowByTitle("Facebook");
	}

}
