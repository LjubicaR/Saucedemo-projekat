package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

public WebDriver driver;
    public WebDriverWait wait;

public InventoryPage inventoryPage;
public LoginPage loginPage;
public CartPage cartPage;
public ProductPage productPage;
public CheckoutPage checkoutPage;

@BeforeMethod
    public void setUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.navigate().to("https://www.saucedemo.com/");

    loginPage = new LoginPage(driver);
    inventoryPage = new InventoryPage(driver);
    cartPage = new CartPage(driver);
    productPage = new ProductPage(driver);
    checkoutPage = new CheckoutPage(driver);
}

/*
@AfterMethod
    public void tearDown () {
    driver.quit();
}

 */


}
