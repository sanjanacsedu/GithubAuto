package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.githubauto.webdriver.pages.GitHubFeaturesPage;
import com.githubauto.webdriver.pages.GithubHomePage;

public class GithubHomeTest {

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

  public GithubHomeTest() {
    driver = WebdriverBuilder.getDriver();

  }

  @Test
  public void verifyTitleWithoutLogin() {
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    String title = homePage.getTitle();
    Assert.assertEquals("The world's leading software development platform · GitHub", title);
  }

  @Test
  public void verifyTitleFeaturePage() {
    GithubHomePage homePage = new GithubHomePage(driver);
    homePage.load();
    GitHubFeaturesPage featurePage = new GitHubFeaturesPage(driver);
    homePage.gotoFeatures();
    String titleFeature = featurePage.getTitle();
    Assert.assertEquals(
        "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub",
        titleFeature);

  }

}
