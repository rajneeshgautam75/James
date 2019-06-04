@Login
Feature: Login into the Amazon Application

Scenario: Login

Given User Selects the Browser, Launches it and Maximises it
When User Navigates to the URL provided
	And User Enters Username, Password and clicks on login
Then User should be Logged in into Zephyr Successfully




#Scenario: Login
#
#Given User Selects the browser, Launches it and Maximises it
#When User Navigates to the UR_L provided 
#	And User Enters Username, Password and clicks on Login
#Then User should be Logged in into zephyr Successfully
