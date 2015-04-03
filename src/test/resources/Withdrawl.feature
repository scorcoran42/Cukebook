Feature: ATM Withdrawl

@Runme
Scenario: Withdrawl from account via ATM
	Given I have deposited $100.00 in my account
	When I withdraw $20
	Then $20 should be dispensed
	

