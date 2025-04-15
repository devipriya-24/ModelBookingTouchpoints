Feature: Model Booking Statement13184c
 

 
@13184c
Scenario Outline: create report for Branch 13184c
    Given user enter name "<username>" and pass "<password>"
    Then user select the branch and makes the report

Examples:
| username       | password |
| username9    | password9   |