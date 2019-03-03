Feature: Amazon Login feature

Scenario Outline: Amazon login scenario

Given user is already on main page
When title of page is Online shopping site
Then click on sign in button
Then enter "<username>" and click continue
Then enter "<password>" and click login button
And user is on home page
And close browser

Examples:
|       username                 |password|
|conceptseleniumclasses@gmail.com|test1234|
|       testuser@gmail.com       |test3456|
