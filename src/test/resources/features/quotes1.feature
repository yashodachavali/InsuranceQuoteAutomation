Feature: Compare the market site validation for getting the relevant quotes 
	This feature demonstrates how to validate the user details 
   For every valid user information,user will be successfully gets the insurance quotes
   For every invalid information, user will be displayed with error message 
   
Scenario: user enters valid information successfully gets the insurence quotes 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button 
	Then User registration form should be displayed 
	When I enter the following details 
		|Mr Insurance Quote|06 January 1980|20 years|£250,000|£15,000|widecem309@mailreds.com|07812120038|7 Brunswick Street, Reading, RG1 6NY, United Kingdom|
	And I click on the "Get your quotes" 
	Then I landed on the enquiry page with summery of key details and Insurance quotes 
	And I click on "Your details" link redirected to user registration form 
	
	
Scenario Outline: 
	validate user is not move further when incorrect information is provided 
	Given I access the Comparethemarket url "https://www.comparethemarket.com/life-insurance" 
	When I click on "Get a quote" button 
	Then User registration form should be displayed 
	When I enter <quote type>,<name>,<dateofbirth>,<smoky>,<term>,<coveryears>,<minamount>,<criticalIllnees>,<addamount>,<email>,<phonenumber>,<addresss>,<contacttype>,<confirm> 
	Then error message should be displayed 
	
	Examples: 
		|quote type  |name|dateofbirth    |smoky|term|coveryears|minamount|criticalIllnees|addamount|email|phonenumber|addresss|contacttype|confirm|
		|Single quote|    |06 January 1980|no|level||20 years|£250,000|yes|£15,000|widecem309@mailreds.com|07812 120038|7 Brunswick Street, Reading, RG1 6NY, United Kingdom|Do not contact|
		|Single quote|Mr Insurance Quote|06 January 1980|No|Level term |20 years|£250,000|yes|£15,000|widecem309@mailreds.com|DF83UFJ|7 Brunswick Street, Reading, RG1 6NY, United Kingdom|Do not contact|