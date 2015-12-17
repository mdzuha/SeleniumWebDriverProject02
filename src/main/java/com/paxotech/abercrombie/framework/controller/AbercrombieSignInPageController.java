/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.AbercrombieSignInPageModel;

/**
 * @author masihur
 *
 */
public class AbercrombieSignInPageController extends ControllerBase{
	
	private AbercrombieSignInPageModel signIn;

	public AbercrombieSignInPageController(WebDriver driver) {
		super(driver);
		signIn = new AbercrombieSignInPageModel(driver);
	}
	public void signIn(String email, String password){
		this.matrixTyping(email, signIn.emailTextBox());
		this.matrixTyping(password, signIn.passwordTextBox());
	}
	public void clickFacebook(){
		this.click(signIn.facebookLink());
	}
	public void clickContinue(){
		this.click(signIn.registerLink());
	}
	public void tabPress(){
		this.tabSwitch("TEST", "TESTTEXT", signIn.emailTextBox(), signIn.passwordTextBox());
	}
	

}
