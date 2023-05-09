$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/LoginWithDataFromDataBase.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation by extracting data from september 2022 DB",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TechfiosLoginWithDataFromDataBaseFeature"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials from DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TechfiosLoginWithDataFromDataBaseFeature"
    },
    {
      "name": "@DBScenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefination.User_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"username\" from Database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_the_from_Database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"password\" from Database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_the_from_Database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});