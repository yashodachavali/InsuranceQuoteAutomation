package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comparethemarket.insurance.common.BasePage;

public class NamePage extends BasePage {
	public NamePage(WebDriver driver) {
		super(driver);
	}

	private By mrTitle = By.id("LifeInsurance_YourFullNameInformation_YourTitle_MR");
	private By mrsTitle = By.cssSelector("[id='LifeInsurance_YourFullNameInformation_YourTitle_MRS']");
	private By msTitle = By.cssSelector("input#LifeInsurance_YourFullNameInformation_YourTitle_MS");
	private By missTitle = By.xpath("//input[@id='LifeInsurance_YourFullNameInformation_YourTitle_MISS']");
	private By firstName = By.cssSelector("[placeholder='Enter first name']");
	private By lastName = By.cssSelector("[placeholder='Enter surname']");
	private By nextButton = By.id("NextButton");
	private By backButton = By.id("BackButton");

	// private By firstNameId =
	// By.id("LifeInsurance_YourFullNameInformation_YourFirstName");

	public void selectMrTitle() {
		driver.findElement(mrTitle).click();
	}

	public void enterFirstName(String input) {
		driver.findElement(firstName).sendKeys(input);
	}

	public void enterLastName(String input) {
		driver.findElement(lastName).sendKeys(input);
	}

	public WebElement backButtonClick() {
		return driver.findElement(backButton);
	}

	public WebElement nextButtonClick() {
		return driver.findElement(nextButton);
	}

}
