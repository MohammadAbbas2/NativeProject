package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By messageField = By.cssSelector("h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailMessage(){
        return driver.findElement(messageField).getText();
    }


}
