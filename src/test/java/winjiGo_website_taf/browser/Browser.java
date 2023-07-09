package winjiGo_website_taf.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import winjiGo_website_taf.WinjiGoWebsite;
import winjiGo_website_taf.driver.WebDriverHandler;

public class Browser {

        private final WebDriver webDriver = WebDriverHandler.getWebDriver();

        public WinjiGoWebsite winjiGoWebsite;

        public Browser(){
                winjiGoWebsite = new WinjiGoWebsite();
        }

        public boolean elementIsDisplayed (WebElement element)
        {
                try{
                        return element.isDisplayed();
                }catch (Exception e) {
                        return false;
                }
        }

}
