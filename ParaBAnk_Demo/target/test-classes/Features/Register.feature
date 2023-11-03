Feature: Register to Parabank demo application

Scenario: Register the application using valid credentials
Given User is on register page 
When User enters valid credentials for register the application
And User Clicks the Register 
Then User logged out the application successfully
