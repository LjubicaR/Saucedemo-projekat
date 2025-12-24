package Pages;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {

    WebDriver driver;
    WebElement cartItemName;
    WebElement getCheckoutButton;


    public CartPage(WebDriver driver) {
        this.driver = driver;

    }

    public String getItemNameInCart() {
        WebElement cartItemName = driver.findElement(By.id("item_4_title_link"));
        return cartItemName.getText();

    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public boolean isCheckoutButtonVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement checkoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
            return checkoutButton.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void removeItem (String itemId) {
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton.click();
    }

    public boolean isItemVisible (String itemName) {
        List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
        for (WebElement item : items) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    public void clickCheckoutButton() {
        getCheckoutButton().click();
    }

}

