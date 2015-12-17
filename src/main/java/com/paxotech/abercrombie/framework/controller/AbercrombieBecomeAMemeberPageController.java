/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.AbercrombieBecomeAMemeberModel;

/**
 * @author PaxoTech Student
 *
 */
public class AbercrombieBecomeAMemeberPageController extends ControllerBase{
	
	private AbercrombieBecomeAMemeberModel becomeAMemeber;
	
	public AbercrombieBecomeAMemeberPageController(WebDriver driver) {
		super(driver);
		becomeAMemeber = new AbercrombieBecomeAMemeberModel(driver);
	}
	public void becomeAMember(String fName, String lName, long phnNo, String email, String password, String ConfirmPassword){
		this.matrixTyping(fName, becomeAMemeber.firstName());
		this.matrixTyping(lName, becomeAMemeber.lastName());
		this.matrixTyping(phnNo, becomeAMemeber.phone());
		this.matrixTyping(email, becomeAMemeber.emailAddress());
		this.matrixTyping(password, becomeAMemeber.password());
		this.matrixTyping(ConfirmPassword, becomeAMemeber.confirmPassword());
	}
	public void firstTab(){
		this.tabSwitch("TEXT", "TESTTEXT", becomeAMemeber.firstName(), becomeAMemeber.lastName());
	}
	public void secondTab(){
		this.tabSwitch("TEXT", "TESTTEXT", becomeAMemeber.lastName(), becomeAMemeber.phone());
	}
	public void thirdTab(){
		this.tabSwitch("TEXT", "TESTTEXT", becomeAMemeber.phone(), becomeAMemeber.emailAddress());
	}
	public void fourthTab(){
		this.tabSwitch("TEXT", "TESTTEXT", becomeAMemeber.emailAddress(), becomeAMemeber.password());
	}
	public void fifthTab(){
		this.tabSwitch("TEXT", "TESTTEXT", becomeAMemeber.password(), becomeAMemeber.confirmPassword());
	}
	public void becomeAMemeberEnter(){
		becomeAMemeber.becomeAMemberButton().sendKeys(Keys.ENTER);;
	}
	public void clickFacebookFromBEcomeAMemberPage(){
		becomeAMemeber.facebook().click();
	}
	public void phoneNoTooltipHover(){
		this.hoverItem(becomeAMemeber.phoneTooltip());
	}
	public void facebookTooltipHover(){
		this.hoverItem(becomeAMemeber.facebookTooltip());
	}
	
	

	

}
