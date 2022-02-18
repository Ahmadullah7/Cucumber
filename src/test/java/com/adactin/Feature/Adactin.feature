Feature: Hotel Booking In Adactin Website

@A1
Scenario Outline: Login Page

Given user Navigates To The Adactin Website
When user Enters Username As "<Username>" And Password As "<Password>"
Then user Clicks Login Button And Navigates To Search Hotel Page

Examples: 
|Username|Password|
|Aisha|O51L5B|
|Ahmadullah|O51L5B|

@A1
Scenario: Search Hotel Page

When user Select The Hotel Location
And user Select Hotel
And user Select Room Type
And user Select Number Of Rooms
And user Select The Check In And Check Out Date
And user Select The Adults Per Room And The Childrens Per Room
Then user Clicks Search Button And Navigates To Select Hotel Page

@A1
Scenario: Select Hotel Page

When user Select The Hotel
Then user Clicks Continue And Navigates To Book A Hotel Page

@A1
Scenario: Book A Hotel Page

When user Enters First Name And Last Name
And user Enters Billing Address
And user Enters Credit Card Number
And user Enters Credit Card Type
And user Enters Expiry Date
And user Enters CVV Number
Then user Clicks Book Now Button And Navigates To Booking Confirmation Page

@A2
Scenario: Booking Confirmation Page

When user Click On Booked Itinerary And Navigates To Booked Itinerary Page
Then user Clicks Logout Button And Webpage Redirects To Logged Out Successfully. 
