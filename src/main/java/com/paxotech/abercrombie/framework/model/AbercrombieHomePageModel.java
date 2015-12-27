/**
 * 
 */
package com.paxotech.abercrombie.framework.model;

import java.util.List;

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
	
	public WebElement limitedEdition(){
		limitedEdition = driver.findElement(By.xpath("//div[@class='mask']"));
		return limitedEdition;
	}
	public WebElement shopLimitedEdition(){
		shopLimitedEdition = driver.findElement(By.xpath("//div[@class='mask']/following-sibling::div[@class='shop one-button']/a"));
		return shopLimitedEdition;
	}

	private WebElement partyShop;
	private WebElement shopMens;
	private WebElement shopWomens;
	
	public WebElement partyShop(){
		partyShop = driver.findElement(By.xpath(".//div[@class='shop two-button']/preceding-sibling::div[@class='mask']"));
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
	private WebElement imageLimitedEdition;
	private WebElement imagePartyShop;
	public WebElement imageLimitedEdition(){
		imageLimitedEdition = driver.findElement(By.xpath("//div[@class='shop one-button']/following-sibling::img"));
		return imageLimitedEdition;
	}
	public WebElement imagePartyShop(){
		imagePartyShop = driver.findElement(By.xpath("//div[@class='shop two-button']/following-sibling::img"));
		return imagePartyShop;
	}
	
	
	private WebElement newArrivalMens;
	private WebElement newArrivalWomens;
	public WebElement newArrivalMens(){
		newArrivalMens = driver.findElement(By.xpath("//*[@id='product-recommendations']//a[contains(text(), 'Mens')]"));
		return newArrivalMens;
	}
	public WebElement newArrivalWomens(){
		newArrivalWomens = driver.findElement(By.xpath("//*[@id='product-recommendations']//a[contains(text(), 'Womens')]"));
		return newArrivalWomens;
	}
	public List<WebElement> homePageProducts(){
		List<WebElement>homePageProducts = driver.findElements(By.xpath(".//*[@id='product-recommendations']/ul/li/a[2]/b"));
		return homePageProducts;
	}
	private WebElement homePageWomenHoody;
	private WebElement shopHomePageWomenHoody;
	public WebElement homePageWomenHoody(){
		homePageWomenHoody = driver.findElement(By.xpath(".//*[@id='product-recommendations']/ul/li[8]/a[1]"));
		return homePageWomenHoody;
	}
	public WebElement shioHomePageWomenHoody(){
		homePageWomenHoody = driver.findElement(By.xpath(".//*[@id='product-recommendations']/ul/li[8]/a[1]/button"));
		return shopHomePageWomenHoody;
	}

}
