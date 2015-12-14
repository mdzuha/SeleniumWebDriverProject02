/**
 * 
 */
package com.paxotech.abercrombie.framework.model;

import org.openqa.selenium.WebDriver;



/**
 * @author masihur
 *
 */
public class ModelBase {
	
	protected WebDriver driver = null;
	
	public ModelBase(WebDriver driver){
		this.driver = driver;
	}

}
