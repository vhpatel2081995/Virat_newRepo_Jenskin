@TechfiosNewAccountFeature  @Regression
Feature: Techfios Other billing login page functionality validation

Background: 
    Given User is on the techfios login page
    
    
@Scenario @Smoke
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	
	When User enters the "<username>" in the "username" field
	When User enters the "<password>" in the "password" field
	And User clicks on "login"
	Then User should land on Dashboard page 
	And User clicks on "bankCash"
	And User clicks on "newAccount"
	And User enters "<accountTitle>" in the "accountTitle" field in accounts page 
	And User enters "<description>" in the "description" field in accounts page 
	And User enters "<initialBalance>" in the "initialBalance" field in accounts page  
	And User enters "<accountNumber>" in the "accountNumber" field in accounts page 
	And User enters "<contactPerson>" in the "contactPerson" field in accounts page 
	And User enters "<Phone>" in the "Phone" field in accounts page   
	And User enters "<internetBankingURL>" in the "internetBankingURL" field in accounts page  
	And User clicks on "submit"
	Then User should be able to validate account created successfully


    Examples: 
    |username         |password|accountTitle|description|initialBalance|accountNumber|contactPerson    |Phone   |internetBankingURL |
    |demo@techfios.com|abc123  |cucumber tab|Bank bal   |1001          |234123       |Viru             |6453245 | www.bhaisab       |
    |demo@techfios.com|abc123  |Sensex      |GIC Bal    |1003          |1234432      |bhaiV            |4322346 | billing.com       |
 
 
    
