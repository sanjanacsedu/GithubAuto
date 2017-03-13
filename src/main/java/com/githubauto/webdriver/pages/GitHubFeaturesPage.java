package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;

public class GitHubFeaturesPage {
  private WebDriver driver;

  /**
   * @param driver
   */
  public GitHubFeaturesPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
