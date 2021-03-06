package com.comparethemarket.insurance.pages.terms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.comparethemarket.insurance.common.BasePage;

import io.cucumber.messages.internal.com.google.protobuf.ByteString.Output;

public class QuotesSummaryPage extends BasePage {

	public QuotesSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='Summary of key details']")
	private WebElement heading;

	@FindBy(xpath = "//div[text()='Your details']")
	private WebElement datailsOfUser;

	@FindBy(xpath = "//div[@id='LifeInsurance_YourQuotes']/section[3]")
	private WebElement lifeSearchText;

	public void getInsuranceQuotes() {
		wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[text()='Summary of key details']")));
	}

	public void getYourDetails() {
		datailsOfUser.click();
	}

	public void scrollPage() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", lifeSearchText);
		
		
	}
}
