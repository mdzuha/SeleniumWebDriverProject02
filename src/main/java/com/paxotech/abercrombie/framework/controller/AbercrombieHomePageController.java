/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.abercrombie.framework.model.AbercrombieHomePageModel;

/**
 * @author Masihur
 *
 */
public class AbercrombieHomePageController extends ControllerBase{
	
	private AbercrombieHomePageModel homePage;
	public AbercrombieHomePageController(WebDriver driver) {
		super(driver);
		homePage = new AbercrombieHomePageModel(driver);
	}
	public void clickLimitEdition(){
		this.click(homePage.limitrdEdition());
	}
	public void clickShopLimitedEdition(){
		this.click(homePage.shopLimitedEdition());
	}
	public void clickPartyShop(){
		this.click(homePage.partyShop());
	}
	public void clickShopMens(){
		this.click(homePage.shopMens());
	}
	public void clickShopWomens(){
		this.click(homePage.shopWomens());
	}

}
