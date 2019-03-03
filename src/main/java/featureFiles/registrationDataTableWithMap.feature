Feature: Amazon New user Registration with Datatable and Map

Scenario: Amazon new user registration test with datatable Map

Given user is already on Main Amazon Page
When title of Page is Online Shopping Site
Then click on Signin Button link
Then click on the AmazonCreateAccount Button link
Then user enters username,phone,email,password and press continue Button link
|username |phone     |email              |password|
|testuser1|9945344567|testuser1@gmail.com|testr1234|
|testuser2|7788554433|testuser2@gmail.com|testr12345|
And quit the Browser
