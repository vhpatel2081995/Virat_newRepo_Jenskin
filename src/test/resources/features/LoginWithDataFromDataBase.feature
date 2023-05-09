@TechfiosLoginWithDataFromDataBaseFeature
Feature: Techfios Other billing login page functionality validation by extracting data from september 2022 DB
    
@DBScenario 
Scenario: User should be able to login with valid credentials from DB
	
	Given User is on the techfios login page
	When User enters the "username" from Database
	When User enters the "password" from Database
	And User clicks on "login"
	

