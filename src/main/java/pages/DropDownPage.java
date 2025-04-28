package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropDownElement = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption(String option){
        findDropDownOptions().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
       return findDropDownOptions()
               .getAllSelectedOptions()
               .stream()
               .map(e->e.getText())
               .collect(Collectors.toList());

    }

    private Select findDropDownOptions(){
        return new Select(driver.findElement(dropDownElement));
    }





}
