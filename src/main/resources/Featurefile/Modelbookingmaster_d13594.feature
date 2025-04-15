Feature: Model Booking Statement13594
 

 
@13594
Scenario Outline: create report for Branch 13594
    And user logging in using username "<username>" and password "<password>"
    Then user must click the branch
    Then users selects the branch as 13594 generate the report
Examples:
| username      | password |
| username7     | password7|

@13594
Scenario Outline: create report for Branch A13594
    And user logging in using username "<username>" and password "<password>"
    Then user must click the branch
    And I clicking the branch as A13594 make the report
Examples:
| username      | password |
| username7     | password7|

@13594
Scenario Outline: create report for Branch B13594
    And user logging in using username "<username>" and password "<password>"
    Then user must click the branch
    Then customer clicks the branch as B13594 get the report
Examples:
| username      | password |
| username7     | password7|