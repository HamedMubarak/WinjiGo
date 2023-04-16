package winjiGo_website_taf.tests.login;

import winjiGo_website_taf.base_Test.BaseTest;
import winjiGo_website_taf.driver.WebDriverHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepdefs extends BaseTest {

    @Given("login page is opened")
    public void loginPageIsOpened() {
        Assert.assertEquals(WebDriverHandler.getWebDriver().getCurrentUrl(),
                "https://swinji.azurewebsites.net/account/login");
    }

    @When("enter valid {string} email address in login page")
    public void enterValidEmailAddressInLoginPage(String email) {
            browser.winjiGoWebsite.login.enterEmailAddress(testData.getProperty(email));
    }

    @When("enter valid {string} password in login page")
    public void enterValidPasswordInLoginPage(String password) {
        browser.winjiGoWebsite.login.enterPassword(testData.getProperty(password));
    }

    @When("click on login button in login page")
    public void clickOnLoginButtonInLoginPage() {
        browser.winjiGoWebsite.home = browser.winjiGoWebsite.login.clickOnLoginButton();
    }

    @Then("home page should be opened")
    public void homePageShouldBeOpened() {
        Assert.assertTrue( browser.elementIsDisplayed(browser.winjiGoWebsite.home.getSideNavigationBar()));
    }
}
