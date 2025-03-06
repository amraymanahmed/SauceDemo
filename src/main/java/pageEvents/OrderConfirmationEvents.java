package pageEvents;

import Utils.ElementsActions;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.OrderConfirmationPage;

public class OrderConfirmationEvents extends BasePage {

    private OrderConfirmationPage orderConfirmationPage;
    private ElementsActions Ele_Wait;
    private WebDriver driver;

    public OrderConfirmationEvents(WebDriver driver) {

        super(driver);
        this.driver = driver;
        orderConfirmationPage = new OrderConfirmationPage(driver);
        this.Ele_Wait = new ElementsActions(driver);

    }

    public String getTotalPrice() {

        Ele_Wait.waitElementToBeVisible(orderConfirmationPage.total);
        return orderConfirmationPage.total.getText();

    }

    public void clickFinishBtn() {
        Ele_Wait.waitElementToBeVisibleAndClickable(orderConfirmationPage.finishBtn);
        clickButton(orderConfirmationPage.finishBtn);
    }

    public String getSuccessMsg() {

        Ele_Wait.waitElementToBeVisible(orderConfirmationPage.successMsg);
        return orderConfirmationPage.successMsg.getText();
    }


}
