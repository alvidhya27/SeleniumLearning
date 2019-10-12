Feature: Create Lead
Background:
Given Open the Chrome browser
And Maximize the browser
And Launch the URL

Scenario Outline: TC001_CreateLead Login and Create
Given Enter the UserName as <Username> 
And Enter the Password as <Password>
When Click on the Login 
Then Login Poistive result 
Given Click on CRM/SFA Link
And Click On CreateLead 
And Enter the FirstName as <FirstName>   
And Enter the LastName as <LastName>
And Enter the CompanyName as <CompanyName>  
When Click on CreateLead
Then CreateLead positive Result  

Examples:
|Username|Password|FirstName|LastName|CompanyName|
|Democsr|cramsfa|Vidhya|Alagappan|Tvsnext|
|Democsr| crmsfa|Neela|Alagappan|Astrazenaca|


Scenario Outline: TC002_CreateLead Login and Create
Given Enter the UserName as Demosalesmanager 
And Enter the Password as crmsfa
When Click on the Login 
Then Login Poistive result 
Given Click on CRM/SFA Link 
And Click On CreateLead 
And Enter the FirstName as <FirstName> 
And Enter the LastName as <LastName>
And Enter the CompanyName as <CompanyName>
When Click on CreateLead
But CreateLead Negative Result 



Examples:
|Username|Password|FirstName|LastName|CompanyName|
|Democsr|cramsfa|Vidhya|Alagappan|Tvsnext|
|Democsr| crmsfa|Neela|Alagappan|Astrazenaca|


