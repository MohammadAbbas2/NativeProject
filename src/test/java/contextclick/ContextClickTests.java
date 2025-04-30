package contextclick;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContextClickTests extends BaseTests {
    @Test
    public void testRightClick(){
        var contextPage = homePage.clickContext();
        Assertions.assertEquals(contextPage.clickContextArea(),"You selected a context menu");
        contextPage.acceptAlert();
    }
}
