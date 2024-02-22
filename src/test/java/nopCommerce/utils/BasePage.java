package nopCommerce.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    int timeOutSec =10;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(timeOutSec));

    }

    public void setTimeOutSec(int timeOutSec){

        this.timeOutSec=timeOutSec;
    }

    public void visit(String url) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOutSec));
        driver.get(url);

    }

    public WebElement find(By element) {//solo localiza y devuelve el webelement

       return driver.findElement(element);

    }
    public void click(By element) {//localiza y hace clic
        find(element).click();


    }
    public void type(By element, String text) {//localiza e ingresa informacion
        find(element).sendKeys(text);


    }

    public boolean isDisplayed(By locator) {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch (Exception e){
            return false;

        }
        return true;

    }
}
