Feature: Compare the market site validation for getting the relevant quotes 
	This feature demonstrates how to validate the user details 
   For every valid user information,user will be successfully gets the insurance quotes
   For every invalid information, user will be displayed with error message 
   
Scenario: user enters valid information successfully gets the insurence quotes 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button 
	Then User journey form should be displayed 
	When I click on quoteType "just myself"
	And I enter the name as "Mr" , "Insurance" , "Quote" 
	And I enter date of birth as  "6" , "January" , "1980"
	And I enter smoker selection as "No"
    And I enter term as "LevelTerm"
    And I enter coverperiod as "20"
	And I enter minimum amount as "25,000"
	And I enter criticalIllness as "yes"
	And I selected "Additional" cover
	And I enter additionalamount "15,000"
	And I enter email as "widecem309@mailreds.com"
	And I enter phonenumber as "07812120038"
	And I enter address as
    |7 Brunswick Street, Reading, RG1 6NY, United Kingdom|
	And I enter contacttype as Do not contact
	And I confirm the termsandconditions
	And I click on the Get your quotes
	Then I should land on quotes summary page
	Then I click on "Your details" link 
	And I redirected to user journey form 
