package winjiGo_website_taf.tests.login;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/winjiGo_website_taf/tests/login",
        glue = {"winjiGo_website_taf.tests"},
        monochrome = true
)

public class LoginRunner extends AbstractTestNGCucumberTests {
}
