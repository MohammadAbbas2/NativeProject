package forgetpassword;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForgetPasswordTest extends BaseTests {

@Test
    public void testSuccessfulForgetPass(){
    Assertions.assertTrue(homePage.clickForgetPassword().forgetPassword("m@test.com").getEmailMessage().contains("Internal Server Error"));
}

}
