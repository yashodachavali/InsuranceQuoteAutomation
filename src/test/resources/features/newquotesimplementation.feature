Feature: Compare the market site validation for getting the relevant quotes 
	This feature demonstrates how to validate the user details 
   For every valid user information,user will be successfully gets the insurance quotes
   For every invalid information, user will be displayed with error message 
   
Scenario Outline: user enters valid information successfully gets the insurence quotes 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button 
	Then User journey form should be displayed 
	When I click on quoteType "just myself"
	And I enter the name as "<hono>" , "<FirstName>" , "<LastName>" 
	And I enter date of birth as  "<day>" , "<month>" , "<year>"
	And I enter smoker selection as "<selection>"
    And I enter term as "<TermType>"
    And I enter coverperiod as "<period>"
	And I enter minimum amount as "<minimumAmount>"
	And I enter criticalIllness as "yes"
	And I selected "Additionalcover" cover
	And I enter additionalamount "<additionalamount>"
	And I enter email as "<Email>"
	And I enter phonenumber as "<phonenumber>"
	And I enter address as
    |7 Brunswick Street, Reading, RG1 6NY, United Kingdom|
	And I enter contacttype as Do not contact
	And I confirm the termsandconditions
	And I click on the "Get your quotes" 
	Then I landed on the enquiry page with summery of key details and Insurance quotes 
	And I click on "Your details" link 
	Then I redirected to user journey form 
 Examples:
  |hono|FirstName|LastName|day|month  |year|selection|TermType |period|minimumAmount|additionalamount|Email                  |phonenumber|
  |Mr  |Insurance|Quote   |6  |January|1980|No       |Levelterm|20    |25,000       |15,000          |widecem309@mailreds.com|07812120038|
 Scenario Outline: user enters valid information successfully gets the insurence quotes 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button 
	Then User journey form should be displayed 
	When I click on quoteType "just myself"
	And I enter the name as "<hono>" , "<FirstName>" , "<LastName>" 
	And I enter date of birth as  "<day>" , "<month>" , "<year>"
	And I enter smoker selection as "<selection>"
    And I enter term as "<TermType>"
    And I enter coverperiod as "<period>"
	And I enter minimum amount as "<minimumAmount>"
	And I enter criticalIllness as "yes"
	And I selected "Additionalcover" cover
	And I enter additionalamount "<additionalamount>"
	And I enter email as "<Email>"
	And I enter phonenumber as "<phonenumber>"
	Then I should get error message
	And I click on next button page should not move ahead
	
 Examples:
 |hono|FirstName|LastName|day|month  |year|selection|TermType |period|minimumAmount|additionalamount|Email                  |phonenumber|
 |Mr  |Insurance|Quote   |6  |January|1980|No       |Levelterm|20    |25,000       |15,000          |widecem309@mailreds.com|DF83UFJ    |
 
 
 