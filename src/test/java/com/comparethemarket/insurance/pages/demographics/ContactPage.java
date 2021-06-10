package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comparethemarket.insurance.common.BasePage;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	private By Contact = By.cssSelector("[value='doNotContact']");
	private By ContactPhone = By.cssSelector("[value='telephone']");
	private By ContactPost = By.cssSelector("[value='post']");
	private By ContactEmail = By.cssSelector("[value='email']");
	private By ContactText = By.cssSelector("[value='sms']");

	public WebElement donotContact() {
		return driver.findElement(Contact);
	}

	public void contactByPhone() {
		driver.findElement(ContactPhone).click();
	}

	public void contactByEmail() {
		driver.findElement(ContactEmail).click();
	}

	public void contactByPost() {
		driver.findElement(ContactPost).click();
	}

	public void contactByText() {
		driver.findElement(ContactText).click();
	}
}
