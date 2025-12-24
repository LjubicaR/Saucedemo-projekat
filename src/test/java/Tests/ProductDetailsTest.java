package Tests;

import Base.BaseTest;
import Pages.ProductPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductDetailsTest extends BaseTest {

    @Test
    public void openProductDetailsPageTest() {

        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();


        inventoryPage.clickOnProduct();


        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(productPage.getProductName().getText().contains("Sauce Labs Backpack"));

        Assert.assertTrue(productPage.getProductDescription().isDisplayed());

        Assert.assertTrue(productPage.getProductPrice().isDisplayed());

        Assert.assertTrue(productPage.getAddToCartButton().isDisplayed());

    }
}
