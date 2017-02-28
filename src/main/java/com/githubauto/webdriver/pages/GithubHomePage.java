package com.githubauto.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {

  private WebDriver driver;

  /**
   * @param driver
   */
  public GithubHomePage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  GithubLoginPage singIn() {
    driver.get("https://github.com/");
    WebElement linkElement = driver.findElement(By.linkText("Sign in"));
    linkElement.click();
    return new GithubLoginPage(driver);

  }



}