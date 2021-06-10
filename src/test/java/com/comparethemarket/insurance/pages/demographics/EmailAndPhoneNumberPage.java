package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.comparethemarket.insurance.common.BasePage;

public class EmailAndPhoneNumberPage extends BasePage {

	public EmailAndPhoneNumberPage(WebDriver driver) {
		super(driver);
	}

	private By email = By.id("LifeInsurance_ContactDetails_EmailAddress");
	private By phoneNumber = By.id("LifeInsurance_ContactDetails_PhoneNumber");

	public void emailId(String value) {
		driver.findElement(email).sendKeys(value);
	}

	public void phoneNumber(String value1) {
		driver.findElement(phoneNumber).sendKeys(value1);
	}
}
