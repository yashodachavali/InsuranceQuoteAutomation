package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comparethemarket.insurance.common.BasePage;

public class LevelTermPage extends BasePage {

	public LevelTermPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "LifeInsurance_CoverType_CoverType_LT")
	private WebElement LevelTerm;
	
	@FindBy(css = "#LifeInsurance_CoverType_CoverType_D")
	private WebElement Decreasing;


	public WebElement levelTermselection() {
		return LevelTerm;
	}

	public WebElement decreasingselection() {
		return Decreasing;
	}

}
