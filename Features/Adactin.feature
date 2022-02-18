Feature: Hotel Booking In Adactin Website

Scenario: Login Page

Given user Navigates To The Website "https://adactinhotelapp.com/"
When user Enter Username As "Ahmadullah"
And user Enter Password As "O51L5B"
And user click On "Login" Button
Then login Must Be Successful 
And navigates To Search Hotel Page.
  
Scenario: Search Hotel Page

When user Select The Hotel Location As "Melbourne" 
And user Select The Hotel As "Hotel Sunshine"
And user Select Room Type As "Super Deluxe"
And user Select Number of Rooms "1"
And user Select The Check In Date On "14/03/2022"
And user Select The Check Out Date As "16/03/2022" 
And user Select The Adults Per Room "2"
And also User Select The Childrens per Room "1"
Then user Click On "Search" Button
And navigates To Select Hotel Page.

Scenario: Select Hotel Page

When user Selecting The Hotel by Clicking On "Radio Button"
And  user Clicks On "Continue"
Then navigates To Book A Hotel.

Scenario: Book A Hotel Page

And user Enter First Name As "Ahmadullah"
And user Enter Last Name As "A"
And user Enter Billing Address "i-TechArt, 47 SE. wall street, Brooklyn, New York."
And user Enter Credit Card Number "1234567890123456"
And user Enter Credit Card Type As "Master Card"
And user Enter Expiry Date |Month|July|Year|2023|
And user Enter CVV Number "172"
Then user Click On "Book Now" Button
And navigates to Booking Confirmation Page.

Scenario: Booked Itinerary 

When user Click On "Booked Itinerary"
And navigates to Booked itinerary
And user Checks the Booking confirmation
Then user Click On "Logout" Button
And webpage Redirects To Logged out Successfully. 
