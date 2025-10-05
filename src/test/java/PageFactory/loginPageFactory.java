package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

    WebDriver driver;

    @FindBy(id="user-name")
    WebElement txt_UserName;

    @FindBy(id="password")
    WebElement txt_Password;

    @FindBy(id="login-button")
    WebElement button_Login;

    @FindBy(xpath="//div[@class='app_logo']")
    WebElement appLogo;

    public loginPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String username)
    {
        txt_UserName.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        txt_Password.sendKeys(password);
    }
    public void clickLogin()
    {
        button_Login.click();
    }
}
