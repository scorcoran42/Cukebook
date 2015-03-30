Feature: ATM Withdrawl

@Runme
Scenario Outline: Withdrawl from account via ATM
	Given I have $<Balance> in my <AcctType> account
	When I request $<CashRequest> from my <AcctType> account
	Then $<Dispensed> should be dispensed from the ATM
	
Scenarios:
|Balance|AcctType|CashRequest|Dispensed|
|100    |checking|20         |20       |
|100    |checking|100        |100      |
|100    |savings |101        |0        |
