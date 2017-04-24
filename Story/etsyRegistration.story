Narrative:
As a new Customer I want to validate the registrtaion screen with different set of values in ETSY website
					 
Scenario:  Validating the etsy registration with out mandatory fields
Given launch etsy website
When on screen load of etsy, Verify the option to register
Then Click Register link
Then Verify registration screen with all labels
When User register without Mandatory fields  
Then Verify the error messages

			
Scenario:  Validating the etsy registration with invalid email Ids
Given Login to website
When on screen load of etsy, Verify the option to register
Then Click Register link
Then Verify registration screen with all labels
When User register with invalid emailID $FName$LName$Email$PWD$ConfirmPWD$UserName
Then Verify the error messages

Examples:
|FName|LName|Email   |PWD |ConfirmPWD|UserName|
|XXX  |YYY  |xyz.com |****|****		 |XXYY	  |				


Scenario:  Validating the etsy registration with invalid email Ids
Given Login to website
When on screen load of etsy, Verify the option to register
Then Click Register link
Then Verify registration screen with all labels
When User register with password mismatch $FName$LName$Email$PWD$ConfirmPWD$UserName
Then Verify the error messages

Examples:
|FName|LName|Email   |PWD |ConfirmPWD|UserName|
|XXX  |YYY  |xyz.com |****|****      |XXYY    |			

Scenario:  Validating the etsy registration with valid details
Given Login to website
When on screen load of etsy, Verify the option to register
Then Click Register link
Then Verify registration screen with all labels
When User register with valid emailID $FName$LName$Email$PWD$ConfirmPWD$UserName
Then Verify the registration success

Examples:
|FName|LName|Email         |PWD |ConfirmPWD|UserName|
|XXX  |YYY  |xyz@gmail.com |****|****      |XXYY    |			
