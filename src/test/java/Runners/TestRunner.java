package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "",
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {



}
