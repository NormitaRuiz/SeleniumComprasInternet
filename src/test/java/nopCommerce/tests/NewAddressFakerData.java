package nopCommerce.tests;

import com.github.javafaker.Faker;
import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Locale;


public class NewAddressFakerData extends BaseTest {
    String msg= "The new address has been added successfully.";
    Faker faker=new Faker(new Locale("en-US"));
    String email=faker.internet().emailAddress();
    @Test
    public void newAddressFakeData() throws InterruptedException {
        registerPage.LinkLogin();
        registerPage.loginUser();
        registerPage.submitLogIn();
        registerPage.linkMyAccount();
        registerPage.linkMyAccountAddresses();
        Thread.sleep(2000);
        registerPage.submitAddNewAddress();
        registerPage.fillOutFormNewAddressWithFakeData(faker.name().firstName(), faker.name().lastName(),
                email, faker.name().title(), faker.name().title(), faker.name().title(),
                faker.name().title(), faker.name().title(),faker.name().name() ,faker.name().title() );
        registerPage.newAddressCountry();
        registerPage.submitConfNewAddress();
        Thread.sleep(2000);
        WebElement msgConfirmationAddNewAddress=driver.findElement(By.xpath("//div[@class='bar-notification success']/p"));
        String msgNewAddress=msgConfirmationAddNewAddress.getText();
        Assert.assertEquals(msgNewAddress, msg);
    }
}
