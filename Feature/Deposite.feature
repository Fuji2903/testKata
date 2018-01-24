Feature: aze

Scenario: A client deposites 100 to his account
	Given a client with 100 EUR in his account
    When he deposites 10 EUR to his account
    Then his new balance is 110 EUR