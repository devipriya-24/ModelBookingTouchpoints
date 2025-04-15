Feature: Model Booking Statement13185c
 

@13185c
Scenario Outline: create report for Branch13185c
    Given user will logs as "<username>" and password as "<password>"
    Then user choose the name of branch
    Then user scroll the branch as13185c and makes the report
    
Examples:
| username      | password |
| username11 | password11  |
