$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Shop.feature");
formatter.feature({
  "name": "Asaianpaint",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Asainpaint"
    }
  ]
});
formatter.scenario({
  "name": "Click on Peel \u0026 Stick",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Asainpaint"
    },
    {
      "name": "@Peel_and_Stick"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Asianpaint webpage_Shop functionality",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_step.user_is_on_Asianpaint_webpage_Shop_functionality()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom unknown error: unexpected command response\n  (Session info: chrome\u003d103.0.5060.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-9MMM3BBA\u0027, ip: \u0027192.168.1.205\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\LEENA\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54558}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b51100330facd623d599c7cc87e5a717\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.step_definition.Test_step.user_is_on_Asianpaint_webpage_Shop_functionality(Test_step.java:265)\r\n\tat ✽.User is on Asianpaint webpage_Shop functionality(Features/Shop.feature:60)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user select peel and stick",
  "keyword": "When "
});
formatter.match({
  "location": "Test_step.user_select_peel_and_stick()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "all available product on  webpage should  display",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_step.all_available_product_on_webpage_should_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select filter option from Product_Colour_Price",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_step.select_filter_option_from_Product_Colour_Price()"
});
formatter.result({
  "status": "skipped"
});
});