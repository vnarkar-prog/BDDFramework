Feature: New Customer 

Scenario Outline: Add new Customer Test 

	Given user is on login page 
	When user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on Homepage 
	Then user clicks on New Customer 
	Then User is on New Customer page 
	Then User enters "<CustomerName>" and  "<Gender>" and "<DateofBirth>" and "<Address>" and "<City>" and "<State>" and "<PIN>" and "<MobileNumber>" and "<Email>" and "<Password>" 
	And Clicks on Account Submit 
	Then user gets success message 
	And User exit
	
	
	
	Examples: 
		|username|password|CustomerName|Gender|DateofBirth|Address|City|State|PIN|MobileNumber|Email|Password|
		|mngr302559|Umevuqe|Marqabaqq|M|20051992|Fremont3|California|United States|1264533|9898982222|Marq5.m@gmail.com|abc1231|
		|mngr302559|Umevuqe|Marqnnsqq|M|20051992|Fremont4|California|United States|1284534|9898988221|Marq6.m@gmail.com|abc1232|
		
		