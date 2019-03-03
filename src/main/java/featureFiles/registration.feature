Feature: Amazon New user Registration

Scenario Outline: Amazon new user registration test

Given user is already on Main page
When title of Page is Online shopping site
Then click on Signin button
Then click on the AmazonCreateAccount button
Then user enters "<username>","<phone>","<email>","<password>" and press continue button
And close the browser

Examples:
|username|phone|email|password|
|testuser1|9945344567|testuser1@gmail.com|testr1234|
|testuser2|8844544567|testuser2@gmail.com|test1234|
|testuser3|7744544567|testuser3@gmail.com|test01234|