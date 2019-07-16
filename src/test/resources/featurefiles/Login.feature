#StoryType=WEB
#Owner=ejagruti
#CreationDate=22nd Mar 2019
#Author=Gaurav

@Login 
Feature: Login feature

Background: User will be on application login page
When user open "Chrome" browser
When user enters url "http://www.gcrit.com/build3/admin/login"
Then user will be on Applications login page

@SmokeTest @EndToEnd
Scenario: Verify login functionality by passing valid credentials
When user enters username as "admin"
When user enters password as "admin@123"
When user clicks on submit button
Then user will be on application's home page
Then close the browser

@EndToEnd
Scenario Outline: Verify login functionality by passing invalid credentials
When user enters username as "<username>"
When user enters password as "<password>"
When user clicks on submit button
Then user will be on application's Login Page With error message " Error: Invalid administrator login attempt."
Then close the browser

Examples: 

|	username |	password 		|
| Admin		 | Admin@123		|
| admin		 | Admin@123		|
|	Admin		 | admin@123		|



