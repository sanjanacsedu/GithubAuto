package com.githubauto.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubLoginPage {

  private WebDriver driver;

  /**
   * @param driver
   */
  public GithubLoginPage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  public void login(String string1, String string2) {
    // TODO Auto-generated method stub
    WebElement userName = driver.findElement(By.id("login_field"));
    userName.sendKeys(string1);
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys(string2);
    WebElement linkElement1 = driver.findElement(By.className("btn"));
    linkElement1.click();
  }
}
