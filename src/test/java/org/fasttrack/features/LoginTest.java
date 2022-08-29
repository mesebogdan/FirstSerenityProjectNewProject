package org.fasttrack.features;

import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("mesebogdan@yahoo.com");
        loginSteps.setPassword("12345P!");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Cosmin Fast");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("mesebogdan@yahoo.com");
        loginSteps.setPassword("12345a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
