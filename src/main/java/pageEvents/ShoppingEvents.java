package pageEvents;

import Utils.ElementsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import pageObjects.ShoppingPage;

public class ShoppingEvents extends BasePage {

    private ShoppingPage shoppingPage;
    private ElementsActions Ele_Wait;
    private WebDriver driver;

    public ShoppingEvents(WebDriver driver) {
        super(driver);
        this.driver = driver;
        shoppingPage = new ShoppingPage(driver);
        this.Ele_Wait = new ElementsActions(driver);
    }

    public void addProductToCart(String productName) {
        String productXpath = "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button";
        WebElement addCartBtn = driver.findElement(By.xpath(productXpath));
        Ele_Wait.waitElementToBeVisibleAndClickable(addCartBtn);
        clickButton(addCartBtn);
    }

    public void viewProductDetails(String productName) {
        String productLink = "//div[text()='" + productName + "']";
        WebElement productNameTxt = driver.findElement(By.xpath(productLink));
        Ele_Wait.waitElementToBeVisibleAndClickable(productNameTxt);
        clickButton(productNameTxt);
    }

    public void clickAddCartBtn() {
        Ele_Wait.waitElementToBeVisibleAndClickable(shoppingPage.addCartBtn);
        clickButton(shoppingPage.addCartBtn);
    }

    public int getCartItemCount() {
        Ele_Wait.waitElementToBeVisible(shoppingPage.cartIcon);
        return Integer.parseInt(shoppingPage.cartIcon.getText());
    }

    public void openCartView() {
        Ele_Wait.waitElementToBeVisible(shoppingPage.cartIcon);
        clickButton(shoppingPage.cartIcon);
    }


}
