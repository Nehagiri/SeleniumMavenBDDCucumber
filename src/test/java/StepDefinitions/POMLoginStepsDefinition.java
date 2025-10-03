package StepDefinitions;

import PageObjects.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;

public class POMLoginStepsDefinition {

    private static final Logger log = LoggerFactory.getLogger(POMLoginStepsDefinition.class);
    static WebDriver driver = new EdgeDriver();
    loginPage login;

    @Given("User is on login page")
    public void user_is_on_login_page()
    {
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    //@When("User enters valid username and password")
    @When("User enters valid {string} and {string}")
    //public void user_enters_valid_username_and_password()
    public void user_enters_valid_and(String username, String password)
    {
     login = new loginPage(driver);
     login.enterUserName(username);
     login.enterPassword(password);
    }

    @And("Clicks on Login button")
    public void clicks_on_login_button()
    {
       login.clickLogin();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page()
    {
        login.isLogoDisplayed();
        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed(),"User is successfully navigated to Home Page");
    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
