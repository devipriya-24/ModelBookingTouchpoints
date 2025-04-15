Feature: Model Booking Statement13190
 

 
@13190
Scenario Outline: create report for Branch 13190
    And user enters username "<username>" and password "<password>"
    Then users click the branch
    Then user choose the branch as13190 make the report
Examples:
| username      | password |
| username4     | password4|

@13190
Scenario Outline: create report for Branch 13190BRN11
    And user enters username "<username>" and password "<password>"
    Then users click the branch
    Then user choose the branch as13190 BRN11 make the report
Examples:
| username      | password  |
| username4     | password4 |