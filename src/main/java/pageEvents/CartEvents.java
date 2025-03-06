package pageEvents;

import Utils.ElementsActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import pageObjects.CartPage;
import pageObjects.ShoppingPage;

import java.util.HashSet;
import java.util.Set;

public class CartEvents extends BasePage {

    private CartPage cartPage;
    private ElementsActions Ele_Wait;
    private WebDriver driver;

    public CartEvents(WebDriver driver) {
        super(driver);
        this.driver = driver;
        cartPage = new CartPage(driver);
        this.Ele_Wait = new ElementsActions(driver);
    }

    public Set<String> getProductsNames() {

        Ele_Wait.waitElementToBeVisible(cartPage.productsNames.get(0));
        Set<String> productsNames = new HashSet<>();
        for (WebElement element : cartPage.productsNames) {
            productsNames.add(element.getText());
        }
        return productsNames;
    }

    public Set<String> getProductsPrices() {
        Ele_Wait.waitElementToBeVisible(cartPage.productsPrices.get(0));
        Set<String> productsPrices = new HashSet<>();
        for (WebElement element : cartPage.productsPrices) {
            productsPrices.add(element.getText());
        }
        return productsPrices;
    }


}
