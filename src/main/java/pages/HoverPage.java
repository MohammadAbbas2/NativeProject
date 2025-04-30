package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By captionBox = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index: starts from 1
     */
    public FigCaption hoverOnFigure (int index){
        Actions actions = new Actions(driver);
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        actions.moveToElement(figure).perform();
        return new FigCaption(figure.findElement(captionBox));
    }
    public class FigCaption{
        private WebElement caption;
        private By nameField = By.tagName("h5");
        private By linkField = By.tagName("a");


        public FigCaption(WebElement caption) {
            this.caption= caption;
        }

        public boolean isDisplayed(){
            return caption.isDisplayed();
        }

        public String getCaptionName(){
            return caption.findElement(nameField).getText();
        }

        public String getCaptionLink(){
            return caption.findElement(linkField).getAttribute("href");
        }


    }


}
