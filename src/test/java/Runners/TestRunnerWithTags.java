package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        features = "src/test/resources/FeaturesWithTags",
        glue = "StepDefinitions",
        tags = "@smoke and @regression and not @functional",
        monochrome = true)

public class TestRunnerWithTags extends AbstractTestNGCucumberTests {



}
