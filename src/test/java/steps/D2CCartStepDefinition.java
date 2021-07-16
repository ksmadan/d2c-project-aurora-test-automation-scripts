package steps;

import cucumber.api.java.en.*;
import featureLibrary.D2CCartLibrary;

import static pages.D2CCheckoutPage.cktProductOne_IncreaseQuantity1;


public class D2CCartStepDefinition extends D2CCartLibrary {

    @Given("user should add \"(.*)\" product in side cart via home page")
    public void usershouldaddanyoftheproductinsidecartviahomepage(String arg0) { clickProduct(arg0);

    }

    @When("user should click checkout in side cart page")
    public void usershouldclickcheckoutinsidecartpage() {
        clickcheckout();

    }

    @Then("Customer clicks on Edit cart CtA in the Order summary of Checkout")
    public void customerclicksonEditcartCtAintheOrdersummaryofCheckout() {
        clickeditcart();
    }

    @Then("^User should able see this page is labeled as  Cart$")
    public void usershouldableseethispageislabeledasCart() {
        cartTitletext();

    }

    @Then("^user able to see the Order summary section is labeled Order summary$")
    public void userabletoseetheOrdersummarysectionislabeledOrdersummary() {
        ordersummarytext();
    }

    @Then("^there is a Subtotal line item, containing the total of the products$")
    public void thereisaSubtotallineitemcontainingthetotaloftheproducts() {
        subtotaltext();

    }

    @Then("^there is a Shipping line item, containing the shipping costs calculated from the customer’s selected shipping destination$")
    public void thereisaShippinglineitemcontainingtheshippingcostscalculatedfromthecustomersselectedshippingdestination() {
        ShippingText();

    }

    @Then("^user to click on plus icon next to Promo Code$")
    public void usertoclickoniconnexttoPromoCode() {
        clickplusiconpromo();

    }

    @Then("^enter a valid promo code \"(.*)\" and click on Apply button$")
    public void enteravalidpromocodeandclickonApplybutton(String value) {
        promoinputfieldclickapply(value);

    }

    @Then("^verify that the discount is applied and reflected$")
    public void verifythatthediscountisappliedandreflectsintheOrderTotal() {
        promoplusverifyandreflected();

    }

    @Then("^click on close cta next to Promo code to see if the Promo section is collapsed and verify the order total is updated after promo code removal$")
    public void clickoniconnexttoPromocodetoseeifthePromosectioniscollapsed() {
        promocoderemovalandreflects();

    }


    @Then("^user verify if applicable, there is a label This is a gift, if the customer selected the gift option from the shopping cart$")
    public void userverifyifapplicablethereisalabelThisisagiftifthecustomerselectedthegiftoptionfromtheshoppingcart() {
    }

    @Then("^User should see there is a Proceed to checkout CtA which will direct the customer to the Checkout page, with their modified shopping cart contents$")
    public void usershouldseethereisaProceedtocheckoutCtAwhichwilldirectthecustomertotheCheckoutpagewiththeirmodifiedshoppingcartcontents() {
        clickproceedcheckout();

    }


    @When("^User have devices in their order that are associated with a Clyde subscription$")
    public void userhavedevicesintheirorderthatareassociatedwithaClydesubscription() {
        clydeiconinproducttext();

    }

    @Then("^User should be able to add / modify a Clyde extended warranty for the devices in their order$")
    public void usershouldbeabletoaddmodifyaClydeextendedwarrantyforthedevicesintheirorder() {

    }

    @When("^user validate the Clyde functionality will be displayed for added product within the Full cart page and click on the clyde cta$")
    public void uservalidatetheClydefunctionalitywillbedisplayedforeachproductwithintheFullcartpage() {
        productwithclyde();

    }


    @Then("^verify that clicking on the Clyde CtA displays the modal containing the available protection plans associated with this device$")
    public void verifythatclickingontheClydeCtAdisplaysthemodalcontainingtheavailableprotectionplansassociatedwiththisdevice() {
        clydeplanavilable();

    }

    @Then("^verify that if the customer clicks on the close CtA , or I don’t need to protect my purchase$")
    public void verifythatifthecustomerclicksonthecloseCtAorIdontneedtoprotectmypurchase() {
        clydeframeclose();

    }

    @Then("^user will be navigate to full cart page$")
    public void theywillbenavigatetofullcartpage() {
        fullcartnavigation();

    }

    @Then("^verify that user click on clyde cta shows the protection plan$")
    public void verifythatuserclickonclydectashowstheprotectionplan() {
        productwithclyde();

    }

    @Then("^user able to select Add protection plan$")
    public void userabletoviewAddprotectionplan() {
        addproductionplan();

    }

    @Then("^verify that if the customer selects any of the protection plans offered$")
    public void verifythatifthecustomerselectsanyoftheprotectionplansoffered() {
        selectedclydeplan();

    }


    @Then("^verify that the user is returned back to the full cart page$")
    public void verifythattheuserisreturnedbacktothefullcartpage() {
        fullcartpagenavigation();

    }

    @Then("^verify that the selected protection plans are reflected on their Full cart page, for that specific device they clicked on the Clyde CtA \\(the workflow is unique to device\\)$")
    public void verifythattheselectedprotectionplansarereflectedontheirFullcartpageforthatspecificdevicetheyclickedontheClydeCtAtheworkflowisuniquetodevice() {
        clydereflectionfullcart();

    }

    @Then("^verify the Clyde icon$")
    public void verifytheClydeicon() {
        clydeicon();

    }

    @Then("^verify the quantity of this extended warranty\\(Quantity default to same as product\\)$")
    public void verifythequantityofthisextendedwarrantyQuantitydefaulttosameasproduct() {
        quantityofclyde();

    }

    @Then("^verify that user is unable to add more quantity of Clyde warranty than the device quantity$")
    public void verifythatuserisunabletoaddmorequantityofClydewarrantythanthedevicequantity() {
        unabletoaddmoreclyde();

    }

    @Then("^verify that user is able to select a less quantity of Clyde warranty than the device quantity$")
    public void verifythatuserisabletoselectalessquantityofClydewarrantythanthedevicequantity() {
        selectlessqtyclyde();

    }

    @Then("^confirm the price associated with this extended warranty$")
    public void confirmthepriceassociatedwiththisextendedwarranty() {
        extendwarrantyprice();

    }

    @Then("^verify the Clyde protections selected are visible to the customer when they proceed back to Checkout$")
    public void verifytheClydeprotectionsselectedarevisibletothecustomerwhentheyproceedbacktoCheckout() {
        clydeincheckout();

    }
    @When("^user should click on clyde protection on side cart$")
    public void usershouldclickonclydeprotectiononsidecart() {
        clickclydeprotectioninsidecart();

    }

    @When("^user will see the Clyde CtA within their Order summary, displaying the Clyde icon$")
    public void userwillseetheClydeCtAwithintheirOrdersummarydisplayingtheClydeicon() {
        clydeincheckout();

    }

    @Then("^user should see the quantity/number of extended warranties purchased for this device$")
    public void usershouldseethequantitynumberofextendedwarrantiespurchasedforthisdevice() {
        clydeqtyincheckout();

    }

    @Then("^user should see the price of this extended warranty$")
    public void usershouldseethepriceofthisextendedwarranty() {
        extendwarrantyprice();

    }

    @Then("^verify the customer clicks on Place order in Checkout, then when they reach their Order success page$")
    public void verifythecustomerclicksonPlaceorderinCheckoutthenwhentheyreachtheirOrdersuccesspage() {
        clickplaceorder();

    }

    @When("^user should see the description of the extended warranty protection associated with respective device$")
    public void user_should_see_the_description_of_the_extended_warranty_protection_associated_with_respective_device() {

    }

    @When("^verify the number of extended warranties purchased for this device$")
    public void verify_the_number_of_extended_warranties_purchased_for_this_device() {

    }

    @Then("^user will see a confirmation of the Clyde extended warranty for the product they’ve ordered$")
    public void user_will_see_a_confirmation_of_the_Clyde_extended_warranty_for_the_product_they_ve_ordered() {

    }

    @Given("^user is in home page$")
    public void user_is_in_home_page() {

    }

    @When("^user access this MVP Product Details page \\(PDP\\)$")
    public void user_access_this_MVP_Product_Details_page_PDP() {

    }

    @When("^user will see the following experience Products portion, Product bundles portion and Parts & Accessories portion$")
    public void user_will_see_the_following_experience_Products_portion_Product_bundles_portion_and_Parts_Accessories_portion() {

    }

    @Then("^user should verify that products portion will display the individual devices$")
    public void user_should_verify_that_products_portion_will_display_the_individual_devices() {

    }

    @Then("^user verify that products bundle portion PDP will display our product bundles$")
    public void user_verify_that_products_bundle_portion_PDP_will_display_our_product_bundles() {

    }

    @Then("^User should click Add to Cart CtA adds all the products within this bundle, to the customer’s side cart\\.$")
    public void user_should_click_Add_to_Cart_CtA_adds_all_the_products_within_this_bundle_to_the_customer_s_side_cart() {

    }

    @Then("^user  able to see there is a product bundle discount \\(a strikethrough pricing visual\\), then that will be added to the customer’s side cart as well$")
    public void user_able_to_see_there_is_a_product_bundle_discount_a_strikethrough_pricing_visual_then_that_will_be_added_to_the_customer_s_side_cart_as_well() {

    }

    @Then("^adding these product bundles to the customer’s side cart, will also add the associated subscription tiers for each device, setup in CommerceTools$")
    public void adding_these_product_bundles_to_the_customer_s_side_cart_will_also_add_the_associated_subscription_tiers_for_each_device_setup_in_CommerceTools() {

    }

    @Then("^user able to view the product bundle’s Affirm prequalify messaging displayed, via Affirm integration$")
    public void user_able_to_view_the_product_bundle_s_Affirm_prequalify_messaging_displayed_via_Affirm_integration() {

    }

    @Then("^user verify that Parts & Accessories portion PDP will display our parts & accessories our non-devices, a maximum of (\\d+) can be configured in Prismic in this widget$")
    public void user_verify_that_Parts_Accessories_portion_PDP_will_display_our_parts_accessories_our_non_devices_a_maximum_of_can_be_configured_in_Prismic_in_this_widget(int arg1) {

    }

    @Then("^the Add to Cart CtA adds this item to the customer’s side cart\\.$")
    public void the_Add_to_Cart_CtA_adds_this_item_to_the_customer_s_side_cart() {

    }

    @Then("^If there was a discount associated with this item, then the side cart will have that item, along with the discount, applied$")
    public void if_there_was_a_discount_associated_with_this_item_then_the_side_cart_will_have_that_item_along_with_the_discount_applied() {

    }

    @When("^user able to views the side cart when you add a \"(.*)\" product to your shopping cart via the product details page \\(PDP\\)$")
    public void user_able_to_views_the_side_cart_when_you_add_a_product_to_your_shopping_cart_via_the_product_details_page_PDP(String arg0) {
        clickProduct(arg0);

    }

    @When("^user verify the side cart is titled Your cart$")
    public void user_verify_the_side_cart_is_titled_Your_cart() { sidecarttitletext();

    }

    @When("^user click X CtA, which will close the side cart$")
    public void user_click_X_CtA_which_will_close_the_side_cart() {

    }

    @When("^user should validate all visible elements in the side cart$")
    public void user_should_validate_all_visible_elements_in_the_side_cart() { visibleelementvalidationinsidecart();

    }

    @When("^user verify verify that there is a minus and  plus unit adjustment feature to increase or decrease the quantity$")
    public void user_verify_verify_that_there_is_a_minus_and_plus_unit_adjustment_feature_to_increase_or_decrease_the_quantity() {
        qtyincreasedecreaseforaddedproduct();

    }

    @When("^user verify that if the customer selects ten plus, then the quantity adjustment field changes to a text input field$")
    public void user_verify_that_if_the_customer_selects_then_the_quantity_adjustment_field_changes_to_a_text_input_field() {

    }

    @When("^user verify that user is able to add bundled product to cart and that product is shown in the cart$")
    public void user_verify_that_user_is_able_to_add_bundled_product_to_cart_and_that_product_is_shown_in_the_cart() {

    }

    @When("^user verify there is a radio button to select your shopping cart as a gift$")
    public void user_verify_there_is_a_radio_button_to_select_your_shopping_cart_as_a_gift() {

    }

    @When("^user verify that labeled This is a gift, along with a gift icon$")
    public void user_verify_that_labeled_This_is_a_gift_along_with_a_gift_icon() {

    }

    @When("^user selects this radio button, then they enter their Checkout session$")
    public void user_selects_this_radio_button_then_they_enter_their_Checkout_session() {

    }

    @When("^user verify that this gift selection is saved, if the customer was signed-in$")
    public void user_verify_that_this_gift_selection_is_saved_if_the_customer_was_signed_in() {

    }

    @When("^user verify there is a discount section, Total section and dynamically-calculated Affirm marketing message$")
    public void user_verify_there_is_a_discount_section_Total_section_and_dynamically_calculated_Affirm_marketing_message() {

    }

    @When("^user verify there is a Checkout CtA that is displayed on a non-empty shopping cart$")
    public void user_verify_there_is_a_Checkout_CtA_that_is_displayed_on_a_non_empty_shopping_cart() {

    }

    @When("^user verify click on the checkout CtA user should navigate to checkout page$")
    public void user_verify_click_on_the_checkout_CtA_user_should_navigate_to_checkout_page() {

    }

    @When("^user verify there is a label called Taxes and shipping calculated at checkout$")
    public void user_verify_there_is_a_label_called_Taxes_and_shipping_calculated_at_checkout() {

    }

    @When("^user verify once customer made the successful purchase the cart items will be empty$")
    public void user_verify_once_customer_made_the_successful_purchase_the_cart_items_will_be_empty() {

    }


    @Then("^user will experience the empty shopping cart with a label your cart is empty with shopping cart icon$")
    public void they_will_experience_the_empty_shopping_cart() { emptyshoppingcartwithlabel();

    }


    @Then("^there is a Continue shopping CtA which will close the shopping cart$")
    public void there_is_a_Continue_shopping_CtA_which_will_close_the_shopping_cart() { sidecartclose();

    }

    @When("^user add product\\(s\\) to their cart that have a strikethrough pricing and same product reflected in the shopping cart$")
    public void user_add_product_s_to_their_cart_that_have_a_strikethrough_pricing_and_same_product_reflected_in_the_shopping_cart() {

    }

    @When("^strikethrough pricing is displayed only for products of which the discounted promotion setup on CommerceTools applies$")
    public void strikethrough_pricing_is_displayed_only_for_products_of_which_the_discounted_promotion_setup_on_CommerceTools_applies() {

    }

    @When("^adjusting the units of this product, then the struck-through pricing is also updated to reflect the quantity selected, along with the discounted price$")
    public void adjusting_the_units_of_this_product_then_the_struck_through_pricing_is_also_updated_to_reflect_the_quantity_selected_along_with_the_discounted_price() {

    }

    @When("^verify that when the customer adjusts their quantity, the discount calculated is displayed$")
    public void verify_that_when_the_customer_adjusts_their_quantity_the_discount_calculated_is_displayed() {

    }

    @When("^confirm that this strikethrough pricing carries forward into the Order summary of Checkout$")
    public void confirm_that_this_strikethrough_pricing_carries_forward_into_the_Order_summary_of_Checkout() {

    }

    @When("^verify strikethrough pricing functionality for both a single product discount, as well as a product combination discount$")
    public void verify_strikethrough_pricing_functionality_for_both_a_single_product_discount_as_well_as_a_product_combination_discount() {

    }

    @When("^User have a device in their shopping cart with an associated Clyde warranty$")
    public void user_have_a_device_in_their_shopping_cart_with_an_associated_Clyde_warranty() {
        chkExpectedProductshaveWanrrenty();
    }

    @Then("^User will experience the Clyde discount experience in the shopping cart$")
    public void user_will_experience_the_Clyde_discount_experience_in_the_shopping_cart() {

    }

    @Then("^verify that as per legal, this Clyde user experience shows up for all the (\\d+) states of United States including California$")
    public void verify_that_as_per_legal_this_Clyde_user_experience_shows_up_for_all_the_states_of_United_States_including_California(int arg1) {

    }

    @Then("^verify that as per legal, this Clyde experience does NOT show up for Canada users alone$")
    public void verify_that_as_per_legal_this_Clyde_experience_does_NOT_show_up_for_Canada_users_alone() {

    }

    @Then("^User should experience an Add product protection CtA, along with a Clyde logo, displayed with the device when initially added to the customer’s shopping cart\\.$")
    public void user_should_experience_an_Add_product_protection_CtA_along_with_a_Clyde_logo_displayed_with_the_device_when_initially_added_to_the_customer_s_shopping_cart() {
        chkExpectedProductshaveWanrrenty();
    }

    @Then("^Validate product protection plan and check$")
    public void clicking_on_this_CtA_will_display_the_Clyde_protection_plan_wizard() {

    }

    @Then("^Once the User selects a protection plan from Clyde, this plan is displayed under the relevant product in the shopping cart$")
    public void once_the_User_selects_a_protection_plan_from_Clyde_this_plan_is_displayed_under_the_relevant_product_in_the_shopping_cart() {

    }

    @Then("^user validate in clyde the maximum quantity allowed is limited to the number of the unique device to the cart$")
    public void user_validate_in_clyde_the_maximum_quantity_allowed_is_limited_to_the_number_of_the_unique_device_to_the_cart() {
       waitFor(3000);
        chkProductProtectionincreaseDisabled();
        clickElementAction(cktProductOne_IncreaseQuantity1);
        waitFor(3000);
        chkProductProtectionincreaseEnabled();
        cktclydeyearplanclose.click();
        waitFor(3000);
    }

    @Then("^If the customer re-selects the Clyde CtA, then the warranty selection modal displays again, but with the previously selected warranty as pre-selected in the modal$")
    public void if_the_customer_re_selects_the_Clyde_CtA_then_the_warranty_selection_modal_displays_again_but_with_the_previously_selected_warranty_as_pre_selected_in_the_modal() {
waitFor(4000);
        chkclydeprotectionplans();
        selectedclydeplan2();
        addproductionplan();
        chkProductProtection2Added();

    }

    @Then("^User should verify these selections will carry over into the Checkout experience$")
    public void user_should_verify_these_selections_will_carry_over_into_the_Checkout_experience() {

    }

    @Then("^user removes the device from their shopping cart, then customer should see this selected Clyde warranty is also removed\\.$")
    public void user_removes_the_device_from_their_shopping_cart_then_customer_should_see_this_selected_Clyde_warranty_is_also_removed() {

    }

    @When("^validate user should click checkout in side cart page$")
    public void validate_user_should_click_checkout_in_side_cart_page() {

    }

    @When("^User clicks on Edit cart CtA in the Order summary of Checkout$")
    public void user_clicks_on_Edit_cart_CtA_in_the_Order_summary_of_Checkout() {

    }

    @Then("^User will experience the full version of their Shopping cart$")
    public void user_will_experience_the_full_version_of_their_Shopping_cart() {

    }

    @Then("^User able to see this page is labeled Cart$")
    public void user_able_to_see_this_page_is_labeled_Cart() {

    }

    @Then("^User able to see page contains a Product section, and the Order summary section$")
    public void user_able_to_see_page_contains_a_Product_section_and_the_Order_summary_section() {

    }

    @Then("^user should validate the subtotal for this product, which is the total of the product’s price, times the quantity \\(product price x quantity\\)$")
    public void user_should_validate_the_subtotal_for_this_product_which_is_the_total_of_the_product_s_price_times_the_quantity_product_price_x_quantity() {

    }

    @Then("^verify that the user is able to select / adjust the Clyde extended warranty option for the products in shopping cart$")
    public void verify_that_the_user_is_able_to_select_adjust_the_Clyde_extended_warranty_option_for_the_products_in_shopping_cart() {
        clickclydeprotectioninsidecart();
       // chkclydeprotectionplans();
        selectedclydeplan();
        addproductionplan();
        chkProductProtectionAdded();
        clickElementAction(cktclydeyearplanclose);
        clickclydeprotectioninsidecart();
        selectedclydeplan2();
        addproductionplan();
        chkProductProtection2Added();

    }

    @Then("^verify that the user is able to add product protection or remove protection$")
    public void verify_that_the_user_is_able_to_add_product_protection_or_remove_protection() {

    }

    @Then("^user able to display the bundled product with the strike through pricing if available in side cart$")
    public void user_able_to_display_the_bundled_product_with_the_strike_through_pricing_if_available_in_side_cart() {

    }

    @Then("^verify that the X CtA will remove this product from the customer’s shopping cart$")
    public void verify_that_the_X_CtA_will_remove_this_product_from_the_customer_s_shopping_cart() {

    }

    @Then("^User should see Order summary section is labeled Order summary$")
    public void user_should_see_Order_summary_section_is_labeled_Order_summary() {

    }

    @Then("^this section displays the total costs and discounts of a customer’s order$")
    public void this_section_displays_the_total_costs_and_discounts_of_a_customer_s_order() {

    }

    @Then("^user verify there is a Discount section, containing the total aggregate value of any promotions that apply to the customer’s shopping cart$")
    public void user_verify_there_is_a_Discount_section_containing_the_total_aggregate_value_of_any_promotions_that_apply_to_the_customer_s_shopping_cart() {

    }

    @Then("^that expanding Promo code,User should able to click on Remove CtA, will remove this promo code from being applied$")
    public void that_expanding_Promo_code_User_should_able_to_click_on_Remove_CtA_will_remove_this_promo_code_from_being_applied() {

    }

    @Then("^there is an Order total line item, containing the total of the products, shipping, taxes, and discounts$")
    public void there_is_an_Order_total_line_item_containing_the_total_of_the_products_shipping_taxes_and_discounts() {

    }

    @Then("^if applicable, there is a label This is a gift, if the customer selected the gift option from the shopping cart$")
    public void if_applicable_there_is_a_label_This_is_a_gift_if_the_customer_selected_the_gift_option_from_the_shopping_cart() {

    }

    @Then("^user verify that there is a Proceed to checkout CtA which will direct the customer to the Checkout page, with their modified shopping cart contents$")
    public void user_verify_that_there_is_a_Proceed_to_checkout_CtA_which_will_direct_the_customer_to_the_Checkout_page_with_their_modified_shopping_cart_contents() {

    }

    @And("^select any one protection plan from clyde, this plan is displayed under the relevant product in the shopping cart$")
    public void selectAnyOneProtectionPlanFromClydeThisPlanIsDisplayedUnderTheRelevantProductInTheShoppingCart() {
       waitFor(4000);
        clickclydeprotectioninsidecart();
        chkclydeprotectionplans();
        selectedclydeplan();
        addproductionplan();
        chkProductProtectionAdded();

    }


    @And("^user click on AirProproduct in Checkout page$")
    public void userClickOnAirProproductInCheckoutPage() {
        waitFor(5000);
        clickOnAirProProduct();
    }
}