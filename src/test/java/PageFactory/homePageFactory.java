package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElement logo_cart;

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement app_logo;

    public void isCartDisplayed()
    {
        logo_cart.isDisplayed();
    }

    public homePageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
