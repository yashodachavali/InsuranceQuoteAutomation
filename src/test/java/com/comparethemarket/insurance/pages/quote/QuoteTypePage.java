package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class QuoteTypePage extends BasePage {

	public QuoteTypePage(WebDriver driver) {
		super(driver);
	}

	private By myselfQuoteElement = By.xpath("//input[@id='LifeInsurance_WhoToCover_WhoToCover_JM']");
	private By familyQuote = By.cssSelector("input[id='LifeInsurance_WhoToCover_WhoToCover_MAAP']");
	private By nextButton = By.id("NextButton");

	public void clickOnMyselfQuote() {
		driver.findElement(myselfQuoteElement).click();
	}

	public void familyQuoteClick() {
		driver.findElement(familyQuote);
	}

	/*
	 * public void clickOnNextButton() { driver.findElement(nextButton).click(); }
	 */

}
