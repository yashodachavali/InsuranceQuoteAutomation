package com.comparethemarket.insurance.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class SmokevalidationPage extends BasePage {

	public SmokevalidationPage(WebDriver driver) {
		super(driver);
	}

	private By smokingPerson = By.id("LifeInsurance_YourSmoke_YourSmoke_YES");
	private By nonSmokingPerson = By.id("LifeInsurance_YourSmoke_YourSmoke_NO");



	public void smokingPersonSelection() {
		driver.findElement(smokingPerson).click();
	}

	public void nonSmokingPersonSelection() {
		driver.findElement(nonSmokingPerson).click();
	}

}
