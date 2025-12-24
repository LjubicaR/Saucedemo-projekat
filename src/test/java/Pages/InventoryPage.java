package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    WebDriver driver;

    WebElement pageHeader;
    WebElement addToCartButton;
    WebElement cartBadge;


    public InventoryPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getPageHeader() {
        return driver.findElement(By.cssSelector(".header_secondary_container"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getCartBadge() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public void addProductToCart () {
        getAddToCartButton().click();
    }

    public String getCartCount () {
        return getCartBadge().getText();
    }

    public void clickCartBadge () {
        getCartBadge().click();
    }
    public void clickOnProduct() {
        driver.findElement(By.id("item_4_title_link")).click();
    }
}


