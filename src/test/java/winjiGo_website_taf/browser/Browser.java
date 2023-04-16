package winjiGo_website_taf.browser;

import org.openqa.selenium.WebElement;
import winjiGo_website_taf.WinjiGoWebsite;

public class Browser {

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
