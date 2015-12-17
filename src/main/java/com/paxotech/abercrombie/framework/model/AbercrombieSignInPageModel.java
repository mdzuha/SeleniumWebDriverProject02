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
public class AbercrombieSignInPageModel extends ModelBase{

	public AbercrombieSignInPageModel(WebDriver driver) {
		super(driver);
	}
	private WebElement emailTextBox;
	private WebElement passwordTextBox;
	private WebElement signInButton;
	
	public WebElement emailTextBox(){
		emailTextBox = driver.findElement(By.id("login-email-field"));
		return emailTextBox;
	}
	public WebElement passwordTextBox(){
		passwordTextBox = driver.findElement(By.id("login-password-field"));
		return passwordTextBox;
	}
	public WebElement signInButton(){
		signInButton = driver.findElement(By.xpath("//*[@id='login-form']//span[text()='Sign In']"));
		return signInButton;
	}
	
	private WebElement facebookLink;
	private WebElement facebookTooltip;
	
	public WebElement facebookLink(){
		facebookLink = driver.findElement(By.id("facebook"));
		return facebookLink;
	}
	public WebElement facebookTooltip(){
		facebookTooltip = driver.findElement(By.xpath("//*[@id='login-content']//div[@class='sso-buttons']/a"));
		return facebookTooltip;
	}
	private WebElement registerLink;
	private WebElement forgotPasswordLink;
	private WebElement afClubTerms;
	private WebElement websiteTerms;
	private WebElement privacyPolicy;
	
	public WebElement registerLink(){
		registerLink = driver.findElement(By.xpath("//*[@id='login-content']//a[@class='button']"));
		return registerLink;
	}
	public WebElement forgotPasswordLink(){
		forgotPasswordLink = driver.findElement(By.xpath("//*[@id='login-form']//li[@class='forgot-password']/a"));
		return forgotPasswordLink;
	}
	public WebElement afClubTerms(){
		afClubTerms = driver.findElement(By.xpath("//*[@id='login-content']//a[@class='button']"));
		return afClubTerms;
	}
	public WebElement websiteTerms(){
		websiteTerms = driver.findElement(By.xpath("//*[@id='login-content']//a[@class='button']"));
		return websiteTerms;
	}
	public WebElement privacyPolicy(){
		privacyPolicy = driver.findElement(By.xpath("//*[@id='login-content']//a[@class='button']"));
		return privacyPolicy;
	}
	
		
	

}
