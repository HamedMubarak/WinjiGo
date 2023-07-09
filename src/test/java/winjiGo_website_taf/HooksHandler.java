package winjiGo_website_taf;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import winjiGo_website_taf.base_Test.BaseTest;
import winjiGo_website_taf.browser.Browser;
import winjiGo_website_taf.driver.WebDriverHandler;
import winjiGo_website_taf.utils.ConfigProperties;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before()
    public void setUpWinjiGoWebsite() throws IOException {

        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        testData = new ConfigProperties("resources/Data.properties");
        configBrowser = new ConfigProperties("resources/ConfigBrowser.properties");
        webDriverHandler.navigateToUrl(configBrowser.getProperty("url"));
    }

    @AfterStep()
    public void waitTillVisibiltyOfPage() throws InterruptedException {
        Thread.sleep(150);
    }
    @After()
    public void closeWinjiGoWebsite() {
        webDriverHandler.resetCache();
        webDriverHandler.close();
    }

}
