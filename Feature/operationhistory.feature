Feature: In order to check my operations 
	As a bank client 
    I want to see the history (operation, date, amount, balance) of my operations

Scenario: A client gets operations of his account 
	Given a client "ClientA" with "0"  EUR in his account with no transaction 
	When he gets history of all operations
	Then transacations list should be empty 
	
	
Scenario: A client gets operations of his account 
	Given a client "ClientA" with "0"  EUR makes a deposit transaction of "60" EUR 
	And a deposit opeation of "40" EUR 
	And a withdrawal opeation of "20" EUR 
	And a withdrawal opeation of "30" EUR 
	When he gets history of all operations
	Then opeations list should be 4 
	And opeations list should contains 
	  	| DEPOSIT  | 60 | 60  |
		| DEPOSIT  | 40 | 100 |
        | WITHDRAW | 20 | 80  |
        | WITHDRAW | 30 | 50  |