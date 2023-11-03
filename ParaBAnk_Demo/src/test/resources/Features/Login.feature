Feature: Login to the parabank application

Background: Given User is on login page 

@ValidCredentials
Scenario Outline: Login to the application using valid credentials
When User enters the valid username "<username>"
And User enters the valid password "<password>"
Then User logged in to the application successfully

@InvalidCredentials
Scenario Outline: Login to the demo application with invalid credentials
When User pass the invalid username to the field "<username>"
And User pass the invalid password to the field "<password>"
Then User receive a error message with invalid credentials

Examples:
		|	username		|	password			|
		|	SaniaMirza	|	SaniaMirza123	|
		|	abfewh			|	hgjhgd				|