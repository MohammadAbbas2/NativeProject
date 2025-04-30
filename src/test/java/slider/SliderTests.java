package slider;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SliderTests extends BaseTests {

    @Test
    public void testSetSlider(){
        var slider = homePage.clickHorizontal();
        slider.setSliderValue(4);
        Assertions.assertEquals(slider.getSliderValue(),4,"Slider value is wrong");
    }
}
