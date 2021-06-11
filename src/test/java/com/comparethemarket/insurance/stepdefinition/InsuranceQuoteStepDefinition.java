package com.comparethemarket.insurance.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.comparethemarket.insurance.pages.demographics.AddressPage;
import com.comparethemarket.insurance.pages.demographics.ContactPage;
import com.comparethemarket.insurance.pages.demographics.DateOfBirthpage;
import com.comparethemarket.insurance.pages.demographics.EmailAndPhoneNumberPage;
import com.comparethemarket.insurance.pages.demographics.NamePage;
import com.comparethemarket.insurance.pages.home.HomePage;
import com.comparethemarket.insurance.pages.home.SmokevalidationPage;
import com.comparethemarket.insurance.pages.quote.CoverPeriodPage;
import com.comparethemarket.insurance.pages.quote.CriticalIllnessPage;
import com.comparethemarket.insurance.pages.quote.LevelTermPage;
import com.comparethemarket.insurance.pages.quote.MinAmountCoverPage;
import com.comparethemarket.insurance.pages.quote.QuoteTypePage;
import com.comparethemarket.insurance.pages.terms.GuideandMedicalPage;
import com.comparethemarket.insurance.pages.terms.QuotesSummaryPage;
import com.comparethemarket.insurance.pages.terms.TermsandConditions;
import com.comparethemarket.insurance.util.ScreenShotUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsuranceQuoteStepDefinition extends SetUp {

	private static final String ACTUAL_PAGE_TITLE = "Compare Cheap Life Insurance Quotes from £3.99 | Compare the Market";
	private static final String EMAIL_ERROR_MESSAGE = "Please enter a telephone number which begins with 0 and contains only digits.";
	private HomePage homePage;
	private QuoteTypePage quoteTypePage;
	private NamePage namePage;
	private DateOfBirthpage dateOfBirthPage;
	private SmokevalidationPage smokeValidationPage;
	private CoverPeriodPage coverPeriodPage;
	private LevelTermPage levelTermPage;
	private MinAmountCoverPage minAmountCoverPage;
	private CriticalIllnessPage illNessPage;
	private EmailAndPhoneNumberPage emailAndPhonenumber;
	private AddressPage addressPage;
	private ContactPage contactPage;
	private TermsandConditions termsAndConditionsPage;
	private GuideandMedicalPage guideandMedicalPage;
	private QuotesSummaryPage quoteSummaryPage;

	@Given("I access the Comparethemarket url {string}")
	public void i_access_the_comparethemarket_url_something(String applicationUrl) {
		driver.get(applicationUrl);
		homePage = new HomePage(driver);
		homePage.acceptCookie();
		String expTitle = driver.getTitle();
		assertEquals(expTitle, ACTUAL_PAGE_TITLE);
	}

	@When("I click on {string} button")
	public void i_click_on_getQuote_button(String quoteButtonName) {
		WebElement element = (WebElement) homePage.clickQuoteButton();
		assertEquals(quoteButtonName, element.getText());
		element.click();
	}

	@Then("User journey form should be displayed")
	public void user_registration_form_should_be_displayed() {
		homePage.verifyJourneyPageIsDisplayed();
	}

	@When("I click on quoteType {string}")
	public void i_click_on_quotetype(String strArg1) {
		quoteTypePage = new QuoteTypePage(driver);
		quoteTypePage.clickOnMyselfQuote();
		quoteTypePage.clickOnNextButton();
	}

	@And("I enter the name as {string} , {string} , {string}")
	public void i_enter_the_nameDetails(String hono, String firstName, String lastName) {
		namePage = new NamePage(driver);
		namePage.selectMrTitle();
		namePage.enterFirstName(firstName);
		namePage.enterLastName(lastName);
		namePage.clickOnNextButton();
	}

	@And("I enter date of birth as  {string} , {string} , {string}")
	public void i_enter_dateOfBirth(String date, String month, String year) {
		dateOfBirthPage = new DateOfBirthpage(driver);
		dateOfBirthPage.datepicker(date);
		dateOfBirthPage.monthpicker(month);
		dateOfBirthPage.yearpicker(year);
		dateOfBirthPage.clickOnNextButton();
	}

	@And("I enter smoker selection as {string}")
	public void i_enter_smoker_selection(String smokerselection) {
		smokeValidationPage = new SmokevalidationPage(driver);
		smokeValidationPage.nonSmokingPersonSelection();
		assertEquals(smokerselection, "No");
		smokeValidationPage.clickOnNextButton();
	}

	@And("I enter term as {string}")
	public void i_enter_term(String term) {
		levelTermPage = new LevelTermPage(driver);
		levelTermPage.levelTermselection().click();
		levelTermPage.clickOnNextButton();
	}

	@And("I enter coverperiod as {string}")
	public void i_enter_coverperiod(String coverPeriodvalue) {
		coverPeriodPage = new CoverPeriodPage(driver);
		coverPeriodPage.coverperioddata(coverPeriodvalue);
		coverPeriodPage.clickOnNextButton();
	}

	@And("I enter minimum amount as {string}")
	public void i_enter_minimum_amount(String amount) {
		minAmountCoverPage = new MinAmountCoverPage(driver);
		minAmountCoverPage.minAmountcover(amount);
		minAmountCoverPage.clickOnNextButton();
	}

	@And("I enter criticalIllness as {string}")
	public void i_enter_criticalillness(String option) {
		illNessPage = new CriticalIllnessPage(driver);
		illNessPage.criticalillnessselection().click();
	}

	@And("I selected {string} cover")
	public void i_selected_cover(String coverageType) {
		illNessPage.additionalCover().click();
	}

	@And("I enter additionalamount {string}")
	public void i_enter_additionalamount(String additionalAmount) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		illNessPage.additionalAmount().sendKeys(additionalAmount);
		illNessPage.clickOnNextButton();
	}

	@And("I enter email as {string}")
	public void i_enter_email(String email) {
		emailAndPhonenumber = new EmailAndPhoneNumberPage(driver);
		emailAndPhonenumber.inpuptEmailId(email);
	}

	@And("I enter phonenumber as {string}")
	public void i_enter_phonenumber(String phonenumber) {
		emailAndPhonenumber.inputPhoneNumber(phonenumber);
		emailAndPhonenumber.clickOnNextButton();
	}

	@And("I enter address as")
	public void i_enter_address_as(DataTable data) {
		List<List<String>> obj = data.asLists();
		String addressReading = obj.get(0).get(0);
		String[] addressInDetail = addressReading.split(",");
		addressPage = new AddressPage(driver);
		addressPage.postalCode(addressInDetail[2]);
		addressPage.findMyAddress();
		addressPage.addressSelection();
		addressPage.clickOnNextButton();
	}

	@And("I enter contacttype as Do not contact")
	public void i_enter_contacttype() {
		contactPage = new ContactPage(driver);
		contactPage.donotContact().click();
		contactPage.clickOnNextButton();
		guideandMedicalPage = new GuideandMedicalPage(driver);
		guideandMedicalPage.clickOnNextButton();

	}

	@And("I confirm the termsandconditions")
	public void i_confirm_the_termsandconditions() {
		termsAndConditionsPage = new TermsandConditions(driver);
		termsAndConditionsPage.confirmDetails();
	}

	@And("I click on the Get your quotes")
	public void i_click_on_the_get_your_quotes() {
		termsAndConditionsPage.clickOnQuoteButton();
	}

	@Then("I should land on quotes summary page")
	public void i_should_land_on_quotes_summary_page() throws IOException {
		quoteSummaryPage = new QuotesSummaryPage(driver);
		quoteSummaryPage.getInsuranceQuotes();
		quoteSummaryPage.scrollPage();
		ScreenShotUtil.takeScreenShotAndCopy("quotesSummary", driver);
	}

	@And("I click on {string} link")
	public void i_click_on_link(String string) {
		quoteSummaryPage.getYourDetails();
	}

	@Then("I should redirected to user journey form")
	public void i_should_redirected_to_user_journey_form() {
		homePage.verifyJourneyPageIsDisplayed();
	}

	@Then("I should get error message")
	public void i_should_get_error_message() throws IOException {
		String error = emailAndPhonenumber.getPhoneErrorMessage();
		assertEquals(EMAIL_ERROR_MESSAGE, error);
		ScreenShotUtil.takeScreenShotAndCopy("ErrorMessage", driver);
	}

	@And("I click on next button page should not move ahead")
	public void i_click_on_next_button_page_should_not_move_ahead() {
		emailAndPhonenumber.clickOnNextButton();
		String completeQuestion_Text = emailAndPhonenumber.getCompleteQuestionText();
		assertNotNull(completeQuestion_Text);
		emailAndPhonenumber.viewQuestionClick();
	}

}