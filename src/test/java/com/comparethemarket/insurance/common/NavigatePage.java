package com.comparethemarket.insurance.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comparethemarket.insurance.pages.demographics.NamePage;
import com.comparethemarket.insurance.pages.home.HomePage;

public class NavigatePage extends BasePage {

	public NavigatePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "['NextButton']")
	private WebElement nextButton;
	@FindBy(id = "['BackButton']")
	private WebElement BackButton;
	//SuperClass

	public void clickOnNextButton(BasePage page) {
		this.nextButton.click();
	}

	public HomePage clickOnBackButton() {
		this.BackButton.click();
		return new HomePage(driver);
	}
}
