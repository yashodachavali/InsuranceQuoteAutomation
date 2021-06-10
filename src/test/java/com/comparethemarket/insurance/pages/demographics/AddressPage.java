package com.comparethemarket.insurance.pages.demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.comparethemarket.insurance.common.BasePage;

public class AddressPage extends BasePage {

	public AddressPage(WebDriver driver) {
		super(driver);
	}

	private By address = By.id("LifeInsurance_Address_Address_HouseNumberOrName");
	private By postcode = By.id("LifeInsurance_Address_Address_Postcode");
	private By findAddress = By.id("Address_FindMyAddress");
	private By addressSelect = By.id("LifeInsurance_Address_Address_SelectAddress");

	public void adresssOption(String value) {
		driver.findElement(address).sendKeys(value);
	}

	public void postalCode(String value1) {
		driver.findElement(postcode).sendKeys(value1);
	}

	public void findMyAddress() {
		driver.findElement(findAddress).click();
	}

	public void addressSelection() {
		WebElement newdropdown = driver.findElement(addressSelect);
		Select dropdown = new Select(newdropdown);
		dropdown.selectByVisibleText("7 Brunswick Street, Reading, RG1 6NY");
	}
}
