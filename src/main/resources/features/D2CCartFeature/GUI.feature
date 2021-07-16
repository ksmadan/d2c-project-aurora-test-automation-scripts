@PDP_FieldValidation @Regression
Feature: PDP: This feature deals with the Field Validation of the application

  Background:

    Given user should click on the product link in home page

  @TEST_B2B-3936 @TEST_B2B-2559

#  Consolidated Tealium Events, confirm the following tealium tracking events for the shopping cart:
#
#  1. tealium_event: quantity_increase
#
#  event_category = "Cart"
#
#  event_action = "Changed Quantity"
#
#  event_label = "Increased"
#
#  2. tealium_event: quantity_decrease
#
#  event_category = "Cart"
#
#  event_action = "Changed Quantity"
#
#  event_label = "Decreased"
#
#  3. tealium_event: cart_remove
#
#  event_category = "Cart"
#
#  event_action = "Removed from Cart"
#
#  event_label = "Removed: [product_sku]"
#
#  4. tealium_event: begin_checkout_click
#
#  event_category = "Cart"
#
#  event_action = "Clicked Begin Checkout"
#
#  5. tealium_event: clicked_gift_on
#
#  event_category = "Gift Purchase"
#
#  event_action = "Checked sidecart gift box"
#
#  event_value = [cart_total_value]
#
#  6. tealium_event: clicked_gift_off
#
#  event_category = "Gift Purchase"
#
#  event_action = "Un-checked sidecart gift box"
#
#  event_value = [cart_total_value]
#
#  7. tealium_event: Affirm
#
#  event_category = "Affirm"
#
#  event_action = "Clicked Affirm Learn More"
#
#  8. tealium_event: “coupon_code_failed” (this is more relevant for the “full cart” experience of the shopping cart, which is in the Checkout epic, but is listed here for reference)
#
#  event_category = "Coupon Code Failed"
#
#  event_action = "Coupon Code failed to apply"
#
#  event_label = [coupon_code]
#
#  event_value = [url] if CTA takes you to another page
#
#
#
#  Clyde (extended warranty)
#
#  1. tealium_event: “clicked_warranty_sidecart”
#
#  event_category = “Warranty”
#
#  event_action = “Clicked sidecart CTA Warranty”
#
#  event_label = [product_sku]
#
#  event_value = [cart_total_value]
#
#  2. tealium_event: “clicked_warranty_no”
#
#  event_category = “Warranty”
#
#  event_action = “Closed Modal no cart_add”
#
#  event_label = [product_sku]
#
#  event_value = [cart_total_value]
#
#
#  For all other CtAs / submissions within the shopping cart (e.g., information icon button)
#
#  1. tealium_event: “clicked_cta”
#
#  event_category = "Interaction"
#
#  event_action = "Clicked a button"
#
#  event_label = [button title]
#
#  event_value = [url] if CTA takes you to another page

  @TEST_B2B-3982 @TEST_B2B-3545

    Given the user accessing Cart

    When the user navigating to Cart

    Then the user hear voice-over on accessing Cart as per WCAG 2.1 AA global guidelines


  @TEST_B2B-4203 @TEST_B2B-1643

  Feature: User can click on the <“Edit cart"> Checkout, and view the UI of my shopping cart
  Scenario: Verify the UI of full cart page and view the contents of my shopping cart
    Given a D2C Customer in Checkout
    When Customer clicks on <“Edit cart”> CtA in the Order summary of Checkout
    Then Customer will experience the full version of their Shopping cart
    And User should able see this page is labeled as  <“Cart”>
    And User should able to see this page contains a <“Product section”>, and the <“Order summary”> section

    And in the Product section, the objects for the customer’s potential order are arranged in a tabular format
    And the Order summary section is labeled “Order summary”
    And this section displays the total costs and discounts of a customer’s order
    And there is a Subtotal line item, containing the total of the products (and, if applicable, their extended warranties added to subtotal)
    And there is a Shipping line item, containing the shipping costs calculated from the customer’s selected shipping destination
    And there is a Tax line item, containing the dynamically calculated sales tax from the customers shopping cart, as well as their entered shipping destination
    And User should see there is a Discount section, containing the total aggregate value of any promotions that apply to the customer’s shopping cart
    And user to click on "+" icon next to Promo Code
    And enter a valid promo code and click on Apply button
    And verify that the discount is applied and reflects in the Order Total
    And click on "-" icon next to Promo code to see if the Promo section is collapsed
    And validate that click on CtA <"Promo code"> that expand's, clicking on <“Remove”> CtA, will remove this promo code from being applied
    And verify that the Order total is updated which reflects promo code removal
    And verify there is an Order total line item, containing the total of the products, shipping, taxes, and discounts
    And if applicable, there is a label <“This is a gift”>, if the customer selected the gift option from the shopping cart
    And User should see there is a <“Proceed to checkout”> CtA which will direct the customer to the Checkout page, with their modified shopping cart contents


  @TEST_B2B-4206 @TEST_B2B-3308

  Feature: Add Clyde functionality on, "Full cart"
  Scenario: Verify Add Clyde functionality on, "Full cart"
    Given a D2C customer in the <“Full cart”> version of the shopping cart page
    When user is applicable for extended warranty options(via Clyde)
    And User have devices in their order that are associated with a Clyde subscription
    And the Clyde experience is enabled within the customer’s region
    Then User should be able to add / modify a Clyde extended warranty for the devices in their order

  Scenario: Clyde protection plan not selected in full Cart
    And validate the Clyde functionality will be displayed for each product within the <“Full cart”> page
    And validate that if the user did not select a Clyde protection plan before Checkout (in <"Full cart">)
    Then display the following Clyde functionality as to confirm the Clyde icon (sourced from Prismic)
    And confirm the label <“Add product protection”> (sourced from Prismic)
    And verify that clicking on the Clyde CtA displays the modal containing the available protection plans associated with this device (dynamically calculated by Clyde)
    And verify that if the customer clicks outside the modal, clicks on the close CtA (the <‘X'>), or <“I don’t need to protect my purchase”>, then they will be taken back to their <"full cart page>
    And verify that if the customer selects any of the protection plans offered
    And clicks on <“Add protection plan”>
    Then verify that the user is returned back to the <"full cart"> page
    And verify that the selected protection plans are reflected on their <"Full cart"> page, for that specific device they clicked on the Clyde CtA (the workflow is unique to device)
    And confirm the the Clyde icon (sourced from Prismic)
    And confirm the price of this extended warranty (CommerceTools)
    And confirm the quantity of this extended warranty, Quantity of the extended warranty should default to same as product quantity
    And verify that user is unable to add more quantity of Clyde warranty than the device quantity
    And verify that user is able to select a less quantity of Clyde warranty than the device quantity
    And confirm the price associated with this extended warranty(directly retrieved from Clyde)

  Scenario: Clyde protection plan selected in full Cart
    When customer already selected a Clyde protection plan
    Then customer should be able to see the previously selected protection plan associated with this device
    And confirm the Clyde icon (sourced from Prismic)
    And confirm the price of this extended warranty (CommerceTools)
    And confirm the quantity of this extended warranty(Quantity default to same as product)
    And verify that the Clyde functionality is displayed for bundle product within the <“Full cart”> page
    And verify that even though the products are bundle, when it displays in side/full cart the products show individually
    And verify that Clyde protection plan is applied to individual unique SKU’s
    And verify that there is no bundled product visual within the full cart
    And The Clyde protections selected are visible to the customer when they proceed back to Checkout

  @TEST_B2B-4208 @TEST_B2B-3308

  Feature: Checkout Experience with Clyde
  Scenario: Verify the user Checkout Experience with Clyde
    Given a D2C customer in Checkout
    When user should able to select Clyde product protection (either in their Shopping Cart, or in the <“full cart”>)
    Then user able to view / purchase their extended warranties for the devices in their Order Summary section in Checkout
    And user will see the Clyde CtA within their Order summary, displaying the Clyde icon (sourced from Prismic)
    And user should see the description of the extended warranty protection associated with respective device (sourced from Clyde API CommerceTools)
    And user should see the quantity/number of extended warranties purchased for this device
    And user should see the price of this extended warranty (sourced from Clyde API)
    * the description of the extended warranty protection associated with this device (sourced from Clyde API CommerceTools)
    * the number of extended warranties purchased for this device
    * the price of this extended warranty (sourced from Clyde API)
    And customer can modify the terms of their extended warranty will be to click on <“Edit cart”>, where they will be redirected to the <“full cart”> page
    And when the customer clicks on <“Place order”> in Checkout, then when they reach their Order success page
    Then user will see a confirmation of the Clyde extended warranty for the product they’ve ordered
    And user confirm that this visual confirmation also appears within the customer’s Order success email
