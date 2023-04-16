package winjiGo_website_taf.tests.home;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import winjiGo_website_taf.base_Test.BaseTest;

public class HomeStepdefs extends BaseTest {
    @When("click on collapse button in side navigation bar")
    public void clickOnCollapseButtonInSideNavigationBar() {
        browser.winjiGoWebsite.home.clickCollapseButton();
    }

    @When("click on course item in side navigation bar")
    public void clickOnCourseItemInSideNavigationBar() {
        browser.winjiGoWebsite.courses = browser.winjiGoWebsite.home.clickCourseListItem();
    }

    @Then("courses page should be opened")
    public void coursesPageShouldBeOpened() {
        Assert.assertTrue(browser.elementIsDisplayed(browser.winjiGoWebsite.courses.getAddCourseButton()));
    }
}
