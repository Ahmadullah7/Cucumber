$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Website",
  "description": "",
  "id": "hotel-booking-in-adactin-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigates To The Adactin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"\u003cUsername\u003e\" And Password As \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-website;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-website;login-page;;1"
    },
    {
      "cells": [
        "Aisha",
        "O51L5B"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-website;login-page;;2"
    },
    {
      "cells": [
        "Ahmadullah",
        "O51L5B"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-website;login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigates To The Adactin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"Aisha\" And Password As \"O51L5B\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Navigates_To_The_Adactin_Website()"
});
formatter.result({
  "duration": 15813888600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aisha",
      "offset": 25
    },
    {
      "val": "O51L5B",
      "offset": 49
    }
  ],
  "location": "Adactin_StepDefinitions.user_Enters_Username_As_And_Password_As(String,String)"
});
formatter.result({
  "duration": 8113549000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Clicks_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4371156300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigates To The Adactin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"Ahmadullah\" And Password As \"O51L5B\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Navigates_To_The_Adactin_Website()"
});
formatter.result({
  "duration": 738598300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ahmadullah",
      "offset": 25
    },
    {
      "val": "O51L5B",
      "offset": 54
    }
  ],
  "location": "Adactin_StepDefinitions.user_Enters_Username_As_And_Password_As(String,String)"
});
formatter.result({
  "duration": 417966400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Clicks_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2607974800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Check In And Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Adults Per Room And The Childrens Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Clicks Search Button And Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_The_Hotel_Location()"
});
formatter.result({
  "duration": 1177512000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_Hotel()"
});
formatter.result({
  "duration": 337986900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_Room_Type()"
});
formatter.result({
  "duration": 264441400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_Number_Of_Rooms()"
});
formatter.result({
  "duration": 272029800,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_The_Check_In_And_Check_Out_Date()"
});
formatter.result({
  "duration": 1082470600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_The_Adults_Per_Room_And_The_Childrens_Per_Room()"
});
formatter.result({
  "duration": 931005200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Clicks_Search_Button_And_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2792642700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Clicks Continue And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 364928500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Clicks_Continue_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1248685900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@A1"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enters First Name And Last Name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enters Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enters Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enters Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enters Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enters CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Clicks Book Now Button And Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_First_Name_And_Last_Name()"
});
formatter.result({
  "duration": 883429700,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_Billing_Address()"
});
formatter.result({
  "duration": 577235400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_Credit_Card_Number()"
});
formatter.result({
  "duration": 398594300,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_Credit_Card_Type()"
});
formatter.result({
  "duration": 310337500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_Expiry_Date()"
});
formatter.result({
  "duration": 477226700,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Enters_CVV_Number()"
});
formatter.result({
  "duration": 141343800,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_StepDefinitions.user_Clicks_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 3165285500,
  "status": "passed"
});
});