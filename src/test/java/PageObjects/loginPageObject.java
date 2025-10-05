package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageObject {

    WebDriver driver;
    By input_UserName = By.id("user-name");
    By input_Password = By.id("password");
    By btn_Login = By.id("login-button");
    By label_Logo= By.xpath("//div[@class='app_logo']");


    public loginPageObject(WebDriver driver) {

        this.driver = driver;

    }

    public void enterUserName(String username)
    {
        driver.findElement(input_UserName).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(input_Password).sendKeys(password);
    }
    public void clickLogin()
    {
        driver.findElement(btn_Login).click();
    }

    public void isLogoDisplayed()
    {
        driver.findElement(label_Logo).isDisplayed();
    }


    public  void  userLogin(String username,String password)
    {
        driver.findElement(input_UserName).sendKeys(username);
        driver.findElement(input_Password).sendKeys(password);
        driver.findElement(btn_Login).click();
    }





}
