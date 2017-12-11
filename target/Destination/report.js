$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shilakha/eclipse-workspace/Flipkart/Feature/Feature.feature");
formatter.feature({
  "name": "Flipkart automation",
  "description": "\tDescription: This feature will test a LogIn and search functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user navigates to https://www.flipkart.com/",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"username\" and \"password\" to LogIn",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user logins into the site",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Search functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "User enters the product name to be search and add it to cart",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});