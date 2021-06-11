package com.comparethemarket.insurance.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.comparethemarket.insurance.common.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By quoteButtonElement = By.cssSelector("#LifeInsurance_LifeInsurance_LifeHeroBlock_GetAQuote");
	private By cookie = By.cssSelector(".cookie-consent__cta.cookie-consent__cta--dsc.btn-accept-all");

	public WebElement clickQuoteButton() {
		return driver.findElement(quoteButtonElement);
	}

	/*
	 * public void clickQuoteButton() {
	 * driver.findElement(quoteButtonElement).click(); }
	 */
	
	public void acceptCookie() {
		driver.findElement(cookie).click();
	}
	
	public void verifyJourneyPageIsDisplayed(){
		wait.until(ExpectedConditions.titleIs("Compare the Market - Life Insurance"));
	}
}
