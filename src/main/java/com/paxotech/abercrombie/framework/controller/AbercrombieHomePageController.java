/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		this.click(homePage.limitedEdition());
	}
	public void clickShopLimitedEdition(){
		this.click(homePage.shopLimitedEdition());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void clickPartyShop(){
		this.click(homePage.partyShop());
	}
	public void clickShopMens(){
		this.click(homePage.shopMens());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void clickShopWomens(){
		this.click(homePage.shopWomens());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void hoverNewArrivalMens(){
		this.hoverItem(homePage.newArrivalMens());
	}
	public void clickNewArrivalMens(){
		this.click(homePage.newArrivalMens());
	}
	public void hoverNewArrivalWomens(){
		this.hoverItem(homePage.newArrivalWomens());
	}
	public void clickNewArrivalWomens(){
		this.conditionalClick(homePage.newArrivalWomens());
	}
	public void verifyMensPartyPage(){
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void vrifyWomensPartyPage(){
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void verifyWomensCollection(){
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}
	public void homePageProducts(){
		String[] products = new String[homePage.homePageProducts().size()];
		
		for(int i = 0; i<homePage.homePageProducts().size(); i++){
			WebElement element = homePage.homePageProducts().get(i);
			String text = element.getText();
			products[i] = text;
		}
		System.out.println(Arrays.toString(products));
	}
	public void imagePartyShopPresent(){
		this.imageLoaded(homePage.imagePartyShop());
	}
	public void imageLimitedEditionPresent(){
		this.imageLoaded(homePage.imageLimitedEdition());
	}
	public void hoverHomePageWomenHoody(){
		this.hoverItem(homePage.homePageWomenHoody());
	}
	public void clickShopHomePageWomenHoody(){
		this.click(homePage.shioHomePageWomenHoody());
	}

}
