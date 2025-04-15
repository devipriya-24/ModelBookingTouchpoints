Feature: Model Booking Statement13719
 

 
@13719
Scenario Outline: create report for Branch 13719
    And user entered username "<username>" and password "<password>"
    Then user select the branch
    Then user entered the branch as13719 and makes the report
Examples:
| username      | password   |
| username10    | password10 |
