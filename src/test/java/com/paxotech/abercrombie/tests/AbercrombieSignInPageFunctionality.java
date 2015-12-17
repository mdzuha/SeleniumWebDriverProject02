/**
 * 
 */
package com.paxotech.abercrombie.tests;

import org.testng.annotations.Test;

import com.paxotech.abercrombie.framework.scripts.ScriptBase;

/**
 * @author masihur
 *
 */
public class AbercrombieSignInPageFunctionality extends ScriptBase{
	
	@Test
	public void signIn(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().signIn("marufrahman1349@gmail.com", "m17-0985");
		
	}
	@Test
	public void continueLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickContinue();
	}
	@Test
	public void facebookLinkFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().clickFacebookFromSignInPage();
	}
	
}
