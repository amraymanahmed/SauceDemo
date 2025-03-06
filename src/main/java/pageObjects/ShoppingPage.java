package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage{
WebDriver driver;
    public ShoppingPage(WebDriver driver) {

        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(className = "shopping_cart_link")
    public WebElement cartIcon;

    @FindBy(id="add-to-cart")
    public WebElement addCartBtn;




}
