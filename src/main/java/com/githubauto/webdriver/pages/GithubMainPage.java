package com.githubauto.webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubMainPage {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver",
        "//Users/nafiurrashid/Desktop/selenium/chromedriver");
    WebDriver driver = new ChromeDriver();
    GithubHomePage homePage = new GithubHomePage(driver);
    GithubLoginPage loginPage = homePage.singIn();
    loginPage.login("githubtest456", "githubtest123");

  }

}
