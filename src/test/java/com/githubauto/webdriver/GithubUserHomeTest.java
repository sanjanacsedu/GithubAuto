package com.githubauto.webdriver;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.githubauto.webdriver.pages.GitHubFeaturesPage;
import com.githubauto.webdriver.pages.GithubHomePage;
import com.githubauto.webdriver.pages.GithubLoginPage;
import com.githubauto.webdriver.pages.GithubSearchResultsPage;
import com.githubauto.webdriver.pages.GithubUserHomepage;

public class GithubUserHomeTest {

  /*
   * 1. Open browser, go to github.com 2. Verify the title
   * 
   * Automation: 1. Create a webdriver ( firefox/chrome) 2. Create a GithubHomePage instance and
   * pass driver to it 3. GithubHomepage.load - > will load github home page 4.
   * GithubHomepage.getTitle -> Get the title 5. verify the title Get the
   * https://github.com/features page title
   * 
   */
  public WebDriver driver;

  public GithubUserHomeTest() {
    driver = WebdriverBuilder.getDriver();

  }


  @Test
  public void verifySignIn() {
    // On home page, signIn() - > GithubLoginPage
    // On GithubLoginPage, login(String userName, String password) -> GithubUserHomepage
    driver.manage().deleteAllCookies();
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GithubLoginPage loginPage = homePage.singIn();
    // GithubUserHomepage userHome = loginPage.login("wipauto123", "Github123$");
    // loginPage.login("githubtest456", "githubtest123");
    GithubUserHomepage userHome = loginPage.login("githubtest456", "githubtest123");
  }

  @Test
  public void verifyStartButtonExists() {
    // On home page, signIn() - > GithubLoginPage
    // On GithubLoginPage, login(String userName, String password) -> GithubUserHomepage
    // Create a project
    // Delete that project
    driver.manage().deleteAllCookies();
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GithubLoginPage loginPage = homePage.singIn();
    GithubUserHomepage userHome = loginPage.login("githubtest456", "githubtest123");
    // userHome.locateStartButton();
    userHome.createAndDeleteProject();
  }

}

