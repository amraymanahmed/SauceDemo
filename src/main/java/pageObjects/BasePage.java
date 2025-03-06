package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void clickButton(WebElement button) {
        try {
            button.click();
        } catch (Exception e) {
            System.out.println("Failed to click button: " + e.getMessage());
        }
    }

    protected void setTextElementText(WebElement textElement, String value) {
        try {
            textElement.sendKeys(value);
        } catch (Exception e) {
            System.out.println("Failed to set text: " + e.getMessage());
        }
    }

}
