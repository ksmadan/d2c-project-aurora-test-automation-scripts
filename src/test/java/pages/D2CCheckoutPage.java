package pages;

import base.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class D2CCheckoutPage extends GenericWrappers {

    public D2CCheckoutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "email")
    public static WebElement accMgmtAccountEmailVal;
    @FindBy(how = How.ID, using = "password")
    public static WebElement accMgmtAccountPasswordVal;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Sign in')]")
    public static WebElement accMgmtAccountSignInBtn;
    @FindBy(how = How.ID, using = "accMgmt_account_btn")
    public static WebElement accMgmtAccountBtn;

    @FindBy(how = How.XPATH, using = "//button/span[contains(text(), 'Get Molekule Air Pro')]")
    public static WebElement cktMolekuleAirProBtn;
    @FindBy(how = How.XPATH, using = "//button/span[text() = 'Get Molekule Air Mini']")
    public static WebElement cktMolekuleAirMiniBtn;
    @FindBy(how = How.XPATH, using = "//button/span[contains(text(), 'Checkout')]")
    public static WebElement cktCheckoutButton;
    @FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Checkout')]")
    public static WebElement cktTitle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Enter email')]")
    public static WebElement cktEnterMailTxt;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Order summary')]")
    public static WebElement cktOrderSummaryTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Account')]")
    public static WebElement cktAccountTitle;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Shipping Info')]")
    public static WebElement cktShippingInfoTitle;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Shipping Info')]/preceding-sibling::span")
    public static WebElement cktShippingInfoTitleNumber;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Shipping method')]")
    public static WebElement cktShippingMethodTitle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Shipping method')]/preceding-sibling::span")
    public static WebElement cktShippingMethodTitleNumber;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Payment')]")
    public static WebElement cktPaymentTitle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Payment')]/preceding-sibling::span")
    public static WebElement cktPaymentTitleNumber;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Sign Out')]")
    public static WebElement cktSignOutLink;

    //Account
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'This is a gift')]")
    public static WebElement cktThisIsGiftTxt;
    @FindBy(how = How.XPATH, using = "//input[@aria-label = 'This is a gift']")
    public static WebElement cktThisIsGiftRadioBtn;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Creating an account makes managing your filter auto-refills easier.')]")
    public static WebElement cktCreateAccountDesc;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Email')]/preceding-sibling::input")
    public static WebElement cktEmailInput;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Email')]")
    public static WebElement cktEmailLabel;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Accept our')]/preceding-sibling::input")
    public static WebElement cktAcceptTermsRadioBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Next')]")
    public static WebElement cktNextButton;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Password')]/preceding-sibling::input")
    public static WebElement cktPasswordInput;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Password')]")
    public static WebElement cktPasswordLabel;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'I forgot my password')]")
    public static WebElement cktForgotMyPasswordLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Account')]/following::a")
    public static WebElement cktAccountEditLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Enter email')]")
    public static WebElement cktAccountEnterEmailTxt;
    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'Have an account?')]")
    public static WebElement cktAccountHaveAnAccountTxt;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Sign in')]")
    public static WebElement cktAccountSignInLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Enter email')]/preceding-sibling::span")
    public static WebElement cktAccountEnterEmailNumber;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Checkout')]")
    public static WebElement cktAccountCheckoutLink;
    @FindBy(how = How.XPATH, using = "//p/a[contains(text(), 'Sign in')]")
    public static WebElement cktRegisteredUserSignInLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'for easy checkout, or click next to purchase without signing in.')]")
    public static WebElement cktRegisteredUserContent;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Accept our')]")
    public static WebElement cktAccountAcceptOurTxt;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'terms of service')]")
    public static WebElement cktAccountTermsOfServiceLink;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'privacy policy')]")
    public static WebElement cktAccountPrivacyPolicyLink;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'auto-refill terms.')]")
    public static WebElement cktAccountAutoRefillsTermsLink;
    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'New customer?')]")
    public static WebElement cktAccountNewCustomerTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Welcome back.')]")
    public static WebElement cktAccountWelcomeBackTxt;

    //Shipping Info
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Add new address')]")
    public static WebElement cktAddNewAddressTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Add new address')]/preceding-sibling::img")
    public static WebElement cktAddNewAddressPlusIcon;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'This is a business address.')]")
    public static WebElement cktThisIsBusinessAddressTxt;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'This is a business address.')]/preceding-sibling::input")
    public static WebElement cktThisIsBusinessAddressRadioBtn;
    @FindBy(how = How.ID, using = "company_name")
    public static WebElement cktShippingCompanyNameVal;
    @FindBy(how = How.ID, using = "checkout_shipping_formfirst_name")
    public static WebElement cktShippingFirstNameVal;
    @FindBy(how = How.ID, using = "checkout_shipping_formlast_name")
    public static WebElement cktShippingLastNameVal;
    @FindBy(how = How.ID, using = "checkout_shipping_formaddress_1")
    public static WebElement cktShippingAddressVal1;
    @FindBy(how = How.ID, using = "checkout_shipping_formaddress_2")
    public static WebElement cktShippingAddressVal2;
    @FindBy(how = How.ID, using = "checkout_shipping_formcity")
    public static WebElement cktShippingCityVal;
    @FindBy(how = How.NAME, using = "checkout_shipping_formstate")
    public static WebElement cktShippingStateVal;
    @FindBy(how = How.ID, using = "checkout_shipping_formpostal_code")
    public static WebElement cktShippingPostalCodeVal;
    @FindBy(how = How.NAME, using = "checkout_shipping_formcountry")
    public static WebElement cktShippingCountryVal;
    @FindBy(how = How.ID, using = "checkout_shipping_formphone_number")
    public static WebElement cktShippingPhoneNumVal;

    @FindBy(how = How.ID, using = "lblcompany_name")
    public static WebElement cktShippingCompanyNameTxt;
    @FindBy(how = How.ID, using = "lblfirst_name")
    public static WebElement cktShippingFirstNameTxt;
    @FindBy(how = How.ID, using = "lbllast_name")
    public static WebElement cktShippingLastNameTxt;
    @FindBy(how = How.ID, using = "lbladdress_1")
    public static WebElement cktShippingAddressTxt1;
    @FindBy(how = How.ID, using = "lbladdress_2")
    public static WebElement cktShippingAddressTxt2;
    @FindBy(how = How.ID, using = "lblcity")
    public static WebElement cktShippingCityTxt;
    @FindBy(how = How.ID, using = "lbl_state")
    public static WebElement cktShippingStateTxt;
    @FindBy(how = How.ID, using = "lblpostal_code")
    public static WebElement cktShippingPostalCodeTxt;
    @FindBy(how = How.ID, using = "lbl_country")
    public static WebElement cktShippingCountryTxt;
    @FindBy(how = How.ID, using = "lblphone_number")
    public static WebElement cktShippingPhoneNumTxt;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save address')]")
    public static WebElement cktShippingSaveAddressTxt;
    @FindBy(how = How.XPATH, using = "//span[text() = 'Save']")
    public static WebElement cktShippingSaveTxt;
    @FindBy(how = How.XPATH, using = "//span[text() = 'Save']/parent::button")
    public static WebElement cktShippingSaveButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Shipping Info')]/following::a[1]")
    public static WebElement cktShippingInfoEditLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'saranya Arumugam')]")
    public static WebElement cktShippingDetailVal1;

    // Recipient Info
    @FindBy(how = How.XPATH, using = "//label[contains(text(), '\"Recipient’s email\"')]/preceding-sibling::input")
    public static WebElement cktRecipientInfoEmailVal;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), '\"Recipient’s email\"')]")
    public static WebElement cktRecipientInfoEmailTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), '\"They’ll receive a gift receipt with tracking once the order ships.\"')]")
    public static WebElement cktRecipientReceiveGiftTxt;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), '\"Recipient’s info\"')]")
    public static WebElement cktRecipientInfoTitle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Add new address')]/following::div[@aria-required = 'true']")
    public static WebElement cktSavedShippingAddress;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Add new address')]/following::div[@aria-required = 'true'][1]")
    public static WebElement cktSavedShippingAddressVal1;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), '\"Recipient’s info\"')]/following::a")
    public static WebElement cktRecipientInfoEditLink;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Make it personal.')]")
    public static WebElement cktRecipientMakePersonalTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Gift message (optional)')]")
    public static WebElement cktRecipientGiftMessageTxt;
    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Gift message (optional)')]/preceding-sibling::input")
    public static WebElement cktRecipientGiftMessageVal;





    //Shipping Method
    @FindBy(how = How.ID, using = "list0")
    public static WebElement cktPreorderConfirmationmsg;
    @FindBy(how = How.ID, using = "list0")
    public static WebElement cktShippingSMethodVal1;
    @FindBy(how = How.ID, using = "list1")
    public static WebElement cktShippingSMethodVal2;
    @FindBy(how = How.ID, using = "list2")
    public static WebElement cktShippingSMethodVal3;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Shipping method')]/following::a")
    public static WebElement cktShippingMethodEditLink;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Freight']")
    public static WebElement cktShippingMethodtypeFreight;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Freight']//following-sibling::span[1]")
    public static WebElement cktShippingMethodtypeFreightDays;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Freight']//following-sibling::span[2]")
    public static WebElement cktShippingMethodtypeFreightprice;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Ground']")
    public static WebElement cktShippingMethodtypeGround;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Ground']//following-sibling::span[1]")
    public static WebElement cktShippingMethodtypeGroundDays;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Ground']//following-sibling::span[2]")
    public static WebElement cktShippingMethodtypeGroundprice;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx 2-Day']")
    public static WebElement cktShippingMethodtypeFedEx2Day;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx 2-Day']//following-sibling::span[1]")
    public static WebElement cktShippingMethodtypeFedEx2DayDays;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx 2-Day']//following-sibling::span[2]")
    public static WebElement cktShippingMethodtypeFedEx2Dayprice;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Overnight']")
    public static WebElement cktShippingMethodtypeOvernight;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Overnight']//following-sibling::span[1]")
    public static WebElement cktShippingMethodtypeOvernightDays;
    @FindBy(how = How.XPATH, using = "//span[text()='FedEx Overnight']//following-sibling::span[2]")
    public static WebElement cktShippingMethodtypeOvernightprice;
    //Payment
    @FindBy(how = How.XPATH, using = "//input[@id = 'toogleA']/following-sibling::div[1]")
    public static WebElement cktPaymentToggle;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Add new credit card')]")
    public static WebElement cktPaymentAddNewCardTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Monthly payments')]")
    public static WebElement cktPaymentMonthlyPaymentsTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Device purchases only')]")
    public static WebElement cktPaymentDevicePurchaseTxt;
    @FindBy(how = How.NAME, using = "shipping_address")
    public static WebElement cktPaymentNewAddressVal;
    @FindBy(how = How.ID, using = "first_name")
    public static WebElement cktPaymentFirstNameVal;
    @FindBy(how = How.ID, using = "last_name")
    public static WebElement cktPaymentLastNameVal;
    @FindBy(how = How.ID, using = "address_1")
    public static WebElement cktPaymentAddressVal1;
    @FindBy(how = How.ID, using = "address_2")
    public static WebElement cktPaymentAddressVal2;
    @FindBy(how = How.ID, using = "city")
    public static WebElement cktPaymentCityVal;
    @FindBy(how = How.NAME, using = "state")
    public static WebElement cktPaymentStateVal;
    @FindBy(how = How.ID, using = "postal_code")
    public static WebElement cktPaymentPostalCodeVal;
    @FindBy(how = How.NAME, using = "country")
    public static WebElement cktPaymentCountryVal;
    @FindBy(how = How.ID, using = "phone_number")
    public static WebElement cktPaymentPhoneNumVal;
    @FindBy(how = How.XPATH, using = "//span[text() = 'Save']")
    public static WebElement cktPaymentSaveTxt;
    @FindBy(how = How.NAME, using = "cardnumber")
    public static WebElement cktPaymentCardNumberVal;
    @FindBy(how = How.NAME, using = "exp-date")
    public static WebElement cktPaymentExpVal;
    @FindBy(how = How.ID, using = "cvc")
    public static WebElement cktPaymentCVVVal;


    @FindBy(how = How.XPATH, using = "//label[@for = 's-cc-card-number']")
    public static WebElement cktPaymentCardNumberTxt;
    @FindBy(how = How.XPATH, using = "//label[@for = 's-cc-card-expiry']")
    public static WebElement cktPaymentExpTxt;
    @FindBy(how = How.XPATH, using = "//label[@for = 's-cc-card-cvc']")
    public static WebElement cktPaymentCVVTxt;

    @FindBy(how = How.ID, using = "s-cc-card-number")
    public static WebElement cktCreditCardNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"s-cc-card-number\"]/div/iframe")
    public static WebElement cktCreditCardNumberFrame;
    @FindBy(how = How.XPATH, using = "//span[@class = 'InputContainer']/input[@name = 'cardnumber']")
    public static WebElement cktCreditCardNumberVal;

    @FindBy(how = How.ID, using = "s-cc-card-expiry")
    public static WebElement cktCreditCardExpiryVal;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'visa')]")
    public static WebElement cktCreditCardDetails;



    // Billing Address

    @FindBy(how = How.NAME, using = "shipping_address")
    public static WebElement cktPaymentBillingNewAddressVal;
    @FindBy(how = How.ID, using = "checkout_billing_formfirst_name")
    public static WebElement cktPaymentBillingFirstNameVal;
    @FindBy(how = How.ID, using = "checkout_billing_formlast_name")
    public static WebElement cktPaymentBillingLastNameVal;
    @FindBy(how = How.ID, using = "checkout_billing_formaddress_1")
    public static WebElement cktPaymentBillingAddressVal1;
    @FindBy(how = How.ID, using = "checkout_billing_formaddress_2")
    public static WebElement cktPaymentBillingAddressVal2;
    @FindBy(how = How.ID, using = "checkout_billing_formcity")
    public static WebElement cktPaymentBillingCityVal;
    @FindBy(how = How.NAME, using = "checkout_billing_formstate")
    public static WebElement cktPaymentBillingStateVal;
    @FindBy(how = How.ID, using = "checkout_billing_formpostal_code")
    public static WebElement cktPaymentBillingPostalCodeVal;
    @FindBy(how = How.NAME, using = "checkout_billing_formcountry")
    public static WebElement cktPaymentBillingCountryVal;
    @FindBy(how = How.ID, using = "checkout_billing_formphone_number")
    public static WebElement cktPaymentBillingPhoneNumVal;

    @FindBy(how = How.ID, using = "lbl_shipping_address")
    public static WebElement cktPaymentBillingNewAddressTxt;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formfirst_name")
    public static WebElement cktPaymentBillingFirstNameTxt;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formlast_name")
    public static WebElement cktPaymentBillingLastNameTxt;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formaddress_1")
    public static WebElement cktPaymentBillingAddressTxt1;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formaddress_2")
    public static WebElement cktPaymentBillingAddressTxt2;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formcity")
    public static WebElement cktPaymentBillingCityTxt;
    @FindBy(how = How.ID, using = "lbl_checkout_billing_formstate")
    public static WebElement cktPaymentBillingStateTxt;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formpostal_code")
    public static WebElement cktPaymentBillingPostalCodeTxt;
    @FindBy(how = How.ID, using = "lbl_checkout_billing_formcountry")
    public static WebElement cktPaymentBillingCountryTxt;
    @FindBy(how = How.ID, using = "lblcheckout_billing_formphone_number")
    public static WebElement cktPaymentBillingPhoneNumTxt;


    //Order Summary
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Subtotal')]")
    public static WebElement cktSubtotalTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Shipping']")
    public static WebElement cktShippingTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Tax']")
    public static WebElement cktTaxTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Discount']")
    public static WebElement cktDiscountTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Promo code']")
    public static WebElement cktPromoCodeTxt;
    @FindBy(how = How.XPATH, using = "//p[text() = 'Order total']")
    public static WebElement cktOrderTotalTxt;
    @FindBy(how = How.ID, using = "//p[text() = 'addpromo']")
    public static WebElement cktAddPromoPlusIcon;
    @FindBy(how = How.XPATH, using = "//span[text() = 'Place order']")
    public static WebElement cktPlaceOrderTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'This is a gift')]")
    public static WebElement cktOrderSummaryGiftTxt;
    @FindBy(how = How.XPATH, using = "//p/following-sibling::div[@aria-label = 'gift_name']/img")
    public static WebElement cktOrderSummaryGiftImg;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Your order is confirmed.')]")
    public static WebElement cktOrderConfirmTxt;




    //Smoke test

    @FindBy(how = How.ID, using = "accMgmt_welcome_molekule_txt")
    public static WebElement accMgmtWelcomeMolekuleTxt;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Please enter a valid email address')]")
    public static WebElement accMgmtAccountDescTxt;

    @FindBy(how = How.ID, using = "lblemail")
    public static WebElement accMgmtAccountEmailTxt;

    @FindBy(how = How.ID, using = "lblpassword")
    public static WebElement accMgmtAccountPasswordTxt;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Register a new account')]")
    public static WebElement accMgmtAccountRegisterLink;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Not a business customer? Go to our consumer site.')]")
    public static WebElement accMgmtAccountConsumerSiteTxt;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Forgot Password?')]")
    public static WebElement accMgmtForgotPwdLink;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Hi,')]")
    public static WebElement accMgmtUserNameTxt;

    @FindBy(how = How.NAME, using = "side_cart_qty")
    public static WebElement cartQuantityVal;

    @FindBy(how = How.XPATH, using = "//input[@name = 'side_cart_qty']/following::button[1]")
    public static WebElement cartPlusIcon;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__layout\"]/div/div[3]/section/div/div[2]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[1]/div/div[2]")
    public static WebElement cartAddedQuantityPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div[2]/div/div[1]/div[1]/div[3]/p/span")
    public static WebElement cartOneQuantityPrice;

    @FindBy(how = How.XPATH, using = "//*[@id='main']/div/div[2]/div")
    public static WebElement cktAddProductContainer;
    @FindBy(how = How.XPATH, using = "//button[@aria-label = 'add the product to cart']")
    public static WebElement cktAddProductBtn;
    @FindBy(how = How.XPATH, using = "//div[@class='flex w-full flex-col']//button[@aria-label = 'Close']")
    public static WebElement cktCloseBtns_Cart;
    @FindBy(how = How.XPATH, using = "//div[1]/div[3]/div/div[1]/div[2]/div[3]")
    public static WebElement cktProductOne_Quantity;
    @FindBy(how = How.XPATH, using = "//*[@aria-label = 'Total number of units 1 dropdown']")
    public static WebElement cktProductOne_Quantity1;
    @FindBy(how = How.XPATH, using = "//*[@aria-label = 'Total number of units 2 dropdown']")
    public static WebElement cktProductOne_Quantity2;
    @FindBy(how = How.XPATH, using = "//button[@aria-label = 'side_cart_qty Increase quantity by one']")
    public static WebElement cktProductOne_IncreaseQuantity1;
    @FindBy(how = How.XPATH, using = "//button[@aria-label = 'side_cart_qty Decrease quantity by one ']")
    public static WebElement cktProductOne_DecreaseQuantity1;
    @FindBy(how = How.XPATH, using = "//button[@title='cart bag']")
    public static WebElement cktCartIcon_Header;
    @FindBy(how = How.XPATH, using = "//div[3]/div/div[1]/div[2]/div[1]/div/div[2]")
    public static WebElement cktProductPrice1_Mcart;

    // Full Cart

    @FindBy(how = How.XPATH, using = "//input[@name= 'full_cart_mobile_qty']")
    public static WebElement cktProductOne_FQuantity;
    @FindBy(how = How.XPATH, using = "//div[2]/div[1]/div[2]/div/div/span/div/div/input")
    public static WebElement cktProductTwo_FQuantity;
    @FindBy(how = How.XPATH, using = "//div[2]/div[1]/div[2]/div/button[2]")
    public static WebElement cktProductOneFullCart_IncreaseQuantity1;
    @FindBy(how = How.XPATH, using = "//div[2]/div/div[1]/div[2]/div[1]/div[2]/div/button[1]")
    public static WebElement cktProductOneFullCart_DecreaseQuantity1;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div[1]/div[2]/div[1]/div[3]/span")
    public static WebElement cktProductPrice1_FCart;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Order summary')]/following-sibling::p[contains(text(),'Edit cart')]")
    public static WebElement cktEditCartLink_SummaryPage;

    @FindBy(how = How.XPATH, using = "//span/div[1]/span/div/div[1]")
    public static WebElement cktShippingAddress1list;
    @FindBy(how = How.XPATH, using = "//div[2]/div[1]/div[1]/label/input")
    public static WebElement cktShippingInfocheckbox;
    @FindBy(how = How.XPATH, using = "//div[3]/div[1]/div[1]/label/input")
    public static WebElement cktShippingmethodcheckbox;



}
