/**
 * 
 */
package com.paxotech.abercrombie.tests;

import org.testng.annotations.Test;

import com.paxotech.abercrombie.framework.scripts.ScriptBase;

/**
 * @author Masihur
 *
 */
public class AbercrombieFacebookLoginOptionPageFunctionality extends ScriptBase{

	@Test
	public void facebookPageLinkFromSignInPageFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickFacebookFromSignInPage();
		abercrombie().facebookOption().moveToFacebookPage();
	
	}
	@Test
	public void facebookPageLinkFrombecomeAMemberPageFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().becomeAMember().clickFacebookFromBEcomeAMemberPage();
		abercrombie().facebookOption().moveToFacebookPage();
		
	}
	@Test
	public void fillFacebookPageLogInForm(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickFacebookFromSignInPage();
		abercrombie().facebookOption().moveToFacebookPage();
		abercrombie().facebookOption().signInWithFacebook("marufrahman1349@gmail.com", "m17-0985");
		
	}
	@Test
	public void checkBoxFacebookPageLogInForm(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickFacebookFromSignInPage();
		abercrombie().facebookOption().moveToFacebookPage();
		abercrombie().facebookOption().clickCheckBox();
		
	}
	
}
