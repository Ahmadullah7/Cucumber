Feature: Purchasing Clothes In Automation Website 

Scenario Outline: Login Page

Given user Navigates To Automation Website
When user Clicks Signin Button And Navigates To Login Page
And user Enters Username As "<Username>" And Password As "<Password>"
Then user Clicks Login Button And Navigates To Home Page

Examples:
|Username|Password|
|Ahmadullah|Ahmad@96|
|seleniumautomationproject@gmail.com|Ahmad@96|

Scenario: Home Page

When user Clicks T-Shirts Session And Navigates To T-Shirts Webpage
And user Clicks Quick View To Preview
And user Click On Add To Cart 
Then user Click On Proceed To Checkout And Navigates To Shopping Cart - Summary Page

Scenario: Shopping Cart - Summary

Then user Clicks Proceed To Checkout And Navigates to Addresses Page

Scenario: Addresses

Then user Clicks Proceed To Checkout And Navigates to Shipping Page

Scenario: Shipping

When user Click On Term Of Service Checkbox  
Then user Clicks Proceed To Checkout And Navigates to Payment Page

Scenario: Payment

When user Selects Payment Method By Clicking On It And Navigates To Order Summary
Then user Click On I Confirm My Order And Webpage Redirect To Order Complete Page

Scenario: My Account

When user Click On Username And Webpage Navigates To My Account Page
And user Click On Order History And Details And Webpage Navigates To The Order History 
Then user Clicks Signout And Webpage Redirects To Logged Out Successfully.