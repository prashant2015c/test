$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Naukari.feature");
formatter.feature({
  "line": 1,
  "name": "Naukari site testing",
  "description": "",
  "id": "naukari-site-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "naukari-site-testing;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Go to the site \"\u003cDriver\u003e\",\"\u003cHomepage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Popup comes handle it",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "close it",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "naukari-site-testing;;",
  "rows": [
    {
      "cells": [
        "Driver",
        "Homepage"
      ],
      "line": 10,
      "id": "naukari-site-testing;;;1"
    },
    {
      "cells": [
        "chrome",
        "naukari_site"
      ],
      "line": 11,
      "id": "naukari-site-testing;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "naukari-site-testing;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Go to the site \"chrome\",\"naukari_site\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Popup comes handle it",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "close it",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    },
    {
      "val": "naukari_site",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.go_to_the_site(String,String)"
});
formatter.result({
  "duration": 25360714261,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.popup_comes_handle_it()"
});
formatter.result({
  "duration": 38722,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.close_it()"
});
formatter.result({
  "duration": 80243,
  "status": "passed"
});
});