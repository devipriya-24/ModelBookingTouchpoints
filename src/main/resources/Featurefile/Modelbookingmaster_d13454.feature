Feature: Model Booking Statement13454
 

 
@13454
Scenario Outline: create report for Branch 13454
    And user enters13188 username "<username>" and password "<password>"
    Then user clicking the13454 branch
    Then user choosing the branch as13454 makes the report
Examples:
| username      | password |
|username8      | password8|
