package nopCommerce.tests;

import com.github.javafaker.Faker;
import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestExistinEmail extends BaseTest {

    String mensajeEmailExist="The specified email already exists";

    @Test
    public void registerNewAccountExistinEmail(){

        registerPage.goToRegisterLink();
        registerPage.fillOutFormExistingEmail();
        registerPage.submitRegister();
        WebElement msmEmailExisting=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        String msg=msmEmailExisting.getText();
        Assert.assertEquals(msg, mensajeEmailExist);


    }
}
