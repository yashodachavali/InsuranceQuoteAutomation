package com.comparethemarket.insurance.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	private By getQuote = By.cssSelector("#LifeInsurance_LifeInsurance_LifeHeroBlock_GetAQuote");
    private By cookie=By.cssSelector(".cookie-consent__cta.cookie-consent__cta--dsc.btn-accept-all");
	
	public void getQuoteclick() {
		driver.findElement(getQuote).click();
	}
  public void acceptCookie() {
	  driver.findElement(cookie).click();
  }
}
