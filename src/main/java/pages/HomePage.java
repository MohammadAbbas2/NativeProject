package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     private WebDriver driver;
     private By formAuthLink = By.linkText("Form Authentication");
     private By dropDownLink = By.linkText("Dropdown");
     private By forgetPasswordLink = By.linkText("Forgot Password");
     private By hoverLink = By.linkText("Hovers");
     private By horizontalLink = By.linkText("Horizontal Slider");
     private By alertsLink = By.linkText("JavaScript Alerts");
     private By uploadLink = By.linkText("File Upload");
     private By contextMenuLink = By.linkText("Context Menu");
     private By framesLink = By.linkText("Frames");

     public HomePage(WebDriver driver) {
          this.driver = driver;
     }

     public LoginPage clickFormAuth(){
          driver.findElement(formAuthLink).click();
          return new LoginPage(driver);
     }

     public DropDownPage clickDropDown(){
          driver.findElement(dropDownLink).click();
          return new DropDownPage(driver);
     }

     public ForgetPasswordPage clickForgetPassword(){
          driver.findElement(forgetPasswordLink).click();
          return new ForgetPasswordPage(driver);
     }

     public HoverPage clickHovers(){
          driver.findElement(hoverLink).click();
          return new HoverPage(driver);
     }

     public HorizontalPage clickHorizontal(){
          driver.findElement(horizontalLink).click();
          return new HorizontalPage(driver);
     }

     public AlertsPage clickAlerts(){
          driver.findElement(alertsLink).click();
          return new AlertsPage(driver);
     }

     public UploadPage clickUpload(){
          driver.findElement(uploadLink).click();
          return new UploadPage (driver);
     }
     public ContextMenuPage clickContext(){
          driver.findElement(contextMenuLink).click();
          return new ContextMenuPage(driver);
     }

     public FramesPage clickFrames() {
          driver.findElement(framesLink).click();
          return new FramesPage(driver);
     }
}
