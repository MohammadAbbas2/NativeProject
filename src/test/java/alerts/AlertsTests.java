package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptBasicAlert(){
        var alerts = homePage.clickAlerts();
        alerts.clickTheAcceptAlert();
        Assertions.assertTrue(alerts.getAlertText().contains("I am a JS Alert"), "Wrong Basic Message");
        alerts.acceptBasicAlert();
        Assertions.assertTrue(alerts.result().contains("You successfully clicked an alert"), "Wrong Result Basic Message");
    }

    @Test
    public void testAcceptConfirmAlert(){
        var alerts = homePage.clickAlerts();
        alerts.clickTheConfirmAlert();
        Assertions.assertTrue(alerts.getAlertText().contains("I am a JS Confirm"), "Wrong Confirm Message");
        alerts.acceptTheConfirmAlert();
        Assertions.assertTrue(alerts.result().contains("You clicked: Ok"), "Wrong Result Confirm Message");
    }

    @Test
    public void testAcceptPromptAlert(){
        var alerts = homePage.clickAlerts();
        alerts.clickThePromptAlert();
        Assertions.assertEquals(alerts.getAlertText(),"I am a JS prompt", "Wrong Prompt Message");
        alerts.setThePrompt("Hello Dears!");
        alerts.acceptThePromptAlert();
        Assertions.assertTrue(alerts.result().contains("Hello"), "wrong Result Prompt Message");
    }
}
