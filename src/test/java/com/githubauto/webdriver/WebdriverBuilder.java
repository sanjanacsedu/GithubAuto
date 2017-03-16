package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBuilder {

  private static WebDriver driver = null;

  public static WebDriver getDriver() {
    if (driver == null) {
      System.setProperty("webdriver.chrome.driver",
          "//Users/nafiurrashid/Desktop/selenium/chromedriver");
      driver = new ChromeDriver();
      return driver;
    }
    return driver;
  }
}
