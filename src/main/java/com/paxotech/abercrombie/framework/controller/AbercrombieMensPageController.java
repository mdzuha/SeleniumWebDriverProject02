/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paxotech.abercrombie.framework.model.AbercrombieMensPageModel;

/**
 * @author Masihur
 *
 */
public class AbercrombieMensPageController extends ControllerBase{
	
	private AbercrombieMensPageModel mensPage;
	public AbercrombieMensPageController(WebDriver driver) {
		super(driver);
		mensPage = new AbercrombieMensPageModel(driver);
	}
	public void categoryMensPage(){
//		String[] expectedCategories = {"Outerwear & Jackets", "Tops", "Bottoms", "Underwear & Socks", "Sleep", "Accessories", "Shoes", "Cologne", "New Arrivals", "Gift Guide", "A&F Logo Shop", "A&F Essentials", "East Coast Sport", "Lookbooks", "The Trend Edit", "Exclusives", "Our Favorite Brands", "Clearance"};
		String[] expectedCategories =	{"New Arrivals", "Gift Guide", "A&F Logo Shop", "A&F Essentials", "East Coast Sport", "Lookbooks", "The Trend Edit", "Exclusives", "Our Favorite Brands", "Outerwear & Jackets", "Hoodies & Sweatshirts", "Sweaters", "Shirts", "Tees & Henleys", "Polos", "Graphic Tees", "Jeans", "Sweatpants", "Pants", "Joggers", "Shorts", "Swim", "Underwear & Socks", "Sleep", "Accessories", "Shoes", "Cologne", "Clearance"};
//		[New Arrivals, Gift Guide, A&F Logo Shop, A&F Essentials, East Coast Sport, Lookbooks, The Trend Edit, Exclusives, Our Favorite Brands, Outerwear & Jackets, Tops, Bottoms, Underwear & Socks, Sleep, Accessories, Shoes, Cologne, Clearance]
		String[] actualCategories = new String[mensPage.categoryMensPage().size()];
		
		for(int i = 0; i<mensPage.categoryMensPage().size(); i++){
			WebElement element = mensPage.categoryMensPage().get(i);
			String text = element.getText();
			actualCategories[i] = text;
		}
		System.out.println(Arrays.toString(actualCategories));
		Assert.assertArrayEquals(expectedCategories, actualCategories);
	}
	public void hoverParka(){
		this.hoverItem(mensPage.parka());
	}
	public void clickParka(){
		this.click(mensPage.shopParka());
		this.verifyPage("Mens | Abercrombie.com");
	}
	public void hoverPuffer(){
		this.hoverItem(mensPage.puffer());
	}
	public void clickPuffer(){
		this.click(mensPage.shopPuffer());
		this.verifyPage("Mens Puffers Outerwear & Jackets | Abercrombie.com");
	}
	public void hoverJackets(){
		this.hoverItem(mensPage.jackets());
	}
	public void clickJackets(){
		this.click(mensPage.shopJackets());
		this.verifyPage("Mens | Abercrombie.com");
	}
	public void clickShopJustYourStyle(){
		this.click(mensPage.shopJustYourStyle());
		this.verifyPage("Mens | Abercrombie.com");
	}
	
	

}
