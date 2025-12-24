package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;

    WebElement productName;
    WebElement productDescription;
    WebElement productPrice;
    WebElement addToCartButton;
    WebElement backToProductsButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductName() {
        return driver.findElement(By.cssSelector(".inventory_details_desc_container"));
    }

    public WebElement getProductDescription() {
        return driver.findElement(By.cssSelector(".inventory_details_desc"));
    }

    public WebElement getProductPrice() {
        return driver.findElement(By.cssSelector(".inventory_details_price"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.id("add-to-cart"));
    }

    public WebElement getBackToProductsButton() {
        return driver.findElement(By.id("back-to-products"));
    }


    public void addProductToCart() {
        getAddToCartButton().click();
    }

    public void goBackToProducts() {
        getBackToProductsButton().click();
    }
}
