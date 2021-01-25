$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vnarkar/eclipse-workspace/BDDFramework/src/main/java/features/addNewAccountMap.feature");
formatter.feature({
  "line": 1,
  "name": "New Account",
  "description": "",
  "id": "new-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add new Account Test",
  "description": "",
  "id": "new-account;add-new-account-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "mngr302559",
        "Umevuqe"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User is on New Add new account page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enters Customerid and Accounttype and Initialdeposit",
  "rows": [
    {
      "cells": [
        "Customerid",
        "Accounttype",
        "Initialdeposit"
      ],
      "line": 15
    },
    {
      "cells": [
        "12417",
        "Savings",
        "100000"
      ],
      "line": 16
    },
    {
      "cells": [
        "12417",
        "Current",
        "100111"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Clicks on Account Submit",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user gets Account success message",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User exit",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_on_login_page()"
});
formatter.result({
  "duration": 16828265200,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1759087200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4176861400,
  "status": "passed"
});
formatter.match({
  "location": "addNewCustomerStepDefinition.user_is_on_Homepage()"
});
formatter.result({
  "duration": 491497300,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.user_clicks_on_New_Account()"
});
formatter.result({
  "duration": 2423468300,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.user_is_on_New_Add_new_account_page()"
});
formatter.result({
  "duration": 268057200,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.user_enters_and_and(DataTable)"
});
formatter.result({
  "duration": 13163441800,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.Clicks_on_Account_Submit()"
});
formatter.result({
  "duration": 85400,
  "status": "passed"
});
formatter.match({
  "location": "addNewAccountStepDefinitionMap.user_gets_Account_success_message()"
});
formatter.result({
  "duration": 191800,
  "status": "passed"
});
formatter.match({
  "location": "addNewCustomerStepDefinition.User_exit()"
});
formatter.result({
  "duration": 1903085100,
  "status": "passed"
});
});