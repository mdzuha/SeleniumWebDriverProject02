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
public class AbercrombieMensPageModel extends ModelBase{

	public AbercrombieMensPageModel(WebDriver driver) {
		super(driver);
	}
	public List<WebElement> categoryMensPage(){
		List<WebElement> categoryMensPage = driver.findElements(By.xpath("//*[@id='category-nav']//li/a"));
		return categoryMensPage;
	}
	private WebElement newArrival;
	private WebElement giftCards;
	private WebElement afLogo;
	private WebElement afEssentials;
	private WebElement eastCoastSupport;
	private WebElement lookBooks;
	private WebElement trendEdit;
	private WebElement exclusives;
	private WebElement favouriteBrands;
	private WebElement outwearJacket;
	private WebElement hoodiesSweatshirt;
	private WebElement sweaters;
	private WebElement shirts;
	private WebElement teesHenleys;
	private WebElement polos;
	private WebElement graphicTees;
	private WebElement jeans;
	private WebElement sweatPants;
	private WebElement pants;
	private WebElement joggers;
	private WebElement shorts;
	private WebElement swim;
	private WebElement underwearSocks;
	private WebElement sleep;
	private WebElement accessories;
	private WebElement shoes;
	private WebElement cologne;
	private WebElement clearance;
	
	public WebElement newArrival(){
		newArrival = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'New')]"));
		return newArrival;
	}
	public WebElement giftCards(){
		giftCards = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Gift')]"));
		return giftCards;
	}
	public WebElement afLogo(){
		afLogo = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Logo')]"));
		return afLogo;
	}
	public WebElement afEssentials(){
		afEssentials = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Essentials')]"));
		return afEssentials;
	}
	public WebElement eastCoastSupport(){
		eastCoastSupport = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'East')]"));
		return eastCoastSupport;
	}
	public WebElement lookBooks(){
		lookBooks = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Look')]"));
		return lookBooks;
	}
	public WebElement trendEdit(){
		trendEdit = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Trend')]"));
		return trendEdit;
	}
	public WebElement exclusives(){
		exclusives = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Exclusives')]"));
		return exclusives;
	}
	public WebElement favouriteBrands(){
		favouriteBrands = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Favourite')]"));
		return favouriteBrands;
	}
	public WebElement outwearJacket(){
		outwearJacket = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Jackets')]"));
		return outwearJacket;
	}
	public WebElement hoodiesSweatshirt(){
		hoodiesSweatshirt = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Hoodies')]"));
		return hoodiesSweatshirt;
	}
	public WebElement sweaters(){
		sweaters = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Sweaters')]"));
		return sweaters;
	}
	public WebElement shirts(){
		shirts = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Shirts')]"));
		return shirts;
	}
	public WebElement teesHenleys(){
		teesHenleys = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Henleys')]"));
		return teesHenleys;
	}
	public WebElement polos(){
		polos = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Polos')]"));
		return polos;
	}
	public WebElement graphicTees(){
		graphicTees = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Graphic')]"));
		return graphicTees;
	}
	public WebElement jeans(){
		jeans = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Jeans')]"));
		return jeans;
	}
	public WebElement sweatPants(){
		sweatPants = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Sweatpants')]"));
		return sweatPants;
	}
	public WebElement pants(){
		pants = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Pants')]"));
		return pants;
	}
	public WebElement joggers(){
		joggers = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Joggers')]"));
		return joggers;
	}
	public WebElement underwearSocks(){
		underwearSocks = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Socks')]"));
		return underwearSocks;
	}
	public WebElement shorts(){
		shorts = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Shorts')]"));
		return shorts;
	}
	public WebElement sleep(){
		sleep = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Sleep')]"));
		return sleep;
	}
	public WebElement accessories(){
		accessories = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Accessories')]"));
		return accessories;
	}
	public WebElement shoes(){
		shoes = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Shoes')]"));
		return shoes;
	}
	public WebElement cologne(){
		cologne = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Cologne')]"));
		return cologne;
	}
	public WebElement clearance(){
		clearance = driver.findElement(By.xpath("//*[@id='category-nav']//a[contains(text(), 'Clearance')]"));
		return clearance;
	}
	private WebElement parka;
	private WebElement shopParka;
	private WebElement puffer;
	private WebElement shopPuffer;
	private WebElement jackets;
	private WebElement shopJackets;
	public WebElement parka(){
		parka = driver.findElement(By.xpath("(.//*[@id='division-content']//div[@class='screen'])[1]"));
		return parka;
	}
	public WebElement shopParka(){
		shopParka = driver.findElement(By.xpath("//*[@id='division-content']//div[@class='hover first']/a"));
		return shopParka;
	}
	public WebElement puffer(){
		puffer = driver.findElement(By.xpath(".//*[@id='division-content']//div[@class='hover second']//div[@class='screen']"));
		return puffer;
	}
	public WebElement shopPuffer(){
		shopPuffer = driver.findElement(By.xpath("//*[@id='division-content']//div[@class='hover second']/a"));
		return shopPuffer;
	}
	public WebElement jackets(){
		jackets = driver.findElement(By.xpath(".//*[@id='division-content']//div[@class='hover third']//div[@class='screen']"));
		return jackets;
	}
	public WebElement shopJackets(){
		shopJackets = driver.findElement(By.xpath("//*[@id='division-content']//div[@class='hover third']/a"));
		return shopJackets;
	}
	private WebElement shopJustYourStyle;
	public WebElement shopJustYourStyle(){
		shopJustYourStyle = driver.findElement(By.xpath("//p[@class='style-body']/following-sibling::a"));
		return shopJustYourStyle;
	}
	
	

}
