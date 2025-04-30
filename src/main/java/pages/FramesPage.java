package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public NestedFramePage clickNested(){
        driver.findElement(nestedLink).click();
        return new NestedFramePage(driver);
    }
}
