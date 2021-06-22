## InsuranceQuote-SeleniumAtomation

### Overview
This project contains automation test for life insurance quote web application

### BDD tests

#### Build
Clone the project form below repository:

 * git clone <a>https://github.com/yashodachavali/InsuranceQuoteAutomation.git</a>
 * mvn clean
 
Note: Ensure Maven and Java are configured in local environmental variables 

#### Pre-Requisite
 * Project is developed with windows chrome (91 version) driver exe file (refer to **/test/resources/driver/chromedriver.exe**).
 * chrome driver path is setup in **/test/resources/TestData.properties** file under **chrome.driver.path** property.
 *  Please change **chrome.driver.path** to **/test/resources/drivers/chromedriver** 

#### Test
Once the build is successful, run **mvn clean test** command
	
Note: By default two scenarios would be picked up for execution

#### Screenshots
Please check *\test\resources\screenshots* folder to check screenshots 

#### Reports
Please check *target/cucmber-html-report* file to check the reports
