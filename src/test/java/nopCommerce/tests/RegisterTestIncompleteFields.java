package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterTestIncompleteFields extends BaseTest {

     String mensajeRequerido="First name is required.";

    @Test
    public void registerNewAccountIncompleteFields(){
        registerPage.goToRegisterLink();
        registerPage.fillOutFormIncompleteField();
        registerPage.submitRegister();
        WebElement msmConfirmation=driver.findElement(By.id("FirstName-error"));
        String msgRequerid=msmConfirmation.getText();
        Assert.assertEquals(msgRequerid, mensajeRequerido);


    }




}
