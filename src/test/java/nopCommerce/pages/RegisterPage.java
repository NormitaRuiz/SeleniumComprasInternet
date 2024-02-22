package nopCommerce.pages;

import nopCommerce.utils.BasePage;
import nopCommerce.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage extends BasePage {

    WebDriver driver;
    /*

    */
    By linRegister= By.xpath("//div[@class='header-links']/ul/li[1]/a");
    By genderFemale=By.id("gender-female");
    By fname=By.id("FirstName");
    By lname=By.id("LastName");

    By dBirthday= By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    By dBirthMonth=By.xpath("//div[@class='date-picker-wrapper']/select[2]");
    By dBirthYear=By.xpath("//div[@class='date-picker-wrapper']/select[3]");

    By email=By.id("Email");

    By company=By.id("Company");
    By password=By.id("Password");
    By confPassword=By.id("ConfirmPassword");
    By btnRegister=By.id("register-button");

    By btnContinue=By.xpath("//div[@class='buttons']/a");

    By linkLogin= By.xpath("//div[@class='header-links']/ul/li[2]/a");

    By emaiLogin=By.id("Email");
    By passwordLogin=By.id("Password");

    By btnLogIn=By.xpath("//button[@class='button-1 login-button']");
    By btnRecover=By.xpath("//div[@class='buttons']/button[contains(text(), 'Recover')]");

    By linkForgotPassword=By.xpath("//span[@class='forgot-password']/a");
    By emailForgotPassword=By.id("Email");
    By linkMyAccount=By.xpath("//div[@class='header-links']/ul/li/a[@class='ico-account']");
    By linkAddresses=By.xpath("//div[@class='listbox']/ul/li[2]/a");

    By btnConfAddNewAddress=By.xpath("//div[@class='buttons']/button[contains(text(), 'Save')]");

    By addressFirstName=By.xpath("//div[@class='inputs']/input[@id='Address_FirstName']");

    By billingNewAddressFirstName=By.id("BillingNewAddress_FirstName");
    By addressLastName=By.id("Address_LastName");
    By billingNewAddressLastName=By.id("BillingNewAddress_LastName");
    By addressEmail=By.id("Address_Email");
    By billingNewAddressEmail=By.id("BillingNewAddress_Email");
    By addressCompany=By.id("Address_Company");
    By billingNewAddressCompany=By.id("BillingNewAddress_Company");
    By addressCountry=By.id("Address_CountryId");
    By billingNewAddressCountry=By.id("BillingNewAddress_CountryId");
    By addressCity=By.id("Address_City");
    By billingNewAddressCity=By.id("BillingNewAddress_City");
    By addressNumero1=By.id("Address_Address1");
    By billingNewAddress1=By.id("BillingNewAddress_Address1");
    By addressNumero2=By.id("Address_Address2");
    By billingNewAddress2=By.id("BillingNewAddress_Address2");
    By addressCodigoPostal=By.id("Address_ZipPostalCode");
    By billingNewAddressCodigoPostal=By.id("BillingNewAddress_ZipPostalCode");
    By addressPhoneNumber=By.id("Address_PhoneNumber");
    By billingNewAddressPhoneNumber=By.id("BillingNewAddress_PhoneNumber");
    By addressFaxNumber=By.id("Address_FaxNumber");
    By billingNewAddressFaxNumber=By.id("BillingNewAddress_FaxNumber");
    By linkOrder=By.xpath("//div[@class='listbox']/ul/li[3]");
    By linkComputers=By.xpath("//div[@class='header-menu']/ul/li/a[contains(text(), 'Computers')]");
    By linkDesktop=By.xpath("//li[@class='inactive']/a[contains(text(), 'Desktops')]");
    By linkImgDesktop=By.xpath("//div[@class='product-item']/div[@class='picture']/a[@title='Show details for Build your own computer']");
    By HDDDesktop=By.id("product_attribute_3_6");
    By btnAddCarShopping=By.id("add-to-cart-button-1");
    By linkShoppingCartPay=By.xpath("//div[@class='header-links']/ul/li[4]/a/span[contains(text(), 'Shopping cart')]");
    By checkTermsService=By.xpath("//div[@class='terms-of-service']/input");
    By btnCheckout=By.id("checkout");
    By btnAddNewAddress=By.xpath("//div[@class='add-button']/button[contains(text(), 'Add new')]");
    By btnBillingAddressContinue=By.xpath("//div[@id='billing-buttons-container']/button[contains(text(), 'Continue')]");
    By checkNextDay=By.xpath("//div[@class='method-name']/input[@id='shippingoption_1']");
    By cmbNewAddressBillingAddress=By.xpath("//select[@id='billing-address-select']/option[contains(text(), 'New Address')]");
    By checkCredCard=By.xpath("//div[@class='payment-details']/input[@id='paymentmethod_1']");

    By txtCredCardHolderNamePaymentInformation=By.id("CardholderName");
    By txtNumberCredCard=By.id("CardNumber");
    By txtNumberCredCardCode=By.id("CardCode");
    /*
    constructor
    */
    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    /*
    metodos
    * */

        public void goToRegisterLink(){

            click(linRegister);
        }

        public void LinkLogin(){
            click(linkLogin);

         }

         public void linkMyAccount(){
            click(linkMyAccount);

         }
         public void linkMyAccountAddresses(){
            click(linkAddresses);
         }


        public void selectSender(){

            click(genderFemale);

        }

        public void selectComboBirthDay(){
            WebElement inputDay = driver.findElement(dBirthday);
            Select cbDay = new Select(inputDay);
            cbDay.selectByIndex(8);

        }

    public void selectComboBirthMonth(){
        WebElement inputMonth = driver.findElement(dBirthMonth);
        Select cbMonth = new Select(inputMonth);
        cbMonth.selectByIndex(12);

    }

    public void selectComboBirthYear(){
        WebElement inputYear = driver.findElement(dBirthYear);
        Select cbYear = new Select(inputYear);
        cbYear.selectByIndex(20);

    }

    public void newAddressCountry(){
            WebElement inputCountry=driver.findElement(addressCountry);
            Select cbCountry=new Select(inputCountry);
            cbCountry.selectByIndex(40);

    }

    public void billingNewAddressCountry(){
        WebElement inputCountry=driver.findElement(billingNewAddressCountry);
        Select cbCountry=new Select(inputCountry);
        cbCountry.selectByIndex(40);

    }

       public void fillOutFormWithFakeData(String sFname, String sLname,
                                        String lEmail, String lCompany,
                                        String lPassword, String lConfPassword){
           type(fname, sFname);
           type(lname, sLname);
           type(email, lEmail);
           type(company, lCompany);
           type(password, lPassword);
           type(confPassword, lConfPassword);

    }

    public void fillOutFormWithManual(){
        type(fname, "Diana");
        type(lname, "Lujan Perez");
        type(email, "prueba3@gmail.com");
        type(company, "pruebas");
        type(password, "C123456");
        type(confPassword, "C123456");

    }

    public void fillOutFormIncompleteField(){
        type(fname, "");
        type(lname, "");
        type(email, "");
        type(company, "pruebaCalidad");
        type(password, "");
        type(confPassword, "");
    }

    public void fillOutFormExistingEmail(){
        type(fname, "Diana");
        type(lname, "Perez Quispe");
        type(email, "prueba1@gmail.com");
        type(company, "pruebaCalidad");
        type(password, "Punch#123456");
        type(confPassword, "Punch#123456");
    }

    public void fillOutFormWeakPassword(){
        type(fname, "Diana");
        type(lname, "Perez Quispe");
        type(email, "prueba2@gmail.com");
        type(company, "pruebaCalidad");
        type(password, "123");
        type(confPassword, "123");
    }

    public void fillOutFormNewAddressWithFakeData(String sFname, String sLname,
                                              String sEmail, String sCompany,
                                              String sCity, String sNumero1,
                                              String sNumero2, String sCodigoPostal,
                                              String sPhoneNumber,
                                              String sFaxNumber ){
    type(addressFirstName, sFname);
    type(addressLastName, sLname);
    type(addressEmail, sEmail);
    type(addressCompany,sCompany );
    type(addressCity,sCity );
    type(addressNumero1, sNumero1);
    type(addressNumero2,sNumero2);
    type(addressPhoneNumber, sPhoneNumber);
    type(addressCodigoPostal,sCodigoPostal );
    type(addressFaxNumber, sFaxNumber );

    }

    public void fillOutFormNewAddressManualData( ){
        type(billingNewAddressFirstName, "Margot");
        type(billingNewAddressLastName, "Baños Mallma");
        type(billingNewAddressEmail, "prueba3@gmail.com");
        type(billingNewAddressCompany,"jr. Arica Nro 421");
        type(billingNewAddressCity,"jiron 29 de diciembre");
        type(billingNewAddress1, "jr. 28 de julio numero 495");
        type(billingNewAddress2,"pruebas calidad");
        type(billingNewAddressPhoneNumber, "958263258");
        type(billingNewAddressCodigoPostal,"SBD4587" );
        type(billingNewAddressFaxNumber, "124587" );

    }




    public void fillOutFormNewAddressWithIncompleteField(){

        type(addressFirstName, "");
        type(addressLastName, "");
        type(addressEmail, "pruebas2356@gmail.com");
        type(addressCompany,"pruebitas" );
        type(addressCity,"lima" );
        type(addressNumero1, "cercado de lima");
        type(addressNumero2,"cercado de cusco");
        type(addressPhoneNumber, "936525896");
        type(addressCodigoPostal,"02356" );
        type(addressFaxNumber, "258955l" );

    }


    public void emailNoRegister(){
            type(emaiLogin, "prueba4@gmail.com");
            type(passwordLogin, "123");
    }

    public void loginUserIncorrect(){

        type(emaiLogin, "prueba3@gmail.com");
        type(passwordLogin, "123");

    }

    public void fillOutEmailForgotPassword(){
        type(emailForgotPassword, "prueba10@gmail.com");

    }

    public void submitRegister(){

        click(btnRegister);
    }

    public void submitContinue(){

            click(btnContinue);
    }




    public void submitConfNewAddress(){

            click(btnConfAddNewAddress);
    }

    public void loginUser(){
            type(emaiLogin, "prueba3@gmail.com");
            type(passwordLogin, "C123456");
    }

    public void submitLogIn(){

            click(btnLogIn);
        }

    public void submitLoginRecovery(){
            click(btnRecover);

        }

    public void setLinkForgotPassword(){
            click(linkForgotPassword);

        }

    public void linkOrder(){

            click(linkOrder);
    }

    public void linkComputers(){
            click(linkComputers);
    }

    public void linkDesktop(){
            click(linkDesktop);
    }

    public void linkImgDesktop(){
            click(linkImgDesktop);
    }

    public void cmbRamDesktop(){

            WebElement cmbRam=driver.findElement(By.xpath("//div[@class='attributes']/dl/dd[@id='product_attribute_input_2']/select"));
            Select cmbRamSelect=new Select(cmbRam);
            cmbRamSelect.selectByIndex(2);
    }

    public void selecHDDDesktop(){

            click(HDDDesktop);
    }

    public void addCarShopp(){
            click(btnAddCarShopping);
    }


    public void checkTermsService(){

            click(checkTermsService);
    }

    public void submitCheckout(){

            click(btnCheckout);
    }

    public void submitAddNewAddress(){

            click(btnAddNewAddress);
    }

    public void submitBillingAddress(){

            click(btnBillingAddressContinue);
    }

    public void checkNextDay(){

            click(checkNextDay);
    }

    public void btnBillingAddress(){
        WebElement btnContinueBillingAddress=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='billing-buttons-container']/button[contains(text(), 'Continue')]"))) ;
        btnContinueBillingAddress.click();
    }


    public void cmbNewAddressBillingAddress(){
            click(cmbNewAddressBillingAddress);
    }

    public void btnShippingMethod(){
        WebElement btnShippingMethod=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shipping-method-buttons-container']/button[contains(text(), 'Continue')]"))) ;
        btnShippingMethod.click();
    }

    public void btnPaymetMethod(){
        WebElement btnPaymetMethod=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='payment-method-buttons-container']/button[contains(text(), 'Continue')]"))) ;
        btnPaymetMethod.click();
    }

    public void btnPaymetInformation(){
        WebElement btnPaymentInformation=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='payment-info-buttons-container']/button[contains(text(), 'Continue')]"))) ;
        btnPaymentInformation.click();

    }

    public void btnConfirmOrden(){
        WebElement btnConfirmOrden=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='confirm-order-buttons-container']/button[contains(text(), 'Confirm')]"))) ;
        btnConfirmOrden.click();
    }

    public void btnContinueOrden(){
        WebElement btnContinueOrden=new WebDriverWait(driver, Duration.ofSeconds(Variables.timeSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='buttons']/button[contains(text(), 'Continue')]")));
        btnContinueOrden.click();

    }

    public void checkCredCard(){
            click(checkCredCard);
    }

    public void credCarNamePayment(){
            type(txtCredCardHolderNamePaymentInformation, "Diana");
            type(txtNumberCredCard, "4520852558958956");
            type(txtNumberCredCardCode, "452");

    }





     }







