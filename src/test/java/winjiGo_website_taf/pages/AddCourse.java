package winjiGo_website_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import winjiGo_website_taf.driver.WebDriverHandler;

public class AddCourse{

    private By createButton = By.id("btnSaveAsDraftCourse");

    public WebElement getCreateButton(){return WebDriverHandler.getWebDriver().findElement(createButton);}

    public Courses clickOnCreateButton(){
        WebDriverHandler.getWebDriver().findElement(createButton).click();
        return new Courses();
    }
}
