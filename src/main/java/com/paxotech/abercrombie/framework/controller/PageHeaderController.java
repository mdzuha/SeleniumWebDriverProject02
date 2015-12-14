/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paxotech.abercrombie.framework.model.PageHeaderModel;

/**
 * @author masihur
 *
 */

public class PageHeaderController extends ControllerBase {

	private PageHeaderModel pageHeader = null;

	public PageHeaderController(WebDriver driver) {
		super(driver);
		pageHeader = new PageHeaderModel(driver);
	}

	public void logoLink() {
		this.click(pageHeader.logo());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void searchText(String text) {
		pageHeader.searchTextBox().sendKeys(text);
		pageHeader.searchButton().click();
	}

	public void mensPageLink() {
		this.click(pageHeader.mens());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void womensPageLink() {
		this.click(pageHeader.womens());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void kidsPageLink() {
		this.click(pageHeader.kids());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void salePageLink() {
		this.click(pageHeader.sale());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void whatsNewLink() {
		this.click(pageHeader.whatsNew());
		try {
			this.verifyPage(new URL("http://www.abercrombie.com/shop/us"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void justYourStyleLink() {
		this.click(pageHeader.justForStyle());
		try {
			this.verifyPage(new URL("http://www.abercrombie.com/shop/us"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void hoverSignin() {
		this.hoverItem(pageHeader.signIn());
	}

	public void signinLink() {
		this.hoverSignin();
		this.delayFor(5000);
		this.click(pageHeader.signInHoverde());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
		
	}

	public void becomeAMemberLink() {
		this.hoverSignin();
		this.delayFor(5000);
		this.click(pageHeader.becomeAMember());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void trackMyOrderLink() {
		this.hoverSignin();
		this.delayFor(5000);
		this.click(pageHeader.trackMyOrder());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void hoverMySave() {
		this.hoverItem(pageHeader.mySave());
	}

	public void veiwAllLink() {
		this.hoverMySave();
		this.delayFor(5000);
		this.click(pageHeader.viewAll());
		this.verifyPage("Abercrombie & Fitch | Authentic American clothing since 1892");
	}

	public void hoverBag() {
		this.hoverItem(pageHeader.bag());
	}

	public void shoppingBagLink() {
		this.hoverBag();
		this.delayFor(5000);
		this.click(pageHeader.shoppingBag());
		this.verifyPageTitle("Abercrombie & Fitch | Authentic American clothing since 1892");
		try {
			this.verifyPage(new URL("http://www.abercrombie.com/shop/us"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	public void list(){
		String[] optionNameExpected = {"Sign In", "Become a Member", "Track My Order"};
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='util-account-nav']//a"));
		String[] optionNamesActual = new String[list.size()];
		for(int i = 0; i<list.size(); i++){
			

			optionNamesActual[i] = list.get(i).getAttribute("title");
			System.out.println(optionNamesActual[i]);
			System.out.println(Arrays.toString(optionNamesActual));
		}
		Assert.assertArrayEquals(optionNameExpected, optionNamesActual);
		
	}

}
