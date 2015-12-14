/**
 * 
 */
package com.paxotech.abercrombie.tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paxotech.abercrombie.framework.scripts.ScriptBase;

/**
 * @author masihur
 *
 */
public class SampleTest extends ScriptBase{
	
	@Test
	public void test(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().signinLink();
		abercrombie().signIn().signIn("marufrahman1349@gmail.com", "m17-0985");
//		
	}
	@Test
	public void tab(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().becomeAMember("Masihur", "Maruf", 9292782179L, "marufrahman1349@yahoo.com", "m17-0985", "m17-0985");
	}
	@Test
	public void tab2(){
		abercrombie().advertisement().clickCloseAdd();
		abercrombie().pageHeader().becomeAMemberLink();
		abercrombie().becomeAMember().phoneNoTooltipHover();
	}
	

}
