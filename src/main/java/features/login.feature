Feature: Login feature 

Scenario: Login Test with valid credential 

	Given user is on login page 
	When user enters "mngr298922" and "yrabaza" 
	Then user clicks on login button 
	And user is on homepage 
	Then close the browser 
	
Scenario Outline: Login Test with invalid credential 

	Given user is on login page 
	When user enters invalid "<username>" and "<password>" 
	Then user clicks on login button 
	Then user should get error message 
	Then close the browser 
	
	Examples: 
		|username|password|
		|mngr298922|yrabaza123|
		
		
		
