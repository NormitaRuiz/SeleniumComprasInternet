package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import nopCommerce.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BuySuccessCredCardInvalid extends BaseTest {

    String msgConfirmacion="shopping cart";
    String msgShippingCredCar="Your Shopping Cart is empty!";
    public void buyCredCardInvalid() throws InterruptedException {
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
        registerPage.checkCredCard();
        registerPage.btnPaymetMethod();
        registerPage.credCarNamePayment();
        registerPage.btnPaymetInformation();
        //mensaje de confirmacion por tarjeta
        WebElement msgCredCardCestaVacia=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='order-summary-content']/div[contains(text(), 'Your Shopping Cart is empty!')])")));
        String msgCredCard=msgCredCardCestaVacia.getText();
        Assert.assertEquals(msgShippingCredCar, msgCredCard);



    }
}

