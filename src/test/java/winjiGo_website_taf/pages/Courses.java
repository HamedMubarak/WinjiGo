package winjiGo_website_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import winjiGo_website_taf.driver.WebDriverHandler;

public class Courses {

    private By addCourseButton = By.id("btnListAddCourse");

    public WebElement getAddCourseButton(){return WebDriverHandler.getWebDriver().findElement(addCourseButton);}

    public AddCourse clickOnAddCourseButton(){
        WebDriverHandler.getWebDriver().findElement(addCourseButton).click();
        return new AddCourse();
    }
}
