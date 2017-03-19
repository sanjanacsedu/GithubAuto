package com.githubauto.webdriver.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubSearchResultsPage {
  private WebDriver driver;

  /**
   * @param driver
   */
  public GithubSearchResultsPage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  public void numberOfResults() {
    List<WebElement> myElements = driver.findElements(By.cssSelector("div+ul > li"));
    System.out.println("Number of result is: " + myElements.size());
  }

  public void titleResults() {
    List<WebElement> myElements = driver.findElements(By.cssSelector("div+ul > li"));
    System.out.println("Title from the search results: ");
    for (WebElement e : myElements) {
      System.out.println(e.findElement(By.tagName("h3")).getText());
    }
  }

  public void search(String input) {
    WebElement searchInput = driver.findElement(By.name("q"));
    searchInput.sendKeys(input);
    searchInput.sendKeys(Keys.ENTER);
  }


}
