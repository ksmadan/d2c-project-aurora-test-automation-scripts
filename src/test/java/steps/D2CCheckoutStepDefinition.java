package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import featureLibrary.D2CCheckoutLibrary;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.io.File;

public class D2CCheckoutStepDefinition extends D2CCheckoutLibrary {

    @Given("^user validate Checkout page$")
    public void userValidateCheckoutPage() {
        System.out.println("Before def");
        validateCheckoutPage();
    }

    @Given("^user enters account details in Checkout$")
    public void userEntersAccountDetailsInCheckout() {
        userAccountSignIn();
    }

    @Given("^user navigate to D2C page$")
    public void userNavigateToDCPage() {
        navigateTOD2CPage();
    }

    @When("^user click on product in D2C page$")
    public void userClickOnProductInDCPage() {
        clickOnProduct();
    }

    @Then("^user should see Checkout button$")
    public void userShouldSeeCheckoutButton() {
        validateCheckoutButton();

    }

    @And("^user click on Checkout button$")
    public void userClickOnCheckoutButton() {
        clickOnCheckoutButton();
    }

    @When("^user click on Add new Shipping address$")
    public void userClickOnAddNewShippingAddress() {
        clickAddNewAddress();
    }

    @Then("^user validates all the fields in Shipping section$")
    public void userValidatesAllTheFieldsInShippingSection() {
        validateShippingAddressFields();
    }

    @When("^user click on This is a business address radio button$")
    public void userClickOnThisIsABusinessAddressRadioButton() {
        clickThisIsABusinessAddressRadioButton();
    }

    @Then("^user should see Business name field$")
    public void userShouldSeeBusinessNameOptionalField() {
        validateBusinessNameField();
    }

    @When("^user enter wrong input in name text field$")
    public void userEnterWrongInputInNameTextField() {
        enterInvalidInputInNameField();
    }

    @Then("user should see error message (.*)")
    public void userShouldSeeErrorMessage(String arg0) {  validateNotPresentErrorMessage(arg0);
        validateErrorMessage(arg0);
    }

    @When("^user enters valid details in Shipping section$")
    public void userEntersValidDetailsInShippingSection() {
        enterValidShippingAddressDetails();
    }

    @Then("^user see Save button is enabled$")
    public void userSeeSaveButtonIsEnabled() {
        validateSaveButton();
    }

    @When("^user click on Save button$")
    public void userClickOnSaveButton() {
        clickShippingSaveButton2();
    }

    @Then("^user should validate Shipping method section with number background color (.*)$")
    public void userShouldValidateShippingMethodSection(String arg0) {
        validateShippingMethodSection(arg0);
    }
    @And("^User should able to see the Shipping method section is labeled as Shipping method with a green number as three$")
    public void userShouldAbleToSeeTheShippingMethodSectionIsLabeledAsShippingMethodWithAGreenNumberAsThree() {
        waitFor(6000);
        validateShippingMethodSection();
    }
    @When("^user click on This is a gift radio button$")
    public void userClickOnThisIsAGiftRadioButton() {
        clickThisIsGiftRadio();
    }

    @Then("^user should see Recipient’s email for gift purchaser$")
    public void userShouldSeeRecipientSEmailForGiftPurchaser() {
        validateRecipientEmailField();
    }

    @Given("^user should see Shipping Info with number background color (.*)$")
    public void userShouldSeeShippingInfoWithNumberBackgroundColor(String arg0) {
        validateShippingTitle(arg0);
    }

    @When("^user enter valid account credentials$")
    public void userEnterValidAccountCredentials() {
        enterValidAccountDetails();
    }

    @Then("^user should see Recipient’s info section$")
    public void userShouldSeeRecipientSInfoSection() {
        validateRecipientInfo();
    }

    @And("^user should see saved shipping address for registered user$")
    public void userShouldSeeSavedShippingAddressForRegisteredUser() {
        validateSavedShippingAddress();
    }

    @When("^user selects Shipping address and enters Recipient email$")
    public void userSelectsShippingAddressAndEntersRecipientEmail() {
        SelectShippingAndRecipientMail();
    }

    @And("^user see the Edit button in Recipients info$")
    public void userSeeTheEditButtonInRecipientsInfo() {
        validateRecipientInfoEditLink();
    }

    @When("^user click on Edit button in Recipients info$")
    public void userClickOnEditButtonInRecipientsInfo() {
        clickRecipientInfoEdit();
    }

    @When("^user selected Shipping method and click Next button$")
    public void userSelectedShippingMethodAndClickNextButton() {
        selectShippingMethod();
    }

    @Then("^user should validate Payment section with number background color (.*)$")
    public void userShouldValidatePaymentSectionWithNumberBackgroundColor(String arg0) {
        validatePaymentSection(arg0);
    }

    @And("^user able to see toggle labeled Billing address same as shipping$")
    public void userAbleToSeeToggleLabeledBillingAddressSameAsShipping() {
        validateBillingAddressToggle();
    }

    @When("^user click on Toggle radio button in payment section$")
    public void userClickOnToggleRadioButtonInPaymentSection() {
        clickBillingAddressToggle();
    }

    @Then("^user validate Billing address fields in payment section$")
    public void userValidateBillingAddressFieldsInPaymentSection() {
        validateBillingAddressSection();
    }

    @When("^user enter values in Billing address fields in payment section$")
    public void userEnterValuesInBillingAddressFieldsInPaymentSection() {
        enterBillingAddressFields();
    }

    @Then("^user see Save button enabled in payment section$")
    public void userSeeSaveButtonEnabledInPaymentSection() {
        validatePaymentSaveButton();
    }

    @When("^user click on Add new card in payment$")
    public void userClickOnAddNewCardInPayment() {
        clickAddNewCardLink();
    }

    @Then("^user validate card details in Payment$")
    public void userValidateCardDetailsInPayment() {
        validateCreditCardDetails();
    }

    @And("^user click on PLace order in order summary$")
    public void userClickOnPLaceOrderInOrderSummary() {
        clickPlaceOrderButton();
    }

    @Then("^user should see order confirmation page$")
    public void userShouldSeeOrderConfirmationPage() {
        validateOrderConfirmPage();
    }

    @When("^user entered valid credit card details$")
    public void userEnteredValidCreditCardDetails() {
        enterValidCreditCardDetails();
    }

    @When("^user enter invalid card number$")
    public void userEnterInvalidCardNumber() {
        enterInvalidCreditCardDetails();
    }

    @When("^guest user enters the Account section of Checkout and validate account section$")
    public void guestUserEntersTheAccountSectionOfCheckoutAndValidateAccountSection() {
        validateAccountSection();
    }

    @Then("^user should validate account number and background color (.*)$")
    public void userValidateNumberAndBackgroundColor(String arg0) {
        validateAccountNumberAndColor();
    }

    @When("^user click on signin link$")
    public void userClickOnSigninLink() {
        clickSignInLink();
    }

    @Then("^user should see email and password fields$")
    public void userShouldSeeEmailAndPasswordFields() {
        validateSignInFields();
    }

    @And("^validate email and password fields$")
    public void validateEmailAndPasswordFields() {
        validateEmailPasswordFields();
    }

    @When("^user entered already registered account$")
    public void userEnteredAlreadyRegisteredAccount() {
        enterRegisteredMail();
    }

    @Then("^user should see the message as Signin for easy checkout$")
    public void userShouldSeeTheMessageAsSigninForEasyCheckout() {
        validateRegisteredUserSignMessage();
    }

    @And("^user validate gift section with sub copy$")
    public void userValidateGiftSectionWithSubCopy() {
        validateGiftSection();
    }

    @When("^the registered user continue without sign in$")
    public void theRegisteredUserContinueWithoutSignIn() {
        registeredUserWithoutSignIn();
    }

    @Then("^user should not see any saved shipping and payment information$")
    public void userShouldNotSeeAnySavedShippingAndPaymentInformation() {
        validateShippingAndPaymentSection();
    }

    @Then("^user should see email displayed in read only state$")
    public void userShouldSeeEmailDisplayedInReadOnlyState() {
        validateEmailEnability();
    }

    @When("^user click on Edit link in Mail$")
    public void userClickOnEditLinkInMail() {
        clickMailEditLink();
    }

    @Then("^user will see email section enabled$")
    public void userWillSeeEmailSectionEnabled() {
        validateEmailEnable();
    }

    @And("^user validate accept service policy and terms$")
    public void userValidateAcceptServicePolicyAndTerms() {
        validateAcceptTermsDetails();
    }

    @And("^user validate Next button default disabled$")
    public void userValidateNextButtonDefaultDisabled() {
        validateNextButtonDisabled();
    }

    @Then("^user validate checkmark near Account$")
    public void userValidateCheckmarkNearAccount() {
        validateAccountCheckMark();
    }

    @When("^user view Edit button and click on Edit$")
    public void userViewEditButtonAndClickOnEdit() {
        clickAccountEditButton();
    }

    @Then("^user should validate fields in enable state$")
    public void userShouldValidateFieldsInEnableState() {
        validateFieldsInEnableState();
    }

    @Then("^user should validate checkout and new customer content$")
    public void userShouldValidateCheckoutAndNewCustomerContent() {
        validateCheckoutLink();
    }

    @And("^user should validate gift and welcome back content$")
    public void userShouldValidateGiftAndWelcomeBackContent() {
        validateWelcomeBackText();
    }

    @When("^user click on I forgot my password$")
    public void userClickOnIForgotMyPassword() {
        clickForgotMyPassword();
    }

    @When("^user click on checkout link in Account$")
    public void userClickOnCheckoutLinkInAccount() {
        clickAccountCheckoutLink();
    }

    @Then("^user see Next button is enabled$")
    public void userSeeNextButtonIsEnabled() {
        validateNextButtonEnable();
    }

    @When("^user click on Next button$")
    public void userClickOnNextButton() {
        clickNextButton();
    }

    @Then("^user should validate Shipping Info section with number background color (.*)$")
    public void userShouldValidateShippingInfoSectionWithNumberBackgroundColor(String arg0)  {
        validateShippingInfoSection();
    }

    @When("^user click on Sign out button$")
    public void userClickOnSignOutButton() {
        clickSignOutButton();
    }

    @When("^user select This is gift in cart screen$")
    public void userSelectThisIsGiftInCartScreen() {
        clickThisIsGiftRadio();
    }

    @Then("^user validate This is gift option is selected in checkout$")
    public void userValidateThisIsGiftOptionIsSelectedInCheckout() {
        validateThisIsGiftRadioSelected();
    }

    @When("^user de-selects the This is gift radio$")
    public void userDeSelectsTheThisIsGiftRadio() {
        deselectThisIsGiftRadio();
    }

    @Then("^user should see This is gift radio is de-selected$")
    public void userShouldSeeThisIsGiftRadioIsDeSelected() {
        validateThisIsGiftRadioDeSelected();
    }

    //Smoke Test

    @Given("^user click on Account button in sign in page$")
    public void clickOnAccountButtonToSignInPage() {
        clickAccountButton();
    }

    @Then("^user validate Account sign in page$")
    public void validateAccountSignInPage() {
        validateSignInPage();
    }

    @Then("^user view the header section with user name$")
    public void userViewTheHeaderSectionWithUserName() {
        verifyHeaderSection();
    }

    @Then("^user should see This is a gift in order summary section$")
    public void userShouldSeeThisIsAGiftInOrderSummarySection() {
        validateOrderSummaryGiftText();
    }

    @And("^user add quantity and check the quantity$")
    public void userAddQuantityAndCheckTheQuantity() {
        validateSideCart();
    }

    @And("^user should update the product quantity in cart$")
    public void userShouldUpdateTheProuctQuantityInCart() {
        checkUpdateProductQuantity();
    }

    @And("^user should add all products to cart$")
    public void userShouldAddAllProductsToCart() {
        addAllProductsToCart();
    }

    @And("^verify the products added is displaying in cart$")
    public void verifyTheProductsAddedIsDisplayingInCart() {
        VerifyProductTitleInCart();
    }

    @Then("^user should remove all the products in cart$")
    public void userShouldRemoveAllTheProductsInCart() {
        removeAllProductFromCart();
    }

    @When("^user leaves blank values in textfield$")
    public void userLeavesBlankValuesInTextfield() {

    }

    @When("^user select shipping details and click save button$")
    public void userSelectShippingDetailsAndClickSaveButton() {
        selectShippingDetails();
    }

    @When("^user select the credit card details$")
    public void userSelectTheCreditCardDetails() {
        selectCreditCardDetails();
    }
    @And("^user click on Place order in order summary$")
    public void userClickOnPlaceOrderInOrderSummary() {
        clickPlaceOrderButton();
    }
    @And("^user should update the product quantity and check price changes in mini cart$")
    public void userShouldUpdateTheProductQuantityAndCheckPriceChangesInMinicart() {
        addOneProductToCart();
        checkPriceChangeOnProductUpdate_Minicart();
    }

    @And("^user click on Editcart in ordersummary page$")
    public void userClickOnEditcartInOrdersummeryPage() {
        clickEditCartInOrderSummary();
    }

    @And("^user should update the product quantity and check price changes in full cart$")
    public void userShouldUpdateTheProductQuantityAndCheckPriceChangesInFullCart() {
        checkPriceChangeOnProductUpdate_Fullcart();
    }
    @When("^user select saved shipping address from the list$")
    public void userSelectSavedShippingAddressFromTheList() {
        selectShippingaddressfromList();
    }

    @Then("^user should validate all the shipping methods with the pre-order message under shipping method$")
    public void userShouldValidateAllTheShippingMethodsWithTheOrderMessageUnderShippingMethod() {
        validateAlldetailsinShippingMethod();
    }

    @When("^user click on next button should navigate to payment tab and shipping section should be in saved state$")
    public void userClickOnNextButtonShouldNavigateToPaymentTabAndShippingSectionShouldBeInSavedState() {
        verityShippinginfoSection();
    }

    @And("^verify shipping method displayed with check-mark and edit option is working properly$")
    public void verifyShippingMethodDisplayedWithCheckMarkAndEditOptionIsWorkingProperly() {
        verityShippingMethodSection();
    }
}

