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
public class AbercrombieCheckoutAsNotAMember extends ScriptBase{
	@Test
	public void test(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().homePage().hoverHomePageWomenHoody();
		abercrombie().homePage().clickShopHomePageWomenHoody();
		abercrombie().pageHeader().hoverBag();
		abercrombie().pageHeader().shoppingBagLink();
	}
}
