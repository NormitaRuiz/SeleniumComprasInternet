package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestManualData extends BaseTest {

    String mensajeConfirmacion="Your registration completed";

    @Test
    public void registerNewAccountManual(){

        registerPage.goToRegisterLink();
        registerPage.fillOutFormWithManual();
        registerPage.submitRegister();
        WebElement msmConfirmation=driver.findElement(By.xpath("//div[@class='result']"));
        String msg=msmConfirmation.getText();
        Assert.assertEquals(msg, mensajeConfirmacion);
        registerPage.submitContinue();

    }
}
