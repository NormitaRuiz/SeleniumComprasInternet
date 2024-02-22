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

public class BuySuccessful extends BaseTest {
String msgConfirmacion="shopping cart";
String msgValOrdenShopping="Click here for order details.";

    @Test
    public void buyExit() throws InterruptedException {
        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();
        registerPage.linkComputers();
        registerPage.linkDesktop();
        registerPage.linkImgDesktop();
        registerPage.cmbRamDesktop();
        registerPage.selecHDDDesktop();
        registerPage.addCarShopp();
        WebElement msgConfAddCarShopping = new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='bar-notification']/div[@class='bar-notification success']/p/a[contains(text(), 'shopping cart')]")));
        String msg=msgConfAddCarShopping.getText();
        Assert.assertEquals(msg, msgConfirmacion);
        driver.navigate().refresh();
        WebElement msgCar=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='topcartlink']"))) ;
        msgCar.click();
        registerPage.checkTermsService();
        registerPage.submitCheckout();
        Thread.sleep(2000);
        registerPage.submitBillingAddress();
        Thread.sleep(2000);
        registerPage.checkNextDay();
        registerPage.btnShippingMethod();
        registerPage.btnPaymetMethod();
        registerPage.btnPaymetInformation();
        registerPage.btnConfirmOrden();
        //validacion de mensaje de confirmacion
        WebElement msgValidacionOrden=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='details-link']/a")));
        String msgValidacion=msgValidacionOrden.getText();
        Assert.assertEquals(msgValOrdenShopping, msgValidacion);
        registerPage.btnContinueOrden();

    }


}
