package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comparethemarket.insurance.common.BasePage;

public class MinAmountCoverPage extends BasePage {

	public MinAmountCoverPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id = "LifeInsurance_CoverAmount_CoverAmount")
	private WebElement minAmount;


	public void minAmountcover(String value) {
		minAmount.sendKeys(value);
	}
}
