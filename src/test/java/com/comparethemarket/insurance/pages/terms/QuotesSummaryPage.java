package com.comparethemarket.insurance.pages.terms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.comparethemarket.insurance.common.BasePage;

public class QuotesSummaryPage extends BasePage {

	public QuotesSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='Summary of key details']")
	WebElement heading;
	@FindBy(xpath="//div[text()='Your details']")
	WebElement datailsOfUser;

	public void getInsuranceQuotes() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[text()='Summary of key details']")));
		
	}
	public void getYourDetails() {
		datailsOfUser.click();
	}
	public void scrollPage() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
}
