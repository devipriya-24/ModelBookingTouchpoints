Feature: Model Booking Statement13186c
 

 
@13186c
Scenario Outline: create report for Branch13186c
    When user enter name of user as "<username>" and password as "<password>"
    And user must select the name of branch
    Then user try to scroll the branch as13186c and makes the report
    
Examples:
| username       | password |
| username13      | password13  |