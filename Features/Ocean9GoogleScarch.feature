Feature: google search

Scenario Outline: simple search

Given i am on google home page
When i enter search "<term>"
When i click on google search button 
Then i receive related search result 

Examples:
|term              |
|quality Assurance |
|software Testing  |