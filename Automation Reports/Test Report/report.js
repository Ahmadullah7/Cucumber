$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automation.feature");
formatter.feature({
  "line": 1,
  "name": "Purchasing Clothes In Automation Website",
  "description": "",
  "id": "purchasing-clothes-in-automation-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Navigates To Automation Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Clicks Signin Button And Navigates To Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"\u003cUsername\u003e\" And Password As \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Home Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "purchasing-clothes-in-automation-website;login-page;;1"
    },
    {
      "cells": [
        "Ahmadullah",
        "Ahmad@96"
      ],
      "line": 12,
      "id": "purchasing-clothes-in-automation-website;login-page;;2"
    },
    {
      "cells": [
        "seleniumautomationproject@gmail.com",
        "Ahmad@96"
      ],
      "line": 13,
      "id": "purchasing-clothes-in-automation-website;login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13644800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Page",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Navigates To Automation Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Clicks Signin Button And Navigates To Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"Ahmadullah\" And Password As \"Ahmad@96\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Navigates_To_Automation_Website()"
});
formatter.result({
  "duration": 17068636700,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Signin_Button_And_Naavigates_To_Login_Page()"
});
formatter.result({
  "duration": 12352064000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ahmadullah",
      "offset": 25
    },
    {
      "val": "Ahmad@96",
      "offset": 54
    }
  ],
  "location": "Automation_StepDefinitions.user_Enters_Username_As_And_Password_As(String,String)"
});
formatter.result({
  "duration": 2878356600,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Login_Button_And_Navigates_To_Home_Page()"
});
formatter.result({
  "duration": 8582431200,
  "status": "passed"
});
formatter.after({
  "duration": 296700,
  "status": "passed"
});
formatter.before({
  "duration": 212600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Page",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Navigates To Automation Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Clicks Signin Button And Navigates To Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enters Username As \"seleniumautomationproject@gmail.com\" And Password As \"Ahmad@96\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks Login Button And Navigates To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Navigates_To_Automation_Website()"
});
formatter.result({
  "duration": 10546013700,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Signin_Button_And_Naavigates_To_Login_Page()"
});
formatter.result({
  "duration": 17017260600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "seleniumautomationproject@gmail.com",
      "offset": 25
    },
    {
      "val": "Ahmad@96",
      "offset": 79
    }
  ],
  "location": "Automation_StepDefinitions.user_Enters_Username_As_And_Password_As(String,String)"
});
formatter.result({
  "duration": 759979300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Login_Button_And_Navigates_To_Home_Page()"
});
formatter.result({
  "duration": 15618108700,
  "status": "passed"
});
formatter.after({
  "duration": 136200,
  "status": "passed"
});
formatter.before({
  "duration": 229600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Home Page",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user Clicks T-Shirts Session And Navigates To T-Shirts Webpage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Clicks Quick View To Preview",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click On Add To Cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click On Proceed To Checkout And Navigates To Shopping Cart - Summary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_T_Shirts_Session_And_Navigates_To_T_Shirts_Webpage()"
});
formatter.result({
  "duration": 4099094200,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Quick_View_To_Preview()"
});
formatter.result({
  "duration": 745492900,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_Add_To_Cart()"
});
formatter.result({
  "duration": 4478560100,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_Proceed_To_Checkout_And_Navigates_To_Shopping_Cart_Summary_Page()"
});
formatter.result({
  "duration": 11639758600,
  "status": "passed"
});
formatter.after({
  "duration": 187400,
  "status": "passed"
});
formatter.before({
  "duration": 176900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Shopping Cart - Summary",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;shopping-cart---summary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user Clicks Proceed To Checkout And Navigates to Addresses Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Proceed_To_Checkout_And_Navigates_to_Addresses_Page()"
});
formatter.result({
  "duration": 4652107000,
  "status": "passed"
});
formatter.after({
  "duration": 247900,
  "status": "passed"
});
formatter.before({
  "duration": 2713500,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Addresses",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;addresses",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user Clicks Proceed To Checkout And Navigates to Shipping Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Proceed_To_Checkout_And_Navigates_to_Shipping_Page()"
});
formatter.result({
  "duration": 2889051400,
  "status": "passed"
});
formatter.after({
  "duration": 201900,
  "status": "passed"
});
formatter.before({
  "duration": 302600,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Shipping",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;shipping",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user Click On Term Of Service Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Clicks Proceed To Checkout And Navigates to Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_Term_Of_Service_Checkbox()"
});
formatter.result({
  "duration": 203754600,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Proceed_To_Checkout_And_Navigates_to_Payment_Page()"
});
formatter.result({
  "duration": 3067138300,
  "status": "passed"
});
formatter.after({
  "duration": 234000,
  "status": "passed"
});
formatter.before({
  "duration": 315800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Payment",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "user Selects Payment Method By Clicking On It And Navigates To Order Summary",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user Click On I Confirm My Order And Webpage Redirect To Order Complete Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Selects_Payment_Method_By_Clicking_On_It_And_Navigates_To_Order_Summary()"
});
formatter.result({
  "duration": 2059545000,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_I_Confirm_My_Order_And_Webpage_Redirect_To_Order_Complete_Page()"
});
formatter.result({
  "duration": 4300433900,
  "status": "passed"
});
formatter.after({
  "duration": 368000,
  "status": "passed"
});
formatter.before({
  "duration": 468800,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "My Account",
  "description": "",
  "id": "purchasing-clothes-in-automation-website;my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user Click On Username And Webpage Navigates To My Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "user Click On Order History And Details And Webpage Navigates To The Order History",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Clicks Signout And Webpage Redirects To Logged Out Successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_Username_And_Webpage_Navigates_To_My_Account_Page()"
});
formatter.result({
  "duration": 1409863100,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Click_On_Order_History_And_Details_And_Webpage_Navigates_To_The_Order_History()"
});
formatter.result({
  "duration": 4348740900,
  "status": "passed"
});
formatter.match({
  "location": "Automation_StepDefinitions.user_Clicks_Signout_And_Webpage_Redirects_To_Logged_Out_Successfully()"
});
formatter.result({
  "duration": 4054344700,
  "status": "passed"
});
formatter.after({
  "duration": 208300,
  "status": "passed"
});
});