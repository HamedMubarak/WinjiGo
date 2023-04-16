package winjiGo_website_taf;

import winjiGo_website_taf.pages.AddCourse;
import winjiGo_website_taf.pages.Courses;
import winjiGo_website_taf.pages.Login;
import winjiGo_website_taf.pages.Home;

public class WinjiGoWebsite {

    public Login login;
    public Home home;
    public Courses courses;
    public AddCourse addCourse;

    public WinjiGoWebsite(){

        login = new Login();
        home = new Home();
        courses = new Courses();
        addCourse = new AddCourse();
    }
}
