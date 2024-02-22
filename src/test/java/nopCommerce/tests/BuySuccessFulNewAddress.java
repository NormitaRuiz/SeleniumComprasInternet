package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import nopCommerce.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BuySuccessFulNewAddress extends BaseTest {

    String msgConfirmacion="shopping cart";
    String msgOrdenShopping="Click here for order details.";

    @Test
    public void buyExitNewAddress() throws InterruptedException {
        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();
        registerPage.linkComputers();
        registerPage.linkDesktop();
        registerPage.linkImgDesktop();
        registerPage.cmbRamDesktop();
        registerPage.selecHDDDesktop();
        registerPage.addCarShopp();
       //mensaje de validación, indicando que se agrego correctamente la compra
         WebElement msgConfAddCarShopping = new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='bar-notification']/div[@class='bar-notification success']/p/a[contains(text(), 'shopping cart')]")));
        String msg=msgConfAddCarShopping.getText();
        Assert.assertEquals(msg, msgConfirmacion);
        driver.navigate().refresh();
        //ingresando al link del carrito de compras
        WebElement msgCar=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='topcartlink']"))) ;
        msgCar.click();
        registerPage.checkTermsService();
        registerPage.submitCheckout();
        Thread.sleep(2000);
        registerPage.cmbNewAddressBillingAddress();
        registerPage.fillOutFormNewAddressManualData();
        registerPage.billingNewAddressCountry();
        Thread.sleep(2000);
        registerPage.btnBillingAddress();
        registerPage.btnShippingMethod();
        Thread.sleep(2000);
        registerPage.btnPaymetMethod();
        registerPage.btnPaymetInformation();
        registerPage.btnConfirmOrden();
        //mensaje de validacion
        WebElement msgValidacionOrden=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='details-link']/a")));
        String msgValidacion=msgValidacionOrden.getText();
        Assert.assertEquals(msgOrdenShopping, msgValidacion);
        registerPage.btnContinueOrden();


    }
}
