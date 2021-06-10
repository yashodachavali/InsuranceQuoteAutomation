Feature: Compare the market site validation for getting the relevant quotes 
	This feature demonstrates how to validate the user details 
   For every valid user information,user will be successfully gets the insurance quotes
   For every invalid information, user will be displayed with error message 
   
Scenario: user enters valid information successfully gets the insurence quotes 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button