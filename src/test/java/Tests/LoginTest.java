package Tests;

import Base.BaseTest;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest () {

        LoginPage loginPage = new LoginPage(driver);
        String validUsername = "standard_user";
        String validPassword = "secret_sauce";

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement productsTitle = wait.until( ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".title")) );

        InventoryPage inventoryPage = new InventoryPage(driver);

        Assert.assertEquals(productsTitle.getText(), "Products");
    }
}
