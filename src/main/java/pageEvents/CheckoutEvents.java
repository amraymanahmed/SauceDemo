package pageEvents;

import Utils.ElementsActions;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CheckoutPage;

public class CheckoutEvents extends BasePage {

    private CheckoutPage checkoutPage;
    private ElementsActions Ele_Wait;
    private WebDriver driver;

    public CheckoutEvents(WebDriver driver) {
        super(driver);
        this.driver = driver;
        checkoutPage = new CheckoutPage(driver);
        this.Ele_Wait = new ElementsActions(driver);
    }

    public void clickCheckoutBtn() {
        Ele_Wait.waitElementToBeVisibleAndClickable(checkoutPage.checkoutBtn);
        clickButton(checkoutPage.checkoutBtn);
    }

    public void proceedToCheckout(String firstName, String lastName, String zipCode) {
        Ele_Wait.waitElementToBeVisibleAndClickable(checkoutPage.firstNameTxtBox);
        setTextElementText(checkoutPage.firstNameTxtBox, firstName);
        Ele_Wait.waitElementToBeVisibleAndClickable(checkoutPage.lastNameTxtBox);
        setTextElementText(checkoutPage.lastNameTxtBox, lastName);
        Ele_Wait.waitElementToBeVisibleAndClickable(checkoutPage.postalCodeTxtBox);
        setTextElementText(checkoutPage.postalCodeTxtBox, zipCode);
        Ele_Wait.waitElementToBeVisibleAndClickable(checkoutPage.continueBtn);
        clickButton(checkoutPage.continueBtn);
    }
}
