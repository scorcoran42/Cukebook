Feature: ATM Withdrawl

@Runme
Scenario: Withdrawl from account via ATM
	Given My account has been credited with $100.00
	When I withdraw $20
	Then $20 should be dispensed
	And the balance of my account should be $80.00
	
@Runme
Scenario: Withdrawl from account via ATM
	Given My account has been credited with $100.00
	When I withdraw $200
	Then $0 should be dispensed
	And the balance of my account should be $100.00
	
