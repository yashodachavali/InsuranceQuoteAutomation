package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comparethemarket.insurance.common.BasePage;

public class CoverPeriodPage extends BasePage {

	public  CoverPeriodPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "LifeInsurance_TermYears_TermYears")
	private WebElement coverPeriod;

	
	public void coverperioddata(String value) {
		coverPeriod.sendKeys(value);
	}
}