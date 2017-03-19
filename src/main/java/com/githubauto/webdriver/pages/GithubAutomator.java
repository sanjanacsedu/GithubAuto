package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubAutomator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver",
        "//Users/nafiurrashid/Desktop/selenium/chromedriver");
    WebDriver driver = new ChromeDriver();
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GithubLoginPage loginPage = homePage.singIn();
    loginPage.login("githubtest456", "githubtest123");
    GithubSearchResultsPage searchPage = new GithubSearchResultsPage(driver);
    searchPage.search("hibernate");
    searchPage.numberOfResults();
    searchPage.titleResults();

  }

}
