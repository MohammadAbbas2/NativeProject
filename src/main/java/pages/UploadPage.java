package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
    private WebDriver driver;
    private By chooseElement = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFilesDiv = By.id("uploaded-files");

    public UploadPage(WebDriver driver) {
        this.driver=driver;
    }

    public void uploadFile(String absolutePath){
        driver.findElement(chooseElement).sendKeys(absolutePath);
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFilesDiv).getText();
    }

}
