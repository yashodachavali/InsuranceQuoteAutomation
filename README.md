## InsuranceQuote-SeleniumAtomation

### Overview
This project contains automation test for life insurance quote web application

### BDD tests

#### Build
Clone the project form below repository:

``https://github.com/yashodachavali/InsuranceQuoteAutomation.git```
Run the below command to build and download the dependencies required for the project
`mvn clean`
Note: Ensure Maven and Java are configured in local environmental variables 

#### Pre-Requisite
Project is developed with windows chrome (91 version) driver exe file (refer to `/test/resources/driver/chromedriver.exe`),
and this path is setup in `/test/resources/TestData.properties` file under `chrome.driver.path` property.
```Note: please change `chrome.driver.path` to `/test/resources/driver/chromedriver` ```

#### Test
Once the build is successful, run the tests using below command,
`mvn clean test`
```Note: By default two scenarios would be picked up for execution```

#### Reports
Please check `target/cucmber-html-report` file to check the reports
