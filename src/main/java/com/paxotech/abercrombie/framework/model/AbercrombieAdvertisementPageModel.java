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
public class AbercrombieAdvertisementPageModel extends ModelBase{

	public AbercrombieAdvertisementPageModel(WebDriver driver) {
		super(driver);
	}
	private WebElement closeAdd;
	
	public WebElement closeAdd(){
		closeAdd = driver.findElement(By.xpath(".//*[@id='simplemodal-container']/a[@title='Close']"));
		return closeAdd;
	}
}
