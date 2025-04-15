Feature: Model Booking Statement13952c
 

 
@13952
Scenario Outline: create report for Branch13952
    When user type name of user as "<username>" and password as "<password>"
    And user should select the name of branch
    Then user scroll the branch as13952 and makes the report
    
Examples:
| username      | password |
| username12    | password12|