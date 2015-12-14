/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;



import com.paxotech.abercrombie.framework.model.AdvertisementPageModel;

/**
 * @author masihur
 *
 */
public class AdvertisementPageController extends ControllerBase{
	
	private AdvertisementPageModel advertisement = null; 
	
	public AdvertisementPageController(WebDriver driver) {
		super(driver);
		advertisement = new AdvertisementPageModel(driver);
		
	}
	
	public void clickCloseAdd(){
		advertisement.closeAdd().click();
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

}
