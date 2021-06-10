package com.comparethemarket.insurance.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StepDefinition {
	SetUp setUp = new SetUp();
	WebDriver driver;
	
	@Before
	public void setUpDriver() {		
		Properties prop = null;
		try {
			InputStream input = new FileInputStream("./src/test/resources/TestData.properties");
			prop = new Properties();
			prop.load(input);
        } catch (IOException io) {
            io.printStackTrace();
        }
		TestUtils testUtils = new TestUtils(prop);
		driver = testUtils.invokeDriver();
		setUp.setDriver(driver);
	}
	
	@After
	public void close() {
		driver.quit();
	}
}
