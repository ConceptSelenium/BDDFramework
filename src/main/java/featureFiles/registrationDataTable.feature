Feature: Amazon New user Registration with Datatable

Scenario: Amazon new user registration test with datatable

Given user is already on Main Amazon page
When title of Page is Online Shopping site
Then click on Signin Button
Then click on the AmazonCreateAccount Button
Then user enters username,phone,email,password and press continue Button
|testuser1|9945344567|testuser1@gmail.com|testr1234|
And close the Browser
