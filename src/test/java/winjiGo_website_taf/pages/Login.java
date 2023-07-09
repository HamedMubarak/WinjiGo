package winjiGo_website_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import winjiGo_website_taf.driver.WebDriverHandler;

public class Login {

   private By emailField =By.id("Email");
    private By passwordField =By.id("inputPassword");
    private By loginButton =By.id("btnLogin");

    public WebElement getEmailTextField(){
        return  WebDriverHandler.getWebDriver().findElement(emailField);
    }

    public WebElement getPasswordTextField(){
        return  WebDriverHandler.getWebDriver().findElement(passwordField);
    }

    public WebElement getLoginButton(){
        return  WebDriverHandler.getWebDriver().findElement(loginButton);
    }

    public void enterEmailAddress(String email){
        WebDriverHandler.getWebDriver().findElement(emailField).clear();
        WebDriverHandler.getWebDriver().findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password){
        WebDriverHandler.getWebDriver().findElement(passwordField).clear();
        WebDriverHandler.getWebDriver().findElement(passwordField).sendKeys(password);
    }

    public Home clickOnLoginButton(){
        WebDriverHandler.getWebDriver().findElement(loginButton).click();
        return new Home();
    }




}
