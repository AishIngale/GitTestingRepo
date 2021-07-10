Feature: Online Assignments

Scenario: Automate first Menu link of amazon.in and print page title
	Given amazon.in URL is given
	When User clicks on the first menu link and tries to print page title
	Then Page title is printed
	
Scenario: Automate all the Menu links of techlistic.com
	Given techlistic.com URL is given
	When User validates all menu links and page titles of techlistic.com
	Then All page titles are validated
	
Scenario: Automate all the Menu links of amazon.in and Verify page titles
	Given amazon.in URL is given
	When User validates all menu links and page titles of amazon.com
	Then All page titles are validated