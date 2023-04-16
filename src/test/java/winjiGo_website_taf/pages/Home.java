package winjiGo_website_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import winjiGo_website_taf.driver.WebDriverHandler;

public class Home {

    private By sideNavigationBar = By.id("left-panel");
    private By collapseButton = By.id("btnMinifyMe");
    private By courseListItem = By.id("btnMyCoursesList");

    public WebElement getSideNavigationBar(){return WebDriverHandler.getWebDriver().findElement(sideNavigationBar);}

    public WebElement getCollapseButton(){return WebDriverHandler.getWebDriver().findElement(collapseButton);}

    public WebElement getCoursesItem() {return WebDriverHandler.getWebDriver().findElement(courseListItem);}

    public void clickCollapseButton() {WebDriverHandler.getWebDriver().findElement(collapseButton).click();}

    public Courses clickCourseListItem(){
        WebDriverHandler.getWebDriver().findElement(courseListItem).click();
        return new Courses();
    }

}
