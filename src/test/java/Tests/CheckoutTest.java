package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.CheckoutPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {


        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();


        inventoryPage.getAddToCartButton().click();

        inventoryPage.clickCartBadge();


        CartPage cartPage = new CartPage(driver);

        cartPage.clickCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterFirstName("Ljubica");
        checkoutPage.enterLastName("Radivojevic");
        checkoutPage.enterPostalCode("11000");

        checkoutPage.clickContinue();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkout-step-two.html"));

        Assert.assertTrue(checkoutPage.getPageTitle().getText().contains("Checkout: Overview"));
    }
}




