Feature: New Account 

Scenario: Add new Account Test 

	Given user is on login page 
	When user enters username and password 
		|mngr302559|Umevuqe|
	Then user clicks on login button 
	
	Then user is on Homepage 
	Then user clicks on New Account 
	Then User is on New Add new account page 
	Then User enters Customerid and Accounttype and Initialdeposit 
		|12417|Savings|100000|
	And Clicks on Account Submit 
	Then user gets Account success message 
	And User exit