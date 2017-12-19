Feature: Flipkart automation
	Description: This feature will test a LogIn and search functionality

@login
Scenario: Login Functionality 
	Given user navigates to https://www.flipkart.com/		
	When User enters "username" and "password" to LogIn 
	And user logins into the site									  		
	

@search
Scenario: Search functionality
Given User enters the product name to be search and add it to cart	

