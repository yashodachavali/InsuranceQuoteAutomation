package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class QuoteTypePage extends BasePage {

	public QuoteTypePage(WebDriver driver) {
		super(driver);
	}

	private By singleQuote = By.xpath("//input[@id='LifeInsurance_WhoToCover_WhoToCover_JM']");
	private By familyQuote = By.cssSelector("input[id='LifeInsurance_WhoToCover_WhoToCover_MAAP']");
	private By nextButton = By.id("NextButton");

	public void singleQuoteClick() {
		driver.findElement(singleQuote);
	}

	public void familyQuoteClick() {
		driver.findElement(familyQuote);
	}

	public void nextButtonClick() {
		driver.findElement(nextButton);
	}
}
