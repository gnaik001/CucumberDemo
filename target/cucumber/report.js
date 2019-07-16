$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefiles/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#StoryType\u003dWEB"
    },
    {
      "line": 2,
      "value": "#Owner\u003dejagruti"
    },
    {
      "line": 3,
      "value": "#CreationDate\u003d22nd Mar 2019"
    },
    {
      "line": 4,
      "value": "#Author\u003dGaurav"
    }
  ],
  "line": 7,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 776471211,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "User will be on application login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "user open \"Chrome\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters url \"http://www.gcrit.com/build3/admin/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will be on Applications login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 11
    }
  ],
  "location": "Login.openBrowser(String)"
});
formatter.result({
  "duration": 7980905342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.gcrit.com/build3/admin/login",
      "offset": 17
    }
  ],
  "location": "Login.enterURL(String)"
});
formatter.result({
  "duration": 8002995554,
  "status": "passed"
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "duration": 1387109606,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify login functionality by passing valid credentials",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@SmokeTest"
    },
    {
      "line": 14,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user enters username as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters password as \"admin@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user will be on application\u0027s home page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 25
    }
  ],
  "location": "Login.enterUserName(String)"
});
formatter.result({
  "duration": 2521175324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@123",
      "offset": 25
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 2604072176,
  "status": "passed"
});
formatter.match({
  "location": "Login.submit()"
});
formatter.result({
  "duration": 3274806545,
  "status": "passed"
});
formatter.match({
  "location": "Login.applicationHomePage()"
});
formatter.result({
  "duration": 21713462350,
  "status": "passed"
});
formatter.match({
  "location": "Login.closeBrowser()"
});
formatter.result({
  "duration": 3201025688,
  "status": "passed"
});
formatter.after({
  "duration": 570515302,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Verify login functionality by passing invalid credentials",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user will be on application\u0027s Login Page With error message \" Error: Invalid administrator login attempt.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 32,
      "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "Admin@123"
      ],
      "line": 33,
      "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;2"
    },
    {
      "cells": [
        "admin",
        "Admin@123"
      ],
      "line": 34,
      "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;3"
    },
    {
      "cells": [
        "Admin",
        "admin@123"
      ],
      "line": 35,
      "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 148311045,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "User will be on application login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "user open \"Chrome\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters url \"http://www.gcrit.com/build3/admin/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will be on Applications login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 11
    }
  ],
  "location": "Login.openBrowser(String)"
});
formatter.result({
  "duration": 4554308643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.gcrit.com/build3/admin/login",
      "offset": 17
    }
  ],
  "location": "Login.enterURL(String)"
});
formatter.result({
  "duration": 7438256249,
  "status": "passed"
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "duration": 1472503345,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Verify login functionality by passing invalid credentials",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    },
    {
      "line": 22,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user enters username as \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters password as \"Admin@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user will be on application\u0027s Login Page With error message \" Error: Invalid administrator login attempt.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 25
    }
  ],
  "location": "Login.enterUserName(String)"
});
formatter.result({
  "duration": 2607955286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin@123",
      "offset": 25
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 2677145922,
  "status": "passed"
});
formatter.match({
  "location": "Login.submit()"
});
formatter.result({
  "duration": 4563535305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Error: Invalid administrator login attempt.",
      "offset": 61
    }
  ],
  "location": "Login.showErrorMessage(String)"
});
formatter.result({
  "duration": 1521405990,
  "status": "passed"
});
formatter.match({
  "location": "Login.closeBrowser()"
});
formatter.result({
  "duration": 3157249708,
  "status": "passed"
});
formatter.after({
  "duration": 115060393,
  "status": "passed"
});
formatter.before({
  "duration": 153468821,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "User will be on application login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "user open \"Chrome\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters url \"http://www.gcrit.com/build3/admin/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will be on Applications login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 11
    }
  ],
  "location": "Login.openBrowser(String)"
});
formatter.result({
  "duration": 4852124955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.gcrit.com/build3/admin/login",
      "offset": 17
    }
  ],
  "location": "Login.enterURL(String)"
});
formatter.result({
  "duration": 5732961452,
  "status": "passed"
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "duration": 1400046934,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Verify login functionality by passing invalid credentials",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    },
    {
      "line": 22,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user enters username as \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters password as \"Admin@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user will be on application\u0027s Login Page With error message \" Error: Invalid administrator login attempt.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 25
    }
  ],
  "location": "Login.enterUserName(String)"
});
formatter.result({
  "duration": 2482937119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin@123",
      "offset": 25
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 2425821144,
  "status": "passed"
});
formatter.match({
  "location": "Login.submit()"
});
formatter.result({
  "duration": 2865415615,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Error: Invalid administrator login attempt.",
      "offset": 61
    }
  ],
  "location": "Login.showErrorMessage(String)"
});
formatter.result({
  "duration": 1500511778,
  "status": "passed"
});
formatter.match({
  "location": "Login.closeBrowser()"
});
formatter.result({
  "duration": 3107959507,
  "status": "passed"
});
formatter.after({
  "duration": 118041281,
  "status": "passed"
});
formatter.before({
  "duration": 144960380,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "User will be on application login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "user open \"Chrome\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters url \"http://www.gcrit.com/build3/admin/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will be on Applications login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 11
    }
  ],
  "location": "Login.openBrowser(String)"
});
formatter.result({
  "duration": 4381274942,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.gcrit.com/build3/admin/login",
      "offset": 17
    }
  ],
  "location": "Login.enterURL(String)"
});
formatter.result({
  "duration": 14363923838,
  "status": "passed"
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "duration": 1465506459,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify login functionality by passing invalid credentials",
  "description": "",
  "id": "login-feature;verify-login-functionality-by-passing-invalid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    },
    {
      "line": 22,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user enters username as \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters password as \"admin@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user will be on application\u0027s Login Page With error message \" Error: Invalid administrator login attempt.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 25
    }
  ],
  "location": "Login.enterUserName(String)"
});
formatter.result({
  "duration": 2612777061,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@123",
      "offset": 25
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 2688503694,
  "status": "passed"
});
formatter.match({
  "location": "Login.submit()"
});
formatter.result({
  "duration": 2773984101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Error: Invalid administrator login attempt.",
      "offset": 61
    }
  ],
  "location": "Login.showErrorMessage(String)"
});
formatter.result({
  "duration": 1470236236,
  "status": "passed"
});
formatter.match({
  "location": "Login.closeBrowser()"
});
formatter.result({
  "duration": 3203422576,
  "status": "passed"
});
formatter.after({
  "duration": 87311517,
  "status": "passed"
});
});