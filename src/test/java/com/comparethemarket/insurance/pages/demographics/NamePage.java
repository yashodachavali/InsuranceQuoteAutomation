package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NamePage {
	public WebDriver driver;
	private By mrTitle = By.id("LifeInsurance_YourFullNameInformation_YourTitle_MR");
	private By mrsTitle = By.cssSelector("[id='LifeInsurance_YourFullNameInformation_YourTitle_MRS']");
	private By msTitle = By.cssSelector("input#LifeInsurance_YourFullNameInformation_YourTitle_MS");
	private By missTitle = By.xpath("//input[@id='LifeInsurance_YourFullNameInformation_YourTitle_MISS']");
	private By firstName = By.cssSelector("[placeholder='Enter first name']");
	private By surName = By.cssSelector("[placeholder='Enter surname']");
	private By nextButton = By.id("NextButton");
	private By backButton = By.id("BackButton");

	public void mrTitleSelect() {
		driver.findElement(mrTitle).click();
	}

	public void mrsTitleSelect() {
		driver.findElement(mrsTitle).click();
	}

	public void msTitleSelect() {
		driver.findElement(msTitle).click();
	}

	public void missTitleSelect() {
		driver.findElement(missTitle).click();
	}

	public void firstName(String value) {
		driver.findElement(firstName).sendKeys(value);
	}

	public void surName(String input) {
		driver.findElement(surName).sendKeys(input);
	}

	public WebElement backButtonClick() {
		return driver.findElement(backButton);
	}

	public WebElement nextButtonClick() {
		return driver.findElement(nextButton);
	}

}
