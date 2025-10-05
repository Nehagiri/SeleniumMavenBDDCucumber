package StepDefinitions;

import PageFactory.homePageFactory;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class PFLoginStepsDefinition {

    static WebDriver driver;
    loginPageFactory loginPF;
    homePageFactory homePF;

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
        loginPF= new loginPageFactory(driver);
        loginPF.enterUserName(username);
        loginPF.enterPassword(password);
    }

    @And("Clicks on Login button")
    public void clicks_on_login_button()
    {
       loginPF.clickLogin();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page()
    {
        homePF=new homePageFactory(driver);
        homePF.isCartDisplayed();
    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
