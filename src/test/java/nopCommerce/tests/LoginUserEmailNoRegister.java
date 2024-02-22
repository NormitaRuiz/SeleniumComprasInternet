package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserEmailNoRegister extends BaseTest {
    String msgEmailNoRegister="No customer account found";
        @Test
    public void userEmailNoRegister(){

        registerPage.LinkLogin();
        registerPage.emailNoRegister();
        registerPage.submitLogIn();
        WebElement msgPassword=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        String msg=msgPassword.getText();
        Assert.assertEquals(msg,msgEmailNoRegister);

    }
}
