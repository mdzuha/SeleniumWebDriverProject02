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
public class AbercrombieFacebookLoginOptionPageModel extends ModelBase{

	public AbercrombieFacebookLoginOptionPageModel(WebDriver driver) {
		super(driver);
	}
	private WebElement emailTextBox;
	private WebElement passwordTextBox;
	private WebElement logInButton;
	private WebElement cancelButton;
	
	public WebElement emailTextBox(){
		emailTextBox = driver.findElement(By.id("email"));
		return emailTextBox;
	}
	public WebElement passwordTextBox(){
		passwordTextBox = driver.findElement(By.id("pass"));
		return passwordTextBox;
	}
	public WebElement logInButton(){
		logInButton = driver.findElement(By.xpath("//*[@value ='Log In']"));
		return logInButton;
	}
	public WebElement cancelButton(){
		cancelButton = driver.findElement(By.xpath("//*[@value='Cancel']"));
		return cancelButton;
	}
	private WebElement checkBox;
	private WebElement forgotPassword;
	
	public WebElement checkBox(){
		checkBox = driver.findElement(By.id("persist_box"));
		return checkBox;
		
	}
	public WebElement forgotPasssword(){
		forgotPassword = driver.findElement(By.xpath("//*[@id='loginform']//a[text() = 'Forgot password?']"));
		return forgotPassword;
	}

}
