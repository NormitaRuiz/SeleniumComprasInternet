package nopCommerce.tests;

import com.github.javafaker.Faker;
import nopCommerce.utils.BaseTest;
import nopCommerce.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class NewAddressManualData extends BaseTest {

    Faker faker=new Faker(new Locale("en-US"));
    String email=faker.internet().emailAddress();
    String msg= "The new address has been added successfully.";

    @Test
    public void newAddressManualData() throws InterruptedException {
        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();
        registerPage.linkMyAccount();
        registerPage.linkMyAccountAddresses();
        Thread.sleep(2000);
        WebElement btnNewAddress=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='add-button']/button[contains(text(), 'Add new')]"))) ;
        btnNewAddress.click();
        driver.navigate().refresh();
        Thread.sleep(2000);
        registerPage.fillOutFormNewAddressManualData();
        registerPage.newAddressCountry();
        registerPage.submitConfNewAddress();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement msgConfirmationAddNewAddress=driver.findElement(By.xpath("//div[@class='bar-notification success']/p"));
        String msgNewAddress=msgConfirmationAddNewAddress.getText();
        Assert.assertEquals(msgNewAddress, msg);
    }


}
