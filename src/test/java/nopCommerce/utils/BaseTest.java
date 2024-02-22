package nopCommerce.utils;

import nopCommerce.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public WebDriver driver;
    public RegisterPage registerPage;



    @BeforeMethod
    public void setup(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Variables.url);
        registerPage=new RegisterPage(driver);

    }

    @AfterMethod
    public void levantar(){
        //driver.close();

    }
}
