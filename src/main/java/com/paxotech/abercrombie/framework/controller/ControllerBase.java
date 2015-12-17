/**
 * 
 */
package com.paxotech.abercrombie.framework.controller;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.Assert;

import static org.hamcrest.Matchers.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author masihur
 *
 */
public class ControllerBase {
	
	protected WebDriver driver = null;
	
	public ControllerBase(WebDriver driver){
		this.driver = driver;
		
	}
	public void windowHandle(){
		String parentHandle = driver.getWindowHandle(); // get the current window handle
//		driver.findElement(By.xpath("//*[@id='someXpath']")).click(); // click some link that opens a new window
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		    driver.switchTo().window(parentHandle); // switch back to the original window
		}

		//code to do something on new window
	}
	public String switchWindowByTitle(String titleExpected){
		String titleToMatch = titleExpected.trim().toUpperCase();
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String item: windows){
			System.out.println(item.toString());
			if(item.contentEquals(item)){
				driver.switchTo().window(item);
				String titleActual = driver.getTitle().trim().toUpperCase();
				System.out.println(titleActual);
				if(titleActual.contains(titleToMatch)){
					break;
				}
				
			}
		}
		return currentWindow;
	}
	public void enter(WebElement element){
		element.sendKeys(Keys.ENTER);
	}
	public void tabSwitch(String text, String testText, WebElement firstElement, WebElement secondElement){
		firstElement.sendKeys(text);
		firstElement.sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(testText);
		String actualValue = secondElement.getAttribute("value");
		
		assertThat(actualValue, equalTo("TESTTEXT"));
		
		
	}
	public void matrixTyping(long intToBeTyped, WebElement element){
		int length = String.valueOf(intToBeTyped).length();
		for(int i = 0; i<length; i++){
			char chars = String.valueOf(intToBeTyped).charAt(i);
			String charSeq = String.valueOf(chars);
			element.sendKeys(charSeq);
		}
	}
	public void matrixTyping(String stringToBeTyped, WebElement element){
		element.clear();
		int length = stringToBeTyped.length();
		for(int i = 0; i<length; i++){
			char chars = stringToBeTyped.charAt(i);
			String charSeq = String.valueOf(chars);
			element.sendKeys(charSeq);
		}
	}
	public void scrollDown() throws AWTException{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		delayFor(10000);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public void scrollDownJS(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2500)", "");//scroll down for 2500 pixel
		//jse.executeScript("scroll(0, 250);");
	}
	public void scrollUpJS(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		//jse.executeScript("scroll(0, -250);");
		
	}
	
	public void hoverItem(WebElement element){
		Actions actions = new Actions(driver); 
		actions.moveToElement(element);
		actions.perform();
	}
	public void hoverItem(By by){
		WebElement element = driver.findElement(by);
		hoverItem(element);
	}
	public void hoverItemEx(WebElement element){
		Locatable hoverItem = (Locatable) element;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());
	}
	public void hoverItemEx(By by){
		WebElement element = driver.findElement(by);
		hoverItemEx(element);
	}
	public void click(WebElement element){
		element.click();
	}
	public void verifyPage(String title){
		String expectedTitle = title.trim().toUpperCase();
		String actualTitle = driver.getTitle().trim().toUpperCase();
		assertThat(actualTitle, is(equalTo(expectedTitle)));
		
	}
	public void verifyPageTitle(String title){
		String expectedTitle = title.trim().toUpperCase();
		String actualTitle = driver.getTitle().trim().toUpperCase();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void verifyPage(URL expectedUrl){
		Assert.assertEquals(driver.getCurrentUrl().toString(),expectedUrl.toString()) ;
	}
	public void delayFor(int milli){
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
