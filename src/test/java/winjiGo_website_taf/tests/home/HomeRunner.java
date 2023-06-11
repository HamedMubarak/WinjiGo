package winjiGo_website_taf.tests.home;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/winjiGo_website_taf/tests/home",
        glue = {"winjiGo_website_taf.tests"},
        monochrome = true
)
public class HomeRunner extends AbstractTestNGCucumberTests {
}
