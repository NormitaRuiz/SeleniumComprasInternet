package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.testng.annotations.Test;

public class LoginUser extends BaseTest {

    @Test
    public void loginUserExit(){

        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();



    }
}
