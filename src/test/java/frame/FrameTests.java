package frame;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testLeftBottomFrameText(){
        var Nested = homePage.clickFrames().clickNested();
        Assertions.assertEquals("LEFT",Nested.getLeftFrameText(),"wrong left frame text");
        Assertions.assertEquals("BOTTOM",Nested.getBottomText(),"wrong bottom frame text");

    }
}
