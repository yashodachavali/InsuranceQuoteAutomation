package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.comparethemarket.insurance.common.BasePage;

public class DateOfBirthpage extends BasePage {

	public DateOfBirthpage(WebDriver driver) {
		super(driver);
	}

	private By day = By.id("YourDateOfBirth_Day");
	private By month = By.id("YourDateOfBirth_Month");
	private By year = By.id("YourDateOfBirth_Year");

	public void datepicker(String value) {
		WebElement daydropdown = driver.findElement(day);
		Select dropdown = new Select(daydropdown);
		dropdown.selectByVisibleText(value);
	}

	public void monthpicker(String value1) {
		WebElement monthdropdown = driver.findElement(month);
		Select dropdown = new Select(monthdropdown);
		dropdown.selectByVisibleText(value1);

	}

	public void yearpicker(String value2) {
		WebElement yeardropdown = driver.findElement(year);
		Select dropdown = new Select(yeardropdown);
		dropdown.selectByVisibleText(value2);

	}

}
