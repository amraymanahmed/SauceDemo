package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "user-name")
    public WebElement userNameTxtBox;


    @FindBy(id = "password")
    public WebElement passwordTxtBox;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

}
