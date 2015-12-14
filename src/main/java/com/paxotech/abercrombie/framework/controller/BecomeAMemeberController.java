/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.BecomeAMemeberModel;

/**
 * @author PaxoTech Student
 *
 */
public class BecomeAMemeberController extends ControllerBase{
	
	private BecomeAMemeberModel becomeAMemeber;
	
	public BecomeAMemeberController(WebDriver driver) {
		super(driver);
		becomeAMemeber = new BecomeAMemeberModel(driver);
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
	public void facebook(){
		becomeAMemeber.facebook().click();
	}
	public void phoneNoTooltipHover(){
		this.hoverItem(becomeAMemeber.phoneTooltip());
	}
	public void facebookTooltipHover(){
		this.hoverItem(becomeAMemeber.facebookTooltip());
	}
	

	

}
