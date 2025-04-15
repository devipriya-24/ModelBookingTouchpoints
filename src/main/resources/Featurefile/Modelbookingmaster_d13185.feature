
 Feature: Model Booking Statement Automation
 

 
@13185
Scenario Outline: create report for Branch 13185
    And user log in using username "<username>" and password "<password>"
    Then user should click the branch
    Then users select the branch as 13185 generate the report
Examples:
| username      | password |
|  username2 | password2  |

@13185
Scenario Outline: create report for Branch A13185
     And user log in using username "<username>" and password "<password>"
    Then user should click the branch
    Then users select the branch as A 13185 click the report
Examples:
| username     | password |
|  username2 | password2  |

@13185
Scenario Outline: create report for Branch B13185
   And user log in using username "<username>" and password "<password>"
    Then user should click the branch
  Then users select the branch as B 13185 click the report
Examples:
| username     | password |
|  username2 | password2  |

    
    