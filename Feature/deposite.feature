Feature: In order to save money 
As a bank client 
I want to make a deposit in my account

Scenario: A client deposites money to his account
	Given a client "ClientA" with "100"  EUR in his account
    When he deposites "10" EUR to his account
    Then his new balance is "110" EUR
    
Scenario: A client deposites money to his account
	Given a client "ClientA" with "-20"  EUR in his account
    When he deposites "100" EUR to his account
    Then his new balance is "80" EUR
    
Scenario: A client deposites money to his account
	Given a client "ClientA" with "0.55"  EUR in his account
    When he deposites "100" EUR to his account
    Then his new balance is "100.55" EUR

Scenario: A client deposites money to his account
	Given a client "ClientA" with "0"  EUR in his account
    When he deposites "100" EUR to his account
    Then his new balance is "100" EUR