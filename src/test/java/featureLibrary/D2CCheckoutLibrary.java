
package featureLibrary;

import cucumber.api.java.en.Then;
import org.junit.Assert;
//        import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.D2CCheckoutPage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;


public class D2CCheckoutLibrary extends D2CCheckoutPage {

    Logger logger = Logger.getLogger(D2CCheckoutLibrary.class.getName());

    public void validateCheckoutPage(){
        Assert.assertEquals("Checkout".trim(), cktTitle.getText());
        Assert.assertEquals("Enter email".trim(), cktEnterMailTxt.getText());
        Assert.assertEquals("Order summary".trim(), cktOrderSummaryTxt.getText());
    }

    public void userAccountSignIn(){
        waitFor(5000);
        enterText(cktEmailInput , getTestDataValue(registrationclass_path, "valid_Account_Email"));
        enterText(cktPasswordInput , getTestDataValue(registrationclass_path, "valid_Account_Password"));
        clickButton(cktAcceptTermsRadioBtn);
        clickButton(cktNextButton);
    }

    public void enterValidAccountDetails() {
        clickElementAction(accMgmtAccountBtn);
        waitFor(7000);
        enterText(accMgmtAccountEmailVal, getTestDataValue("testdata.staging.RegistrationTestData", "valid_Account_Email"));
        enterText(accMgmtAccountPasswordVal, getTestDataValue("testdata.staging.RegistrationTestData", "valid_Account_Password"));
        waitFor(2000);
        clickElementAction(accMgmtAccountSignInBtn);
        waitFor(10000);
    }

    public void navigateTOD2CPage(){
        waitFor(10000);
        driver.get("https://qa1.molekule.com/D2C/");
        waitFor(2000);
    }

    public void clickOnProduct(){
        waitFor(20000);
        clickButton(cktMolekuleAirMiniBtn);
    }


    public void validateCheckoutButton(){
        waitFor(15000);
        Assert.assertEquals("Checkout".trim(), cktCheckoutButton.getText());
    }

    public void clickOnCheckoutButton(){
        waitFor(15000);
        clickButton(cktCheckoutButton);
    }

    public void clickAddNewAddress(){
        waitFor(15000);
//        cktAddNewAddressPlusIcon.click();
        clickElementAction(cktAddNewAddressPlusIcon);
    }

    public void validateShippingAddressFields(){
        waitFor(3000);
        Assert.assertEquals("This is a business address.".trim(), cktThisIsBusinessAddressTxt.getText());
        Assert.assertTrue(cktThisIsBusinessAddressRadioBtn.isDisplayed());
        Assert.assertEquals("First name".trim(), cktShippingFirstNameTxt.getText());
        Assert.assertEquals("Last name".trim(), cktShippingLastNameTxt.getText());
        Assert.assertEquals("Address 1".trim(), cktShippingAddressTxt1.getText());
        Assert.assertEquals("Address 2 (optional)".trim(), cktShippingAddressTxt2.getText());
        Assert.assertEquals("City".trim(), cktShippingCityTxt.getText());
        Assert.assertEquals("State".trim(), cktShippingStateTxt.getText());
        Assert.assertEquals("Postal code".trim(), cktShippingPostalCodeTxt.getText());
        Assert.assertEquals("Country".trim(), cktShippingCountryTxt.getText());
        Assert.assertEquals("Phone number".trim(), cktShippingPhoneNumTxt.getText());
        Assert.assertEquals("Save Address".trim(), cktShippingSaveAddressTxt.getText());
    }

    public void clickThisIsABusinessAddressRadioButton(){
        clickElementAction(cktThisIsBusinessAddressRadioBtn);
    }

    public void validateBusinessNameField(){
        Assert.assertEquals("Company name (optional)".trim(), cktShippingCompanyNameTxt.getText());
        Assert.assertTrue(cktShippingCompanyNameVal.isDisplayed());
    }

    public void enterInvalidInputInNameField(){
        enterText(cktShippingFirstNameVal , getTestDataValue(registrationclass_path, "invalid_First_Name"));
        enterText(cktShippingLastNameVal , getTestDataValue(registrationclass_path, "invalid_Last_Name"));
    }

    public void validateErrorMessage(String errMessage){
        isElementDisplayed(driver.findElement(By.xpath("(//*[contains(text(),"+errMessage+")])")));
    }

    public void validateNotPresentErrorMessage(String errMessage){
        int size = driver.findElements(By.xpath("(//*[contains(text(),"+errMessage+")])")).size();
        if (size==0){
            logger.info("Error message is not displayed");
        }else{
            isElementDisplayed(driver.findElement(By.xpath("(//*[contains(text(),"+errMessage+")])")));
        }
    }

    public void enterValidShippingAddressDetails(){
        clearValue(cktShippingFirstNameVal);
        enterText(cktShippingFirstNameVal , getTestDataValue(registrationclass_path, "valid_First_Name"));
        clearValue(cktShippingLastNameVal);
        enterText(cktShippingLastNameVal , getTestDataValue(registrationclass_path, "valid_Last_Name"));
        enterText(cktShippingAddressVal1 , getTestDataValue(registrationclass_path, "valid_Street_Address1"));
        enterText(cktShippingAddressVal2 , getTestDataValue(registrationclass_path, "valid_Street_Address2"));
        enterText(cktShippingCityVal , getTestDataValue(registrationclass_path, "valid_City"));
        clickElementAction(cktShippingStateVal);
        clickElementAction(driver.findElement(By.xpath("//li[@value='"+getTestDataValue(registrationclass_path, "valid_State")+"']")));
        enterText(cktShippingPostalCodeVal , getTestDataValue(registrationclass_path, "valid_Postal_Code"));
        clickElementAction(cktShippingCountryVal);
        clickElementAction(driver.findElement(By.xpath("//li[@value='"+getTestDataValue(registrationclass_path, "valid_Country")+"']")));
        enterText(cktShippingPhoneNumVal , getTestDataValue(registrationclass_path, "valid_PhoneNumber"));
        clickElementAction(cktShippingSaveAddressTxt);
    }

    public void validateSaveButton(){
        Assert.assertTrue(cktShippingSaveButton.isEnabled());
    }
    public void clickShippingSaveButton(){
        clickElementAction(cktShippingSaveAddressTxt);
    }
    public void clickShippingSaveButton2(){
        clickElementAction(cktShippingSaveButton);
    }

    public void validateShippingMethodSection(String value){
        Assert.assertEquals("Shipping method".trim(), cktShippingMethodTitle.getText());
        String color = cktShippingMethodTitleNumber.getCssValue("background-color");
        Assert.assertEquals(value, color);
    }

    public void clickThisIsGiftRadio(){
        waitFor(10000);
        clickElementAction(cktThisIsGiftRadioBtn);
    }
    public void validateShippingMethodSection(){
        waitFor(4000);
        Assert.assertEquals("Shipping method".trim(), cktShippingMethodTitle.getText());
        Assert.assertTrue( cktShippingMethodTitleNumber.getText().contains("3"));
        String color = cktShippingMethodTitleNumber.getCssValue("background");
    }
    public void validateRecipientEmailField(){
        Assert.assertTrue(cktRecipientInfoEmailVal.isDisplayed());
        Assert.assertTrue(cktRecipientGiftMessageVal.isDisplayed());
        Assert.assertEquals("Make it personal.".trim(), cktRecipientMakePersonalTxt.getText());
        Assert.assertEquals("Recipient’s email".trim(), cktRecipientInfoEmailTxt.getText());
        Assert.assertEquals("Gift message (optional)".trim(), cktRecipientGiftMessageTxt.getText());
        Assert.assertEquals("They’ll receive a gift receipt with tracking once the order ships.".trim(), cktRecipientReceiveGiftTxt.getText());
    }

    public void validateShippingTitle(String value){
        Assert.assertEquals("Shipping Info".trim(), cktShippingInfoTitle.getText());
        String color = cktShippingInfoTitleNumber.getCssValue("background-color");
        System.out.println("Color" +color);
        //Assert.assertEquals(value, color);
    }

    public void validateRecipientInfo(){
        waitFor(5000);
        Assert.assertEquals("Recipient’s info".trim(), cktRecipientInfoTitle.getText());
    }

    public void validateSavedShippingAddress(){
        Assert.assertTrue(cktSavedShippingAddress.isDisplayed());
    }

    public void SelectShippingAndRecipientMail(){
        clickElementAction(cktSavedShippingAddressVal1);
        enterText(cktRecipientInfoEmailVal , getTestDataValue(registrationclass_path, "valid_Account_Email  "));
    }

    public void validateRecipientInfoEditLink(){
        Assert.assertEquals("Edit".trim(), cktRecipientInfoEditLink.getText());
    }

    public void clickRecipientInfoEdit(){
        clickElementAction(cktRecipientInfoEditLink);
    }

    public void selectShippingMethod(){
        waitFor(10000);
        clickElementAction(cktShippingSMethodVal1);
        clickElementAction(cktNextButton);
    }

    public void selectShippingDetails(){
        waitFor(10000);
        clickElementAction(cktShippingDetailVal1);
        clickElementAction(cktShippingSaveTxt);
    }

    public void validatePaymentSection(String value){
        Assert.assertEquals("Payment".trim(), cktPaymentTitle.getText());
        String color = cktPaymentTitleNumber.getCssValue("background-color");
        System.out.println("Method color" +color);
        Assert.assertEquals(value, color);
    }

    public void validateBillingAddressToggle(){
        Assert.assertTrue(cktPaymentToggle.isDisplayed());
    }

    public void clickBillingAddressToggle(){
        waitFor(5000);
        clickElementAction(cktPaymentToggle);
    }
    public void validateBillingAddressSection(){
        waitFor(5000);
        Assert.assertEquals("New address".trim(), cktPaymentBillingNewAddressTxt.getText());
        Assert.assertEquals("First name".trim(), cktPaymentBillingFirstNameTxt.getText());
        Assert.assertEquals("Last name".trim(), cktPaymentBillingLastNameTxt.getText());
        Assert.assertEquals("Address 1".trim(), cktPaymentBillingAddressTxt1.getText());
        Assert.assertEquals("Address 2 (optional)".trim(), cktPaymentBillingAddressTxt2.getText());
        Assert.assertEquals("City".trim(), cktPaymentBillingCityTxt.getText());
        Assert.assertEquals("State".trim(), cktPaymentBillingStateTxt.getText());
        Assert.assertEquals("Postal code".trim(), cktPaymentBillingPostalCodeTxt.getText());
        Assert.assertEquals("Country".trim(), cktPaymentBillingCountryTxt.getText());
        Assert.assertEquals("Phone number".trim(), cktPaymentBillingPhoneNumTxt.getText());
    }

    public void enterBillingAddressFields(){
        clearValue(cktPaymentBillingFirstNameVal);
        enterText(cktPaymentBillingFirstNameVal , getTestDataValue(registrationclass_path, "valid_First_Name"));
        clearValue(cktPaymentBillingLastNameVal);
        enterText(cktPaymentBillingLastNameVal , getTestDataValue(registrationclass_path, "valid_Last_Name"));
        enterText(cktPaymentBillingAddressVal1 , getTestDataValue(registrationclass_path, "valid_Street_Address1"));
        enterText(cktPaymentBillingAddressVal2 , getTestDataValue(registrationclass_path, "valid_Street_Address2"));
        enterText(cktPaymentBillingCityVal , getTestDataValue(registrationclass_path, "valid_City"));
        clickElementAction(cktPaymentBillingStateVal);
        clickElementAction(driver.findElement(By.xpath("//li[@value='"+getTestDataValue(registrationclass_path, "valid_State")+"']")));
        enterText(cktPaymentBillingPostalCodeVal , getTestDataValue(registrationclass_path, "valid_Postal_Code"));
        clickElementAction(cktPaymentBillingCountryVal);
        clickElementAction(driver.findElement(By.xpath("//li[@value='"+getTestDataValue(registrationclass_path, "valid_Country")+"']")));
        enterText(cktPaymentBillingPhoneNumVal , getTestDataValue(registrationclass_path, "valid_PhoneNumber"));
        // clickElementAction(cktShippingSaveAddressTxt);
    }

    public void validatePaymentSaveButton(){
        Assert.assertTrue(cktPaymentSaveTxt.isDisplayed());
    }

    public void clickAddNewCardLink(){
        waitFor(10000);
        clickElementAction(cktPaymentAddNewCardTxt);
    }

    public void validateCreditCardDetails(){
        Assert.assertEquals("Card number".trim(), cktPaymentCardNumberTxt.getText());
        Assert.assertEquals("MM/YY".trim(), cktPaymentExpTxt.getText());
        Assert.assertEquals("CVV".trim(), cktPaymentCVVTxt.getText());
    }

    public void clickPlaceOrderButton(){
        waitFor(5000);
        clickElementAction(cktPlaceOrderTxt);
    }

    public void validateOrderConfirmPage(){
        waitFor(5000);
        Assert.assertEquals("Your order is confirmed.".trim(), cktOrderConfirmTxt.getText());
    }

    public void enterValidCreditCardDetails(){
        waitFor(5000);
        clickElementAction(cktCreditCardNumber);
        driver.switchTo().frame(cktCreditCardNumberFrame);
        enterText(cktCreditCardNumberVal, getTestDataValue(registrationclass_path, "valid_CardNumber"));
        driver.switchTo().defaultContent();


        enterText(cktCreditCardExpiryVal, getTestDataValue(registrationclass_path, "valid_Exp_Date"));
        enterText(cktCreditCardExpiryVal, getTestDataValue(registrationclass_path, "s-cc-card-cvc"));

        // driver.switchTo().defaultContent();
//        enterText(cktPaymentCardNumberVal , getTestDataValue(registrationclass_path, "valid_Card_Number"));
//        enterText(cktPaymentExpVal , getTestDataValue(registrationclass_path, "valid_Exp_Date"));
//        enterText(cktPaymentCVVVal , getTestDataValue(registrationclass_path, "valid_CVV"));

    }

    public void selectCreditCardDetails(){
        waitFor(5000);
        clickElementAction(cktCreditCardDetails);
    }

    public void enterInvalidCreditCardDetails(){
        enterText(cktPaymentCardNumberVal , getTestDataValue(registrationclass_path, "bi_First_Name"));
    }

    public void validateAccountSection(){
        Assert.assertEquals("Enter email".trim(), cktAccountEnterEmailTxt.getText());
        Assert.assertEquals("Have an account?".trim(), cktAccountHaveAnAccountTxt.getText());
        Assert.assertEquals("Sign in".trim(), cktAccountSignInLink.getText());
        Assert.assertTrue(cktThisIsGiftRadioBtn.isDisplayed());
        Assert.assertEquals("Email".trim(), cktEmailLabel.getText());
        Assert.assertTrue(cktEmailInput.isEnabled());
        Assert.assertTrue(cktNextButton.isDisplayed());
    }

    public void validateGiftSection(){
        Assert.assertEquals("This is a gift".trim(), cktThisIsGiftTxt.getText());
        Assert.assertEquals("Creating an account makes managing your filter auto-refills easier.".trim(), cktCreateAccountDesc.getText());
    }
    public void validateAccountNumberAndColor(){
        String color = cktAccountEnterEmailNumber.getCssValue("background");
        System.out.println("Method color" +color);
    }

    public void clickSignInLink(){
        waitFor(7000);
        cktAccountSignInLink.click();
        // clickButton(cktAccountSignInLink);
    }

    public void validateSignInFields(){
        Assert.assertEquals("Email".trim(), cktEmailLabel.getText());
        Assert.assertEquals("Password".trim(), cktPasswordLabel.getText());
        Assert.assertTrue(cktEmailInput.isDisplayed());
        Assert.assertTrue(cktPasswordInput.isDisplayed());
    }

    public void validateEmailPasswordFields(){
        enterText(cktEmailInput , "");
        clickElementAction(cktPasswordInput);
        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])"))));

        enterText(cktEmailInput , getTestDataValue(registrationclass_path, "invalid_Account_Mail"));
        clickElementAction(cktPasswordInput);
        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Please enter a valid email address')])"))));

        clearValue(cktEmailInput);
        enterText(cktEmailInput , getTestDataValue(registrationclass_path, "valid_Account_Mail"));
        enterText(cktPasswordInput , "");
        clickElementAction(cktEmailInput);
        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Please enter a valid email address')])"))));

        enterText(cktPasswordInput , getTestDataValue(registrationclass_path, "invalid_Password"));
        clickElementAction(cktNextButton);
        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Incorrect username or password.')])"))));
    }

    public void enterRegisteredMail(){
        enterText(cktEmailInput , getTestDataValue(registrationclass_path, "valid_Account_Mail"));
    }

    public void validateRegisteredUserSignMessage(){
        Assert.assertEquals("Sign in".trim(), cktRegisteredUserSignInLink.getText());
        Assert.assertEquals("for easy checkout, or click next to purchase without signing in.".trim(), cktRegisteredUserContent.getText());
    }

    public void registeredUserWithoutSignIn(){
        enterText(cktEmailInput , getTestDataValue(registrationclass_path, "valid_Account_Mail"));
        clickElementAction(cktNextButton);
    }

    public void validateShippingAndPaymentSection(){
        //Assert.assertTrue(shippingDetails.isDisplayed());
    }

    public void validateEmailEnability(){
        Assert.assertFalse(cktEmailInput.isEnabled());
    }

    public void clickMailEditLink(){
        clickElementAction(cktAccountEditLink);
    }

    public void validateEmailEnable(){
        Assert.assertTrue(cktEmailInput.isEnabled());
    }

    public void validateAcceptTermsDetails(){
        Assert.assertEquals("Accept our".trim(), cktAccountAcceptOurTxt.getText());
        Assert.assertEquals("terms of service".trim(), cktAccountTermsOfServiceLink.getText());
        Assert.assertEquals("privacy policy".trim(), cktAccountPrivacyPolicyLink.getText());
        Assert.assertEquals("auto-refill terms.".trim(), cktAccountAutoRefillsTermsLink.getText());
    }

    public void validateNextButtonDisabled(){
        Assert.assertFalse(cktNextButton.isEnabled());
    }

    public void validateAccountCheckMark(){
        // Assert.assertTrue(checkmark.isDisplayed());
    }

    public void clickAccountEditButton(){
        Assert.assertTrue(cktAccountEditLink.isDisplayed());
        clickElementAction(cktAccountEditLink);
    }

    public void validateFieldsInEnableState(){
        Assert.assertTrue(cktEmailInput.isEnabled());
        Assert.assertTrue(cktPasswordInput.isEnabled());
    }

    public void validateCheckoutLink(){
        Assert.assertEquals("Checkout".trim(), cktAccountCheckoutLink.getText());
        Assert.assertEquals("New customer?".trim(), cktAccountNewCustomerTxt.getText());
    }

    public void validateWelcomeBackText(){
        Assert.assertEquals("Welcome back.".trim(), cktAccountWelcomeBackTxt.getText());
    }

    public void clickForgotMyPassword(){
        clickElementAction(cktForgotMyPasswordLink);
    }

    public void clickAccountCheckoutLink(){
        clickElementAction(cktAccountCheckoutLink);
    }

    public void validateNextButtonEnable(){
        Assert.assertTrue(cktNextButton.isEnabled());
    }

    public void clickNextButton(){
        clickElementAction(cktNextButton);
    }

    public void validateShippingInfoSection() {
        Assert.assertEquals("Shipping Info".trim(), cktPaymentTitle.getText());
        String color = cktPaymentTitleNumber.getCssValue("background");
        System.out.println("Method color" +color);
    }

    public void clickSignOutButton(){
        clickElementAction(cktSignOutLink);
    }

    public void validateThisIsGiftRadioSelected(){
        Assert.assertTrue(cktThisIsGiftRadioBtn.isSelected());
    }

    public void deselectThisIsGiftRadio(){
        if(cktThisIsGiftRadioBtn.isSelected()){
            clickElementAction(cktThisIsGiftRadioBtn);
        }
    }

    public void validateThisIsGiftRadioDeSelected(){
        Assert.assertFalse(cktThisIsGiftRadioBtn.isSelected());
    }

    public void enterShippingInformation(){
//        enterText(accRegpaymtbilladdfirstname , getTestDataValue(registrationclass_path, "bi_First_Name"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtBilladdfirstname , getTestDataValue(registrationclass_path, "bi_Last_Name"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtbilladdaddress1 , getTestDataValue(registrationclass_path, "bi_Street_Address1"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtbilladdaddress2 , getTestDataValue(registrationclass_path, "bi_Street_Address2"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtbilladdcity , getTestDataValue(registrationclass_path, "bi_City"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtbilladdpostal , getTestDataValue(registrationclass_path, "bi_Postal_Code"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        enterText(accRegpaymtbilladdphone , getTestDataValue(registrationclass_path, "bi_PhoneNumber"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        SelectByValue(accRegpaymtbilladdcountry, getTestDataValue(registrationclass_path, "bi_Country"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
//        SelectByValue(accRegpaymtbilladdstate, getTestDataValue(registrationclass_path, "bi_State"));
//        clickButton(accRegpaymtBusinesReferences);
//        Assert.assertTrue(isElementDisplayed(driver.findElements(By.xpath("(//p[contains(text(),'Required')])[1]"))));
    }

    //Smoke Test

    public void clickAccountButton() {
        waitFor(3000);
        clickElementAction(accMgmtAccountBtn);
        waitFor(3000);
    }

    public void validateSignInPage() {
        Assert.assertTrue(accMgmtWelcomeMolekuleTxt.isDisplayed());
        waitVisibilityOfElement(accMgmtAccountDescTxt);
        Assert.assertEquals("Please enter a valid email address".trim(), accMgmtAccountDescTxt.getText());
        Assert.assertEquals("Email address".trim(), accMgmtAccountEmailTxt.getText());
        Assert.assertEquals("Password".trim(), accMgmtAccountPasswordTxt.getText());
        Assert.assertEquals("Sign in".trim(), accMgmtAccountSignInBtn.getText());
        Assert.assertEquals("Forgot Password?".trim(), accMgmtForgotPwdLink.getText());
        Assert.assertEquals("Register a new account".trim(), accMgmtAccountRegisterLink.getText());
        Assert.assertEquals("Not a business customer? Go to our consumer site.".trim(), accMgmtAccountConsumerSiteTxt.getText());
        Assert.assertTrue(accMgmtAccountEmailVal.isDisplayed());
        Assert.assertTrue(accMgmtAccountPasswordVal.isDisplayed());
    }

    public void verifyHeaderSection() {
        waitFor(6000);
        waitVisibilityOfElement(accMgmtUserNameTxt);
        Assert.assertTrue(accMgmtUserNameTxt.isDisplayed());
    }

    public void validateOrderSummaryGiftText(){
        waitFor(5000);
        Assert.assertTrue(cktOrderSummaryGiftTxt.isDisplayed());
        Assert.assertEquals("This is a gift".trim(), cktOrderSummaryGiftTxt.getText());
        Assert.assertTrue(cktOrderSummaryGiftImg.isDisplayed());
    }

    public void validateSideCart(){
        waitFor(10000);
        clickElementAction(cartPlusIcon);
        waitFor(7000);

        //Cart Quantity Value
        String stringValue = cartQuantityVal.getAttribute("aria-label");
        int values  = Integer.parseInt(stringValue.substring(stringValue.length()-1));

        //Cart Product Price for Single product
        String cartOneQuantityAmount = cartOneQuantityPrice.getText().replace("$","");
        double priceValue = Double.parseDouble(cartOneQuantityAmount);

        // Cart added quantity price calculation
        double finalPrice = priceValue*values;

        // Cart added quantity price in screen
        String cartAddedQuantityAmount = cartAddedQuantityPrice.getText().replace("$","");
        double addedQuantityPrice = Double.parseDouble(cartAddedQuantityAmount);

        Assert.assertEquals(finalPrice, addedQuantityPrice, priceValue);
    }

    public void checkUpdateProductQuantity(){
        addOneProductToCart();
        waitFor(5000);
        Assert.assertTrue("Product not Added  successfully",cktProductOne_Quantity1.isDisplayed());
        clickElementAction(cktProductOne_IncreaseQuantity1);
        waitFor(2000);
        Assert.assertTrue("Quantity increase not working ",cktProductOne_Quantity2.isDisplayed());
        clickElementAction(cktProductOne_DecreaseQuantity1);
        waitFor(2000);
        Assert.assertTrue("Quantity decrease not working ",cktProductOne_Quantity1.isDisplayed());
        removeAllProductsInCart();
    }

    public void addAllProductsToCart(){
        waitFor(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//button[@aria-label = 'add the product to cart']"));
        for (int i=0; i<elements.size();i++){
            clickElementAction(elements.get(i));
            waitFor(3000);
        }
    }

    public void VerifyProductTitleInCart(){
        waitFor(5000);
        ArrayList<String> titles = new ArrayList<String>();
        List<WebElement> elements = driver.findElements(By.xpath("//h4"));
        Assert.assertTrue("Count of the products is incorrect in cart",elements.size()==4);
        for (int i=0; i<=elements.size()-1;i++){
            titles.add(elements.get(i).getText());
            waitFor(3000);
        }
        if(titles.contains("Molekule Air Mini")&& titles.contains("Molekule Air Mini+")&& titles.contains("Air Mini")&&titles.contains("Air Mini + ")){
            logger.info("Product titles displayed properly in Cart");
        }else{
            Assert.fail("Product titles mismatch in cart");
        }
    }

    public void removeAllProductFromCart(){
        try{
            clickButton(cktCartIcon_Header);
            waitFor(3000);
        }catch(Exception e){
        }
        removeAllProductsInCart();
    }


    public void removeAllProductsInCart(){
        waitFor(5000);
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='flex w-full flex-col']//button[@aria-label = 'Close']"));
            for (int i = 1; i <= elements.size() - 1; i++) {
                clickElementAction(elements.get(i));
                waitFor(3000);
            }
        }catch(Exception e){
        }
    }

    public void addOneProductToCart(){
        waitFor(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//button[@aria-label = 'add the product to cart']"));
        for (int i=0; i<elements.size();i++){
            clickElementAction(elements.get(i));
            waitFor(3000);
            break;
        }
    }

    public void checkPriceChangeOnProductUpdate_Minicart(){
        waitFor(5000);
        Assert.assertTrue("Product not Added successfully",cktProductOne_Quantity1.isDisplayed());
        String BFprice=cktProductPrice1_Mcart.getText().replaceAll("[^0-9]","");
        System.out.println(BFprice);
        int beforeprice=Integer.parseInt(BFprice);
        clickElementAction(cktProductOne_IncreaseQuantity1);
        waitFor(6000);
        Assert.assertTrue("Quantity increase not working",cktProductOne_Quantity2.isDisplayed());
        String AFprice=cktProductPrice1_Mcart.getText().replaceAll("[^0-9]","");
        int afterprice=Integer.parseInt(AFprice);
        Assert.assertTrue("Total price is not correct",afterprice==beforeprice*2);
        clickElementAction(cktProductOne_DecreaseQuantity1);
        waitFor(2000);
    }

    public void clickEditCartInOrderSummary(){
        waitFor(10000);
        clickButton(cktEditCartLink_SummaryPage);
        waitFor(3000);
    }

    public void checkPriceChangeOnProductUpdate_Fullcart(){
        waitFor(5000);
        String Quantity=cktProductOne_FQuantity.getAttribute("aria-label");
        System.out.println(Quantity);
        Assert.assertTrue("Product not Added successfully",Quantity.equals("total number of units 1"));
        String BFprice=cktProductPrice1_FCart.getText().replaceAll("[^0-9]","");

        int beforeprice=Integer.parseInt(BFprice);
        clickElementAction(cktProductOneFullCart_IncreaseQuantity1);
        waitFor(5000);
        String Quantity2=cktProductTwo_FQuantity.getAttribute("aria-label");
        System.out.println(Quantity2);
        Assert.assertTrue("Quantity increase not working",Quantity2.equals("total number of units 2"));
        String AFprice=cktProductPrice1_FCart.getText().replaceAll("[^0-9]","");
        int afterprice=Integer.parseInt(AFprice);
        Assert.assertTrue("Total price is not correct",afterprice==beforeprice*2);

    }
    public void selectShippingaddressfromList(){
        waitFor(17000);
        clickButton(cktShippingAddress1list);
    }
    public void validateAlldetailsinShippingMethod(){
        Assert.assertTrue(cktPreorderConfirmationmsg.isDisplayed());
        Assert.assertTrue(cktShippingSMethodVal1.isDisplayed());
        Assert.assertTrue(cktShippingSMethodVal2.isDisplayed());
        Assert.assertTrue(cktShippingSMethodVal3.isDisplayed());
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFreight));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFreightDays));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFreightprice));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeGround));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeGroundDays));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeGroundprice));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFedEx2Day));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFedEx2DayDays));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeFedEx2Dayprice));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeOvernight));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeOvernightDays));
        Assert.assertTrue(isElementDisplayed(cktShippingMethodtypeOvernightprice));

    }
    public void verityShippinginfoSection(){
    Assert.assertTrue(cktShippingInfocheckbox.isSelected());
    }
    public void verityShippingMethodSection(){
        Assert.assertTrue(cktShippingmethodcheckbox.isSelected());
    }
}
