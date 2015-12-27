/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paxotech.abercrombie.framework.model.AbercrombieKidsPageModel;

/**
 * @author Masihur
 *
 */
public class AbercrombieKidsPageController extends ControllerBase{

	private AbercrombieKidsPageModel kidsPage;
	public AbercrombieKidsPageController(WebDriver driver) {
		super(driver);
		kidsPage = new AbercrombieKidsPageModel(driver);
	}
	public void imageKidsPageIsPresent(){
		this.imageLoaded(kidsPage.imageKidsPage());
	}
	public void hoverShopBoys(){
		this.hoverItem(kidsPage.shopBoys());
	}
	public void clickShopBoysLink(){
		this.click(kidsPage.shopBoys());
		this.verifyPage("boys | abercrombiekids.com");
	}
	public void hoverShopGirls(){
		this.hoverItem(kidsPage.shopGirls());
	}
	public void clickShopGirlsLink(){
		this.click(kidsPage.shopGirls());
		this.verifyPage("girls | abercrombiekids.com");
	}
	public void categoryBoysList(){
		String[] expectedCategories = {"new arrivals", "gift guide", "online exclusives", "a&f logo shop", "uniform shop", "lookbooks", "the trend edit", "styles for ages 3 & up!", "holiday outfits", "outerwear & jackets", "hoodies & sweatshirts", "tees & henleys", "graphic tees", "shirts", "sweaters", "polos", "a&f active", "jeans", "sweatpants", "pants", "joggers", "shorts", "swim", "shoes & flip flops", "accessories", "underwear", "cologne & body care", "clearance"};

		String[] actualCategories = new String[kidsPage.categoryBoys().size()];
		
		for(int i=0; i<kidsPage.categoryBoys().size(); i++){
			WebElement element = kidsPage.categoryBoys().get(i);
			String text = element.getText();
			actualCategories[i] = text;
		}
		System.out.println(Arrays.toString(actualCategories));
		Assert.assertArrayEquals(expectedCategories, actualCategories);
	}
	public void categoryGirlsList(){
		String[] expectedCategories = {"new arrivals", "gift guide", "online exclusives", "a&f logo shop", "uniform shop", "lookbooks", "the trend edit", "styles for ages 3 & up!", "holiday outfits", "outerwear & jackets", "dresses", "hoodies & sweatshirts", "sweaters", "graphic tees", "tops", "jeans", "sweatpants", "leggings", "a&f active", "pants", "shorts", "skirts", "overalls", "sleep", "underwear", "swim", "shoes", "fragrance", "clearance"};
							
		String[] actualCategories = new String[kidsPage.categoryBoys().size()];
		
		for(int i=0; i<kidsPage.categoryBoys().size(); i++){
			WebElement element = kidsPage.categoryBoys().get(i);
			String text = element.getText();
			actualCategories[i] = text;
		}
		System.out.println(Arrays.toString(actualCategories));
		Assert.assertArrayEquals(expectedCategories, actualCategories);
	}
	

}
