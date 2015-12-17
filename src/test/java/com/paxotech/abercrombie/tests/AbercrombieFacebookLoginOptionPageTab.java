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
public class AbercrombieFacebookLoginOptionPageTab extends ScriptBase{
	
	@Test(groups = {"uitestcase"})
	public void tabFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickFacebookFromSignInPage();
		abercrombie().facebookOption().moveToFacebookPage();
		abercrombie().facebookOption().pressTab();
	}

}
