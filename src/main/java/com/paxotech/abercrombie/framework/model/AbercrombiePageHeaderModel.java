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

public class AbercrombiePageHeaderModel extends ModelBase{

	public AbercrombiePageHeaderModel(WebDriver driver) {
		super(driver);
	}
	private WebElement logo;
	
	public WebElement logo(){
		logo = driver.findElement(By.xpath("//*[@id='search-input-form']//button[@type='submit']"));
		return logo;
	}
	
	private WebElement signIn;
	private WebElement signInHovered;
	private WebElement becomeAMemeber;
	private WebElement trackMyOrder;
	private WebElement mySave;
	private WebElement viewAll;
	private WebElement bag;
	private WebElement shoppingBag;
	
	public WebElement signIn(){
		signIn = driver.findElement(By.xpath(".//a[text()='Sign In']"));
		return signIn;
	}
	public WebElement signInHoverde(){
		signInHovered = driver.findElement(By.xpath("//*[@id='util-account-nav']//a[@title='Sign In']"));
		return signInHovered;
	}
	public WebElement becomeAMember(){
		becomeAMemeber = driver.findElement(By.xpath("//*[@id='util-account-nav']//a[@title='Become a Member']"));
		return becomeAMemeber;
		
	}
	public WebElement trackMyOrder(){
		trackMyOrder = driver.findElement(By.xpath("//*[@id='util-account-nav']//a[@title='Track My Order']"));
		return trackMyOrder;
	}
	public WebElement mySave(){
		mySave = driver.findElement(By.xpath("//*[@id = 'util-wishlist']/a[@class = 'util-main']"));
		return mySave;
	}
	public WebElement viewAll(){
		viewAll = driver.findElement(By.xpath("//*[@id='util-wishlist']//a[@class='saves__view-all']"));
		return viewAll;
	}
	public WebElement bag(){
		bag = driver.findElement(By.xpath("//*[@id='util-minicart']/a[@class='util-main']"));
		return bag;
	}
	public WebElement shoppingBag(){
		shoppingBag = driver.findElement(By.xpath("//*[@id='minicart-header']//a[text()='Shopping Bag']"));
		return shoppingBag;
	}
	
	private WebElement searchBox;
	private WebElement searchButton;
	
	public WebElement searchTextBox(){
		searchBox = driver.findElement(By.id("site-search-field"));
		return searchBox;
	}
	public WebElement searchButton(){
		searchButton = driver.findElement(By.xpath("//*[@id='search-input-form']//button[@type='submit']"));
		return searchButton;
	}
	
	private WebElement mens;
	private WebElement womens;
	private WebElement kids;
	private WebElement sale;
	
	public WebElement mens(){
		mens = driver.findElement(By.xpath("//*[@id='primary-nav']//a[@title='Mens']"));
		return mens;
	}
	public WebElement womens(){
		womens = driver.findElement(By.xpath("//*[@id='primary-nav']//a[@title='Womens']"));
		return womens;
	}
	public WebElement kids(){
		kids = driver.findElement(By.xpath("//*[@id='primary-nav']//a[@title='kids']"));
		return kids;
	}
	public WebElement sale(){
		sale = driver.findElement(By.xpath("//*[@id='primary-nav']//a[@title='Sale']"));
		return sale;
	}
	
	private WebElement whatsNew;
	private WebElement justForStyle;

	public WebElement whatsNew(){
		whatsNew = driver.findElement(By.xpath("//*[@id='header-wrap']//a[text() = \"What's New\"]"));
		return whatsNew;
	}
	public WebElement justForStyle(){
		justForStyle = driver.findElement(By.xpath("//*[@id='header-wrap']//a[text()='Just Your Style']"));
		return justForStyle;
	}
	
	
	
}
