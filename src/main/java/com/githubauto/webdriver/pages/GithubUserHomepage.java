package com.githubauto.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubUserHomepage {

  private WebDriver driver;

  /**
   * @param driver
   */
  public GithubUserHomepage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  public void locateStartButton() {
    driver.findElement(By.linkText("Start a project")).click();
  }

  public void createAndDeleteProject() {
    driver.findElement(By.linkText("Start a project")).click();
    WebElement repositoryName = driver.findElement(By.id("repository_name"));
    String projectName = "testproject2";
    repositoryName.sendKeys(projectName);
    driver.findElement(By.cssSelector(".btn.btn-primary.first-in-line")).click();
    driver.get("https://github.com/githubtest456/" + projectName + "/settings");
    driver.findElements(By.cssSelector("hr + button")).get(1).click();
    driver.findElements(By.name("verify")).get(0).sendKeys(projectName);
  }
}
