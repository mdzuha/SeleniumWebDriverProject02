/**
 * 
 */
package com.paxotech.abercrombie.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author PaxoTech Student
 *
 */
public class BecomeAMemeberModel extends ModelBase{
	
	public static void main(String[] arg){
		
	}

	public BecomeAMemeberModel(WebDriver driver) {
		super(driver);
	}
	private WebElement firstName;
	private WebElement lastName;
	private WebElement phone;
	private WebElement email;
	private WebElement password;
	private WebElement confirmPassword;
	private WebElement becomeAMemberButton;
	
	public WebElement firstName(){
		firstName = driver.findElement(By.id("firstname-field"));
		return firstName;
	}
	public WebElement lastName(){
		lastName = driver.findElement(By.id("lastname-field"));
		return lastName;
	}
	public WebElement phone(){
		phone = driver.findElement(By.id("phone-primary"));
		return phone;
	}
	public WebElement emailAddress(){
		email = driver.findElement(By.id("email"));
		return email;
	}
	public WebElement password(){
		password = driver.findElement(By.id("login-password-field"));
		return password;
	}
	public WebElement confirmPassword(){
		confirmPassword = driver.findElement(By.id("login-password-field-confirm"));
		return confirmPassword;
	}
	public WebElement becomeAMemberButton(){
		becomeAMemberButton = driver.findElement(By.xpath("//*[@id='sign-up-form']//span[text()='Become a Member']"));
		return becomeAMemberButton;
	}
	private WebElement phoneTooltip;
	private WebElement checkBox;
	private WebElement afClubTerms;
	private WebElement websiteTerms;
	private WebElement privacyPolicy;
	
	public WebElement phoneTooltip(){
		phoneTooltip = driver.findElement(By.id("register-phone-tooltip"));
		return phoneTooltip;
	}
	public WebElement checkBox(){
		checkBox = driver.findElement(By.id("optIn"));
		return checkBox;
	}
	public WebElement afClubTerms(){
		afClubTerms = driver.findElement(By.xpath("//*[@id='sign-up-form']//a[text()='A&F Club Terms']"));
		return afClubTerms;
	}
	public WebElement websiteTerms(){
		websiteTerms = driver.findElement(By.xpath("//*[@id='sign-up-form']//a[text()='Website Terms of Use']"));
		return websiteTerms;
	}
	public WebElement privacyPolicy(){
		privacyPolicy = driver.findElement(By.id("//*[@id='sign-up-form']//a[text()='Privacy Policy']"));
		return privacyPolicy;
	}
	
	
	private WebElement facebook;
	private WebElement facebookTooltip;
	public WebElement facebook(){
		facebook = driver.findElement(By.id("facebook"));
		return facebook;
	}
	public WebElement facebookTooltip(){
		facebookTooltip = driver.findElement(By.xpath("//*[@id='primary-content']//a[text()='Why?']"));
		return facebookTooltip;
	}
	
	
	

}
