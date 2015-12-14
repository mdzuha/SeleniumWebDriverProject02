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
public class AbercrombieSignInPageTabFunctionality extends ScriptBase{
	
	@Test
	public void signInTabFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().tabPress();
	}
}
