Feature: Model Booking Statement13191
 

 
@13191
Scenario Outline: create report for Branch 13191
    And user enter username "<username>" and password "<password>"
    Then user clicks the branch
    Then user choose the branch as13191 makes the report
Examples:
| username      | password |
| username5     | password5|
