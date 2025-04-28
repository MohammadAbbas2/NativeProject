package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        Assertions.assertTrue(homePage.clickFormAuth()
                    .login("tomsmith", "SuperSecretPassword!")
                    .getAlertMessage().contains("You logged into a secure area!"));
    }



}
