Feature: Model Booking Statement Automation

 
@13184
Scenario Outline: Generate report for Branch 13184
    And I log in using username "<username>" and password "<password>"
    Then I should click the branch
    Then user select the branch as 13184 generate the report
Examples:
| username     | password |
| username1 | password1  |

@13184
Scenario Outline: Generate report for Branch A13184
     And I log in using username "<username>" and password "<password>"
    Then I should click the branch
    Then user select the branch as A13184 generate the report
Examples:
| username     | password |
| username1 | password1  |

@13184
Scenario Outline: Generate report for Branch B13184
   And I log in using username "<username>" and password "<password>"
    Then I should click the branch
  Then user select the branch as B13184 generate the report
Examples:
| username     | password |
| username1 | password1  |


@13184
Scenario Outline: Generate report for Branch C13184
   And I log in using username "<username>" and password "<password>"
    Then I should click the branch
  Then user select the branch as C13184 generate the report
Examples:
| username     | password |
| username1 | password1  |

    
    