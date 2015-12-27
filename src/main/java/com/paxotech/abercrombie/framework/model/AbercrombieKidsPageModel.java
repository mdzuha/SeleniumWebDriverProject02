/**
 * 
 */
package com.paxotech.abercrombie.framework.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Masihur
 *
 */
public class AbercrombieKidsPageModel extends ModelBase{
	
	public AbercrombieKidsPageModel(WebDriver driver) {
		super(driver);
	}
	private WebElement imageKidsPage;
	private WebElement shopBoys;
	private WebElement shopGirls;
	public WebElement imageKidsPage(){
		imageKidsPage = driver.findElement(By.xpath("//div[@class='button-wrapper']/following-sibling::img"));
		return imageKidsPage;
	}
	public WebElement shopBoys(){
		shopBoys = driver.findElement(By.xpath("//*[@id='division-content']//div[@class='button-wrapper']/a[contains(text(), 'boys')]"));
		return shopBoys;
	}
	public WebElement shopGirls(){
		shopGirls = driver.findElement(By.xpath("//*[@id='division-content']//div[@class='button-wrapper']/a[contains(text(), 'girls')]"));
		return shopGirls;
	}
	public List<WebElement> categoryBoys(){
		List<WebElement> categoryBoys = driver.findElements(By.xpath("//*[@id='category-nav']//li/a"));
		return categoryBoys;
	}
	public List<WebElement> categoryGilrs(){
		List<WebElement> categoryGirls = driver.findElements(By.xpath("//*[@id='category-nav']//li/a"));
		return categoryGirls;
	}

}
