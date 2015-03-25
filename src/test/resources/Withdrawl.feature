Feature: ATM Withdrawl

@Runme
Scenario: Successful withdrawl from account via ATM
	Given I have $100 in my checking account
	When I request $20 from my checking account
	Then $20 should be dispensed from the ATM