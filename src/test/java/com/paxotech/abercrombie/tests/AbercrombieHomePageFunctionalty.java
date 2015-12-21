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
public class AbercrombieHomePageFunctionalty extends ScriptBase{
	
	@Test
	public void clickLimitEditionFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().homePage().scrollDownJS();
		abercrombie().homePage().clickLimitEdition();
		abercrombie().homePage().clickShopLimitedEdition();
	}
}