package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverPeriodPage {

	@FindBy(id = "LifeInsurance_TermYears_TermYears")
	private WebElement coverPeriod;

	public void coverperioddata(String value) {
		coverPeriod.sendKeys(value);
	}
}