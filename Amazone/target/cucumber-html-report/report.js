$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazone.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Amazone1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login page get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "submitting \"\u003cloginid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "main page get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "go to department",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Amazone video",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "open video page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "loginid",
        "password"
      ],
      "line": 20,
      "id": "title-of-your-feature;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "prashant2015ccc@gmail.com",
        "pppp"
      ],
      "line": 21,
      "id": "title-of-your-feature;title-of-your-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "go to the amzone link",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazone.go_to_the_amzone_link()"
});
formatter.result({
  "duration": 553533300,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinition.Amazone.go_to_the_amzone_link(Amazone.java:29)\r\n\tat ✽.Given go to the amzone link(Amazone.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 21,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Amazone1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login page get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "submitting \"prashant2015ccc@gmail.com\" and \"pppp\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "main page get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "go to department",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Amazone video",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "open video page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "Amazone.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.login_page_get_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prashant2015ccc@gmail.com",
      "offset": 12
    },
    {
      "val": "pppp",
      "offset": 44
    }
  ],
  "location": "Amazone.submitting_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.main_page_get_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.go_to_department()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.click_on_Amazone_video()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.open_video_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Amazone.check_more_outcomes()"
});
formatter.result({
  "status": "skipped"
});
});