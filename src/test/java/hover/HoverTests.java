package hover;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverFirst(){
        var captions = homePage.clickHovers().hoverOnFigure(2);
        Assertions.assertTrue(captions.isDisplayed(), "Figure Caption Not Displayed");
        Assertions.assertEquals(captions.getCaptionName(),"name: user2","Displayed Figure caption name is wrong");
        Assertions.assertTrue(captions.getCaptionLink().endsWith("/users/2"),"Displayed Figure caption link is wrong");
    }
}
