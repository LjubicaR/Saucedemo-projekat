package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveItemFromCartTest extends BaseTest {

    @Test
    public void removeSpecificItemFromCart () {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.getAddToCartButton().click();
inventoryPage.clickCartBadge();

        CartPage cartPage = new CartPage(driver);
        cartPage.removeItem("Sauce Labs Backpack");

        Assert.assertFalse(cartPage.isItemVisible("Sauce Labs Backpack"));

    }


}
