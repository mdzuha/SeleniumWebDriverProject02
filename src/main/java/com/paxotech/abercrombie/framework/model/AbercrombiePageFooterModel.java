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
public class AbercrombiePageFooterModel extends ModelBase{

	public AbercrombiePageFooterModel(WebDriver driver) {
		super(driver);
	}
	private WebElement facebookLogo;
	private WebElement twitterLogo;
	private WebElement pinterestLogo;
	private WebElement instagramLogo;
	private WebElement youtubeLogo;
	private WebElement waneloLogo;
	private WebElement socialMediaTerms;
	
	public WebElement facebookLogo(){
		facebookLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='facebook-share']"));
		return facebookLogo;
	}
	public WebElement twitterLogo(){
		twitterLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='twitter']"));
		return twitterLogo;
	}
	public WebElement pinterestLogo(){
		pinterestLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='pinterest']"));
		return pinterestLogo;
	}
	public WebElement instagramLogo(){
		instagramLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='instagram']"));
		return instagramLogo;
	}
	public WebElement youtubeLogo(){
		youtubeLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='you-tube']"));
		return youtubeLogo;
	}
	public WebElement waneloLogo(){
		waneloLogo = driver.findElement(By.xpath("//*[@id='home']//a[@title='wanelo']"));
		return waneloLogo;
	}
	public WebElement socialMediaTerms(){
		socialMediaTerms = driver.findElement(By.xpath("//*[@id='home']//a[@title = 'View Social Media Content Terms of Use']"));
		return socialMediaTerms;
	}
	
	private WebElement emailTextBox;
	private WebElement joinButton;
	
	public WebElement emailTextBox(){
		emailTextBox = driver.findElement(By.xpath("//*[@id='banner-email-field']"));
		return emailTextBox;
	}
	public WebElement joinButton(){
		joinButton = driver.findElement(By.name("submit"));
		return joinButton;
	}
	
	private WebElement findStore;
	private WebElement giftCards;
	private WebElement afText;
	private WebElement giveUsFeedBack;
	private WebElement help;
	private WebElement aboutUs;
	private WebElement privacyTerms;
	
	public WebElement findStore(){
		findStore = driver.findElement(By.xpath("//*[@id='home']//a[@title='Find a Store']"));
		return findStore;
	}
	public WebElement giftCards(){
		giftCards = driver.findElement(By.xpath("//*[@id='home']//a[@title='Gift Cards']"));
		return giftCards;
	}
	public WebElement afText(){
		afText = driver.findElement(By.xpath("//*[@id='home']//a[@title='A&F TEXTS']"));
		return afText;
	}
	public WebElement giveUsFeedBack(){
		giveUsFeedBack = driver.findElement(By.xpath("//*[@id='home']//a[@title='Give Us Feedback']"));
		return giveUsFeedBack;
	}
	public WebElement help(){
		help = driver.findElement(By.xpath("//*[@id='home']//a[@title='Help']"));
		return help;
	}
	public WebElement aboutUs(){
		aboutUs = driver.findElement(By.xpath("//*[@id='home']//a[@title='About Us']"));
		return aboutUs;
	}
	public WebElement privacyTerms(){
		privacyTerms = driver.findElement(By.xpath("//*[@id='home']//a[@title='Privacy & Terms']"));
		return privacyTerms;
	}
	
	private WebElement upArrow;

	public WebElement upArrow(){
		upArrow = driver.findElement(By.xpath("//div[@class='scroll-to-top show']/a"));
		return upArrow;
	}

}
