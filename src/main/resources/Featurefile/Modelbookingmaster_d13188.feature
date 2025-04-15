Feature: Model Booking Statement13188
 

 
@13188
Scenario Outline: create report for Branch 13188
    And user enter13188 username "<username>" and password "<password>"
    Then user clicks the13188 branch
    Then user choose the branch as13188 makes the report
Examples:
| username      | password |
| username6     | password6|
