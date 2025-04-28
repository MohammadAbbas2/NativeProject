package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     private WebDriver driver;
     private By formAuthLink = By.linkText("Form Authentication");
     private By dropDownLink = By.linkText("Dropdown");
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
}
