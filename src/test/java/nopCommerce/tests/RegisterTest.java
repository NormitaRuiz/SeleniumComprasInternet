package nopCommerce.tests;

import com.github.javafaker.Faker;
import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class RegisterTest extends BaseTest {

    Faker faker=new Faker(new Locale("en-US"));
    String mensajeConfirmacion="Your registration completed";


    @Test
    public void registerNewAccountExitFakeData(){

        String email=faker.internet().emailAddress();
        String password=faker.internet().password(8,10,
                true,true, true);

        registerPage.goToRegisterLink();
        registerPage.fillOutFormWithFakeData(faker.name().firstName(), faker.name().lastName(),email, faker.name().title(), password,password);
        System.out.println("Email is:"+email+" "+ "password is: "+password+"Company is: "+faker.name().title());
        registerPage.submitRegister();
        WebElement msmConfirmation=driver.findElement(By.xpath("//div[@class='result']"));
        String msg=msmConfirmation.getText();
        Assert.assertEquals(msg, mensajeConfirmacion);
        registerPage.submitContinue();

    }




}
