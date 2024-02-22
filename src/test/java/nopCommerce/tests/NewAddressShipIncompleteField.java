package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import nopCommerce.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewAddressShipIncompleteField extends BaseTest {

    String msgValidationFields="First name is required.";

    @Test
    public void newAddressIncompleteField(){
        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();
        registerPage.linkMyAccount();
        registerPage.linkMyAccountAddresses();
        WebElement btnNewAddress=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='add-button']/button[contains(text(), 'Add new')]"))) ;
        btnNewAddress.click();
        registerPage.fillOutFormNewAddressWithIncompleteField();
        //registerPage.newAddressCountry();
        registerPage.submitConfNewAddress();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement msgValidationField=driver.findElement(By.id("Address_FirstName-error"));
        String msgNewAddress=msgValidationField.getText();
        Assert.assertEquals(msgNewAddress, msgValidationFields);
    }
}

