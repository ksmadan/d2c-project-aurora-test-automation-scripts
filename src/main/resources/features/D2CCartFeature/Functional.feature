@PDP_FieldValidation @Regression
Feature: PDP: This feature deals with the Field Validation of the application

  Background:
#    Given user enter valid account  credentials
    When user navigate to D2C page
    And user click on product in D2C page
    Then user should see Checkout button
   Then user should remove all the products in cart
  @TEST_B2B-4034 @TEST_B2B-3519
  Scenario: To verify that Create an "MVP" PDP for demo purposes
    When user will see the following experience Products portion, Product bundles portion and Parts & Accessories portion
    And user should verify that products portion will display the individual devices
    And user verify that products bundle portion PDP will display our product bundles
    And User should click Add to Cart CtA adds all the products within this bundle, to the customer’s side cart.
    And user  able to see there is a product bundle discount (a strikethrough pricing visual), then that will be added to the customer’s side cart as well
    And adding these product bundles to the customer’s side cart, will also add the associated subscription tiers for each device, setup in CommerceTools
    And user able to view the product bundle’s Affirm prequalify messaging displayed, via Affirm integration
    And user verify that Parts & Accessories portion PDP will display our parts & accessories our non-devices, a maximum of 4 can be configured in Prismic in this widget
    And the Add to Cart CtA adds this item to the customer’s side cart.
    And If there was a discount associated with this item, then the side cart will have that item, along with the discount, applied


  @TEST_B2B-3860 @TEST_B2B-1207
  Scenario: Validate the side cart
    When user able to views the side cart when you add a "Get Molekule Air Pro" product to your shopping cart via the product details page (PDP)
    And user verify the side cart is titled Your cart
    And user should validate all visible elements in the side cart
    And user verify verify that there is a minus and  plus unit adjustment feature to increase or decrease the quantity
    And user verify that if the customer selects ten plus, then the quantity adjustment field changes to a text input field
    When user click X CtA, which will close the side cart
    And user verify that user is able to add bundled product to cart and that product is shown in the cart
    And user verify there is a radio button to select your shopping cart as a gift
    And user verify that labeled This is a gift, along with a gift icon
    When user selects this radio button, then they enter their Checkout session
    And user verify that this gift selection is saved, if the customer was signed-in
    And user verify there is a discount section, Total section and dynamically-calculated Affirm marketing message
    And user verify there is a Checkout CtA that is displayed on a non-empty shopping cart
    And user verify click on the checkout CtA user should navigate to checkout page
    And user verify there is a label called Taxes and shipping calculated at checkout
    And user verify once customer made the successful purchase the cart items will be empty


  @TEST_B2B-4066 @TEST_B2B-1207
  Scenario: verify empty shopping cart
    When user will experience the empty shopping cart with a label your cart is empty with shopping cart icon
    And there is a Continue shopping CtA which will close the shopping cart

  @TEST_B2B-3881 @TEST_B2B-2315
  Scenario: Verify Display strike-through pricing on Side cart
#    When user add product(s) to their cart that have a strikethrough pricing and same product reflected in the shopping cart
    And strikethrough pricing is displayed only for products of which the discounted promotion setup on CommerceTools applies
    And adjusting the units of this product, then the struck-through pricing is also updated to reflect the quantity selected, along with the discounted price
    And verify that when the customer adjusts their quantity, the discount calculated is displayed
    And confirm that this strikethrough pricing carries forward into the Order summary of Checkout
    And verify strikethrough pricing functionality for both a single product discount, as well as a product combination discount

  #@TEST_B2B-3887 @TEST_B2B-2357
  Scenario: Air, or Air Pro, with an up-sell promotion applicable (Buy X and get $off on Y)
   # When user add an Air or Air Pro to their shopping cart, and there is an up-sell promotion tied to that device setup in CommerceTools
   # Then user will see that this will display Molekule’s up-sell promotion in the shopping cart
   # And user adding a Molekule Air, this will display the <“Get the bundle. Save $XXX”> CtA which, when clicked, will display the additional product that can be added
   # And user should see that this additional product display contains
   # * <“What a pair: [PRODUCT NAME]”>, where the product name is sourced by CommerceTools (Based on the Promotion or Discount configured in CT)
   # * a Close <“X”> CtA
   # * product visual, from Prismic
   # * the <“You’re 1 Molekule Air Mini+ from saving $XXX”> from Prismic
   # * an <“Add to cart”> CtA which will add this item to your shopping cart, and end this visual.
   # And this up-sell only displays when you have either <“one Air” (or) “one Air Pro”>, within the shopping cart (if you have Air Pros, or an Air and Air Pro, as some examples, that don’t display the up-sell)
   # And the discount amount that the customer saves is added to the <“Discount”> line item in the shopping cart


  Scenario: user add the product Air Mini, or Air Mini+
   # When user add an <“Air Mini”> (or) <“Mini+”> to their shopping cart
   # Then this will display Molekule’s up-sell promotion
   # And user should see there is a <“You’re 1 Air Mini / Mini+ away from saving $XXX”>, along with a progress bar
   # And when the customer increases the unit quantity, they will experience the threshold achieved display of <“Congrats! You saved $XXX">
   # And further if the customer increases the quantity, then this progress bar disappears
   # And confirm that when the customer decreases the quantity down to 2, then the progress bar displays
   # And the discount amount that the customer saves is added to the “Discount” line item in the shopping cart

  Scenario: validate that the promotion is not applicable for mixed cart with Air/Air Pro and Air Mini/Air Mini+
   # When user have a mixed cart with Air/Air Pro and Air Mini/Air Mini+ in their shopping cart
   # Then validate there is no molekule's up-sell promotion displayed for mixed cart


  @TEST_B2B-4202 @TEST_B2B-2360
  Scenario: Verify add Clyde integration on Cart
#    When User have a device in their shopping cart with an associated Clyde warranty
#    Then User will experience the Clyde discount experience in the shopping cart
#    And verify that as per legal, this Clyde user experience shows up for all the 50 states of United States including California
#    And verify that as per legal, this Clyde experience does NOT show up for Canada users alone
    And User should experience an Add product protection CtA, along with a Clyde logo, displayed with the device when initially added to the customer’s shopping cart.
   And select any one protection plan from clyde, this plan is displayed under the relevant product in the shopping cart
   And user validate in clyde the maximum quantity allowed is limited to the number of the unique device to the cart
    And If the customer re-selects the Clyde CtA, then the warranty selection modal displays again, but with the previously selected warranty as pre-selected in the modal
#    And User should verify these selections will carry over into the Checkout experience
#    And user removes the device from their shopping cart, then customer should see this selected Clyde warranty is also removed.



  @TEST_B2B-3890 @TEST_B2B-1643
  Scenario: Verify Add Order summary section "Full cart" page
    And user click on AirProproduct in Checkout page
    And user click on Checkout button
    And user click on Editcart in ordersummary page
#    And user should update the product quantity and check price changes in full cart
    And verify that the user is able to select / adjust the Clyde extended warranty option for the products in shopping cart

#    And user able to display the bundled product with the strike through pricing if available in side cart
#    And verify that the X CtA will remove this product from the customer’s shopping cart
#    And User should see Order summary section is labeled Order summary
#    And this section displays the total costs and discounts of a customer’s order
#    And user verify there is a Discount section, containing the total aggregate value of any promotions that apply to the customer’s shopping cart
#    And that expanding Promo code,User should able to click on Remove CtA, will remove this promo code from being applied
#    And there is an Order total line item, containing the total of the products, shipping, taxes, and discounts
#    And if applicable, there is a label This is a gift, if the customer selected the gift option from the shopping cart
#    And user verify that there is a Proceed to checkout CtA which will direct the customer to the Checkout page, with their modified shopping cart contents