package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy(id="first-name")
    public WebElement firstNameTxtBox;

    @FindBy(id="last-name")
    public WebElement lastNameTxtBox;

    @FindBy(id="postal-code")
    public WebElement postalCodeTxtBox;

    @FindBy(id="continue")
    public WebElement continueBtn;




}
