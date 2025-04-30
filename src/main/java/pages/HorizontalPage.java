package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalPage {
    private WebDriver driver;
    private By sliderElement = By.cssSelector("div.sliderContainer input");
    private By sliderValueElement = By.id("range");


    public HorizontalPage(WebDriver driver) {
    this.driver = driver;
    }
    public void setSliderValue(float value){
        WebElement slider = driver.findElement(sliderElement);
        slider.click();
        while(true){
            if(getSliderValue() < value)
                slider.sendKeys(Keys.ARROW_RIGHT);
            else if (getSliderValue() > value)
                slider.sendKeys(Keys.ARROW_LEFT);
            else
                break;
        }
    }
    public float getSliderValue(){
        return Float.parseFloat(driver.findElement(sliderValueElement).getText());
    }


}
