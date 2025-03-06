package pageEvents;

import Utils.Constants;
import Utils.ElementsActions;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.LoginPage;

public class LoginEvents extends BasePage {

    private LoginPage loginPage;
    private ElementsActions Ele_Wait;
    private WebDriver driver;


    public LoginEvents(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.Ele_Wait = new ElementsActions(driver);
    }

    public void openLoginPage() {
        driver.manage().window().maximize();
        driver.get(Constants.SauceDemoLoginUrl);
    }

    public void enterCredential(String username, String password) {
        Ele_Wait.waitElementToBeVisibleAndClickable(loginPage.userNameTxtBox);
        setTextElementText(loginPage.userNameTxtBox, username);
        Ele_Wait.waitElementToBeVisibleAndClickable(loginPage.passwordTxtBox);
        setTextElementText(loginPage.passwordTxtBox, password);
    }

    public void clickLoginBtn() {
        Ele_Wait.waitElementToBeVisibleAndClickable(loginPage.loginBtn);
        clickButton(loginPage.loginBtn);
    }
}
