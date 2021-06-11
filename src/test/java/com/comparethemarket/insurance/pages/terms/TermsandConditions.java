package com.comparethemarket.insurance.pages.terms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class TermsandConditions extends BasePage {

	public TermsandConditions(WebDriver driver) {
		super(driver);
	}

	private By confirm = By.id("LifeInsurance_AcceptTermsAndConditions_AcceptTermsAndConditions");
	private By quotesButton = By.xpath("//button[@type='submit']");

	public void confirmDetails() {
		driver.findElement(confirm).click();
	}

	public void clickOnQuoteButton() {
		driver.findElement(quotesButton).click();
	}
}
