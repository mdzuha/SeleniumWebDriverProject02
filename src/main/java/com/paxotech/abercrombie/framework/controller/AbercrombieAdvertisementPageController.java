/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;



import com.paxotech.abercrombie.framework.model.AbercrombieAdvertisementPageModel;

/**
 * @author masihur
 *
 */
public class AbercrombieAdvertisementPageController extends ControllerBase{
	
	private AbercrombieAdvertisementPageModel advertisement = null; 
	
	public AbercrombieAdvertisementPageController(WebDriver driver) {
		super(driver);
		advertisement = new AbercrombieAdvertisementPageModel(driver);
		
	}
	
	public void clickCloseAdd(){
		advertisement.closeAdd().click();
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

}
