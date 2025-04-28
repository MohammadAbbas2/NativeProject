package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameField= By.id("username");
    private By passwordField= By.id("password");
    private By loginButton= By.cssSelector("#login Button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SecureArea login (String userName, String password){
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }

}
