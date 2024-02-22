package nopCommerce.tests;

import nopCommerce.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginIncorrectPassword extends BaseTest {

    String msg="The credentials provided are incorrect";


    @Test
    public void incorrectPasswordLogin(){
        registerPage.LinkLogin();
        registerPage.loginUserIncorrect();
        registerPage.submitLogIn();
        WebElement msgPasswordIncorrect=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        String msgIncorrect=msgPasswordIncorrect.getText();
        Assert.assertEquals(msgIncorrect, msg);
    }
}
