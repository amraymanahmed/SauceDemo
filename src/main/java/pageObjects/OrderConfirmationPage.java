package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage{

    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(className = "summary_total_label")
    public WebElement total;

    @FindBy(id = "finish")
    public WebElement finishBtn;

    @FindBy(className = "complete-text")
    public WebElement successMsg;


}
