Feature: In order to retrieve some or all of my savings 
As a bank client 
I want to make a withdrawal from my account

Scenario: A client withdraws money from his account
	Given a client "ClientA" with "100"  EUR in his account
    When he withdraws "10" EUR to his account
    Then his new balance is "90" EUR and amount withdraw is "10"
    
Scenario: A client withdraws money from his account
	Given a client "ClientA" with "-20"  EUR in his account
    When he withdraws "10" EUR to his account
    Then his new balance is "-20" EUR and amount withdraw is "0"
    
Scenario: A client withdraws money from his account
	Given a client "ClientA" with "0.55"  EUR in his account
    When he withdraws "0.2" EUR to his account
    Then his new balance is "0.35" EUR and amount withdraw is "0.2"

Scenario: A client withdraws money from his account
	Given a client "ClientA" with "0"  EUR in his account
    When he withdraws "100" EUR to his account
    Then his new balance is "0" EUR and amount withdraw is "0"