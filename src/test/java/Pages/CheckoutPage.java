package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver driver;

    WebElement firstNameField;
    WebElement lastNameField;
    WebElement postalCodeField;
    WebElement continueButton;
    WebElement cancelButton;
    WebElement pageTitle;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getPostalCodeField() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getPageTitle() {
        return driver.findElement(By.cssSelector(".title"));
    }

    public void enterFirstName(String firstName) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        getPostalCodeField().clear();
        getPostalCodeField().sendKeys(postalCode);
    }

    public void clickContinue() {
        getContinueButton().click();
    }

    public void clickCancel() {
        getCancelButton().click();
    }


}
