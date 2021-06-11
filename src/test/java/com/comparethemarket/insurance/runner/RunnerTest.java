package com.comparethemarket.insurance.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/quotes.feature"},
		plugin = {"html:target/cucumber-html-report"},
		glue = {"com.comparethemarket.insurance.stepdefinition"},
		
		monochrome=true,
		dryRun=false		
)
public class RunnerTest {

}
