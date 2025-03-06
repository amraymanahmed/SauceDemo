package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageEvents.*;
import testData.ApiHelper;

import java.util.HashSet;
import java.util.Set;

public class CheckoutTest extends TestBase{

    LoginEvents loginEvents;
    ShoppingEvents shoppingEvents;
    CartEvents cartEvents;
    CheckoutEvents checkoutEvents;
    OrderConfirmationEvents orderConfirmationEvents;

    @BeforeClass
    public void setUp() {
        loginEvents = new LoginEvents(driver);
        shoppingEvents=new ShoppingEvents(driver);
        cartEvents = new CartEvents(driver);
        checkoutEvents = new CheckoutEvents(driver);
        orderConfirmationEvents=new OrderConfirmationEvents(driver);
    }

    @Test
    public void testCheckout() {

        Set<String> expectsProductNames = new HashSet<>();
        Set<String> expectsProductPrices = new HashSet<>();
        // Step 1: Login to the website using the standard user credentials on the login screen
        loginEvents.openLoginPage();
        loginEvents.enterCredential("standard_user", "secret_sauce");
        loginEvents.clickLoginBtn();

        // Step 2: Add the product "Sauce Labs Fleece Jacket" to the cart.
        shoppingEvents.addProductToCart("Sauce Labs Fleece Jacket");
        expectsProductNames.add("Sauce Labs Fleece Jacket");
        expectsProductPrices.add("$49.99");
        //Step 3: Open the "Sauce Labs Onesie" product details page and add it to the cart
        shoppingEvents.viewProductDetails("Sauce Labs Onesie");
        shoppingEvents.clickAddCartBtn();
        expectsProductNames.add("Sauce Labs Onesie");
        expectsProductPrices.add("$7.99");
        // Step 4: Assert the number of products displayed on the cart icon (should be 2).
        Assert.assertEquals(shoppingEvents.getCartItemCount(),2);
        //Step5:Navigate to the cart page and verify the names and prices of the added products
        shoppingEvents.openCartView();
        Assert.assertEquals(cartEvents.getProductsNames(),expectsProductNames);
        Assert.assertEquals(cartEvents.getProductsPrices(),expectsProductPrices);
        checkoutEvents.clickCheckoutBtn();
        // Step 6: Proceed to checkout, dynamically entering user data (e.g., First Name, Last Name, and
        //Zip/Postal Code).
        String firstName = ApiHelper.getFirstName();
        String lastName = ApiHelper.getLastName();
        String zipCode = ApiHelper.getZipCode();

        checkoutEvents.proceedToCheckout(firstName, lastName,zipCode );

        // Step 7: Assert the order details on the overview page
         Assert.assertEquals(orderConfirmationEvents.getTotalPrice(),"Total: $62.62");

        // Step 8 : Complete the purchase by clicking Finish and verifying the "Complete" page
        orderConfirmationEvents.clickFinishBtn();
        Assert.assertEquals(orderConfirmationEvents.getSuccessMsg(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
