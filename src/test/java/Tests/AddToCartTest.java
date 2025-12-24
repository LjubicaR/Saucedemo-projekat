package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {


    @Test
    public void addProductToCart (){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.getAddToCartButton().click();

        String bagdeNumber = inventoryPage.getCartBadge().getText();

        Assert.assertEquals(bagdeNumber, "1");

        inventoryPage.getCartBadge().click();

        CartPage cartPage = new CartPage(driver);
        String itemName = cartPage.getItemNameInCart();

        Assert.assertEquals(itemName, "Sauce Labs Backpack");
        Assert.assertTrue(cartPage.isCheckoutButtonVisible(), "Checkout button is not visible");
    }
}