Feature: Model Booking Statement Automation
 

 
@13186
Scenario Outline: create report for Branch 13186
    And users log in using username "<username>" and password "<password>"
    Then users should click the branch
    Then user select the branch as 13186 create the report
Examples:
| username      | password |
| username3     | password3  |