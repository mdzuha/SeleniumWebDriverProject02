/**
 * 
 */
package com.paxotech.abercrombie.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author masihur
 *
 */
public class AbercrombieHomePageModel extends ModelBase{

	public AbercrombieHomePageModel(WebDriver driver) {
		super(driver);
	}
	private WebElement limitedEdition;
	private WebElement shopLimitedEdition;
	
	public WebElement limitrdEdition(){
		limitedEdition = driver.findElement(By.xpath("//*[@id='latest_offers']//div[@class='offer right_offer']//div[@class='mask']"));
		return limitedEdition;
	}
	public WebElement shopLimitedEdition(){
		shopLimitedEdition = driver.findElement(By.xpath("//*[@id='latest_offers']//div[@class='offer right_offer']//div[@class='shop one-button']/a"));
		return shopLimitedEdition;
	}
	
	private WebElement partyShop;
	private WebElement shopMens;
	private WebElement shopWomens;
	
	public WebElement partyShop(){
		partyShop = driver.findElement(By.xpath("//*[@id='latest_offers']//div[@class='offer right_offer']//div[@class='shop two-button']"));
		return partyShop;
	}
	public WebElement shopMens(){
		shopMens = driver.findElement(By.xpath("//div[@class='shop two-button']/a[contains(text(), 'Mens')]"));
		return shopMens;
	}
	public WebElement shopWomens(){
		shopWomens = driver.findElement(By.xpath("//div[@class='shop two-button']/a[contains(text(), 'Womens')]"));
		return shopWomens;
	}

}
