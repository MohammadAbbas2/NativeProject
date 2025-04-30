package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    private WebDriver driver;
    private int frameSetId = 0;
    private String frameTopName = "frame-top";
    private String leftFrameName = "frame-left";
    private By leftFrameBody= By.cssSelector("body");
    private String bottomFrameName = "frame-bottom";
    private By bottomFrameDiv = By.cssSelector("body");


    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }
    private void switchToFrame(int frameIndex){
        driver.switchTo().frame(frameIndex);
    }
    private void switchToDefualt(){
        driver.switchTo().defaultContent();
    }
    public String getLeftFrameText(){
       // switchToFrame(frameSetId);
        switchToFrame(frameTopName);
        switchToFrame(leftFrameName);
        String text = driver.findElement(leftFrameBody).getText();
        switchToDefualt();
        return text;
    }

    public String getBottomText(){
        //switchToFrame(frameSetId);
        switchToFrame(bottomFrameName);
        String text = driver.findElement(bottomFrameDiv).getText();
        switchToDefualt();
        return text;
    }
}
