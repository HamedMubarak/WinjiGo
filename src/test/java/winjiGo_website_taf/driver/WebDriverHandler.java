package winjiGo_website_taf.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class WebDriverHandler {

    private static WebDriver webDriver;

    public WebDriverHandler()throws IOException{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
    }

    public static WebDriver getWebDriver() { return webDriver;}

    public void navigateToUrl(String link) {
        webDriver.navigate().to(link);
    }
    public void resetCache() {webDriver.manage().deleteAllCookies();}

    public String userGetCurrentUrl() {
        return webDriver.getCurrentUrl();
    }
    public void close() {webDriver.quit();}

}
