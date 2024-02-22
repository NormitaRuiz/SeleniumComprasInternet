package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestDebilPassword extends BaseTest {

    String msgDebilPassword="Password must meet the following rules:";

    @Test
    public void registerNewAccountDebilPassword(){
    registerPage.goToRegisterLink();
    registerPage.fillOutFormWeakPassword();
    registerPage.submitRegister();
    WebElement msgDebilEmail=driver.findElement(By.xpath("//span[@id='Password-error']/p"));
    String msg=msgDebilEmail.getText();
    Assert.assertEquals(msg, msgDebilPassword);


    }

}
