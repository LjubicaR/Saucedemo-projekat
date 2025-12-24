package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    WebElement usenameField;
    WebElement passwordField;
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsenameField() {
        return driver.findElement(By.id("user-name"));
    }
    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
    public void inputUsername (String username) {
        getUsenameField().clear();
        getUsenameField().sendKeys(username);
    }
    public void inputPassword (String password) {
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }
    public void clickLoginButton () {
        getLoginButton().click();
    }
}

