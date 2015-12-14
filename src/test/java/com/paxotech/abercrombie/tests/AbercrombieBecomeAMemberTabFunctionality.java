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
public class AbercrombieBecomeAMemberTabFunctionality extends ScriptBase{
	
	
	@Test
	public void firstTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().firstTab();
	}
	@Test
	public void secondTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().secondTab();
	}
	@Test
	public void thirdTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().thirdTab();
	}
	@Test
	public void fourthTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().fourthTab();
	}
	@Test
	public void fifthTabClickFunctionality(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().fifthTab();
	}
	
}
