package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By acceptAlertLink = By.cssSelector("button[onclick = \"jsAlert()\"]");
    private By confirmAlertLink = By.cssSelector("button[onclick = \"jsConfirm()\"]");
    private By promptAlertLink = By.cssSelector("button[onclick = \"jsPrompt()\"]");
    private By resultElement = By.id("result");

    public AlertsPage(WebDriver driver) {
    this.driver = driver;
    }

    public void clickTheAcceptAlert(){driver.findElement(acceptAlertLink).click();}
    public void acceptBasicAlert(){driver.switchTo().alert().accept();}

    public void clickTheConfirmAlert(){driver.findElement(confirmAlertLink).click();}
    public void acceptTheConfirmAlert(){driver.switchTo().alert().accept();}
    public void cancelTheConfirmAlert(){driver.switchTo().alert().dismiss();}

    public void clickThePromptAlert(){driver.findElement(promptAlertLink).click();}
    public void acceptThePromptAlert(){driver.switchTo().alert().accept();}
    public void setThePrompt(String prompt){driver.switchTo().alert().sendKeys(prompt);}

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public String result(){
        return driver.findElement(resultElement).getText();
    }
}
