package com.comparethemarket.insurance.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.comparethemarket.insurance.pages.demographics.DateOfBirthpage;
import com.comparethemarket.insurance.pages.demographics.NamePage;
import com.comparethemarket.insurance.pages.home.HomePage;
import com.comparethemarket.insurance.pages.home.SmokevalidationPage;
import com.comparethemarket.insurance.pages.quote.CoverPeriodPage;
import com.comparethemarket.insurance.pages.quote.LevelTermPage;
import com.comparethemarket.insurance.pages.terms.TermsandConditions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsuranceQuoteStepDefinition extends SetUp {

	@Given("^I access the Comparethemarket url \"([^\"]*)\"$")
	public void i_access_the_comparethemarket_url_something(String applicationUrl) throws Throwable {
		driver.get(applicationUrl);
	    String expTitle = driver.getTitle();
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_something_button(String strArg1) throws Throwable {
		HomePage l = new HomePage(driver);
		l.getQuoteclick();
	}

	@When("^I enter the following details$")
	public void i_enter_the_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		String name = obj.get(0).get(0);
		String[] namearray = name.split("");
/*
		NamePage n = new NamePage();
		n.mrTitleSelect();
		n.firstName(namearray[1]);
		n.surName(namearray[2]);
		String Dob = obj.get(0).get(1);
		String[] dobarray = Dob.split("");
		DateOfBirthpage d = new DateOfBirthpage();
		d.datepicker(dobarray[0]);
		d.monthpicker(dobarray[1]);
		d.yearpicker(dobarray[2]);
		SmokevalidationPage s = new SmokevalidationPage(driver);
		s.nonSmokingPersonSelection();
		LevelTermPage l = new LevelTermPage(driver);
		l.levelTermselection().click();
		String time = obj.get(0).get(2);
		String[] timearray = time.split("");
		CoverPeriodPage c = new CoverPeriodPage();
		c.coverperioddata(timearray[0]); */
		/*
		 * MinAmountCover m = new MinAmountCover(driver); String amount =
		 * obj.get(0).get(3); m.minAmountcover(amount); CriticalIllness ci = new
		 * CriticalIllness(driver); ci.criticalillnessselection().click();
		 * ci.additionalAmount().click(); String addAmount = obj.get(0).get(4);
		 * ci.additionalAmount().sendKeys(addAmount); EmailandPhoneNumber e = new
		 * EmailandPhoneNumber(driver); String Eid = obj.get(0).get(5); String Phno =
		 * obj.get(0).get(5); e.emailId(Eid); e.phoneNumber(Phno); Address a = new
		 * Address(driver); String addresswithpostalcode = obj.get(0).get(6); String[]
		 * addressarray = addresswithpostalcode.split(",");
		 * a.adresssOption(addresswithpostalcode); a.postalCode(addressarray[2]);
		 * a.findMyAddress(); a.addressSelection(); ContactType ct = new
		 * ContactType(driver); ct.donotContact().click(); TermsandConditions tc = new
		 * TermsandConditions(driver); tc.confirmDetails(); tc.getTheQuotes();
		 */

	}

	@Then("^User registration form should be displayed$")
	public void user_registration_form_should_be_displayed() throws Throwable {

	}

	@Then("^I landed on the enquiry page with summery of key details and Insurance quotes$")
	public void i_landed_on_the_enquiry_page_with_summery_of_key_details_and_insurance_quotes() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Summary of key details']")));

	}

	@Then("^validate error message is displaying or not$")
	public void validate_error_message_is_displaying_or_not() throws Throwable {

	}

	@And("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the_something(String strArg1) throws Throwable {

	}

	@And("^I click on \"([^\"]*)\" link redirected to user registration form $")
	public void i_click_on_something_link_redirected_to_user_registration_form(String strArg1) throws Throwable {
		// driver.findElement(By.)
	}

}
