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
	private By error = By.cssSelector("#PhoneNumber_error_message");
	private By question = By.xpath("//section[contains(@class,'Error')]/div/span");
	private By viewQuestion = By.xpath("//section[contains(@class,'Error')]/div/button");

	public void inpuptEmailId(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}

	public void inputPhoneNumber(String telephoneNumber) {
		driver.findElement(phoneNumber).sendKeys(telephoneNumber);
	}

	public String getPhoneErrorMessage() {
		return driver.findElement(error).getText();
	}

	public String getCompleteQuestionText() {
		return driver.findElement(question).getText();
	}

	public void viewQuestionClick() {
		driver.findElement(viewQuestion).click();
	}
}
