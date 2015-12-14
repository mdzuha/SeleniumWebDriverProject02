/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.SignInPageModel;

/**
 * @author masihur
 *
 */
public class SignInPageController extends ControllerBase{
	
	private SignInPageModel signIn;

	public SignInPageController(WebDriver driver) {
		super(driver);
		signIn = new SignInPageModel(driver);
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
