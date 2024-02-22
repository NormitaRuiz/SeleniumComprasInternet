package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginForgotPassword extends BaseTest {

    String msgEmailPassword="Email with instructions has been sent to you.";

    @Test
    public void forgotEmailPassword(){
        registerPage.LinkLogin();
        registerPage.setLinkForgotPassword();
        registerPage.fillOutEmailForgotPassword();
        registerPage.submitLoginRecovery();
        WebElement msgPassword=driver.findElement(By.xpath("//div[@class='bar-notification success']/p"));
        String msg=msgPassword.getText();
        Assert.assertEquals(msg, msgEmailPassword);
    }




}
