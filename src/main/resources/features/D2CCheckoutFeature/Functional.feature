@SmokeTest @Regression
Feature: PDP: This feature deals with the Field Validation of the application


 @1
 Scenario: D2C customer visiting Account sign-in page

   When user click on Account button in sign in page
   Then user validate Account sign in page
   When user enter valid account credentials
   Then user view the header section with user name

  @2
  Scenario: validate able to add all products to cart and update quantity

    When user navigate to D2C page
    Then user should remove all the products in cart
    And user should update the product quantity in cart
    And user should add all products to cart
#       And verify the products added is displaying in cart
    Then user should see Checkout button
    Then user should remove all the products in cart
#      And user click on Checkout button

  @3
  Scenario: validate product quantity update and price in cart
    When user navigate to D2C page
    Then user should remove all the products in cart
    And user should update the product quantity and check price changes in mini cart
    And user click on Checkout button
    And user click on Editcart in ordersummary page
    And user should update the product quantity and check price changes in full cart

 @4
 Scenario: user validate This is gift in Order summary
   Given user enter valid account credentials
   When user navigate to D2C page
   And user click on product in D2C page
   And user click on Checkout button
   When user click on This is a gift radio button
   Then user should see This is a gift in order summary section

 @5
 Scenario: user enter valid email and password and accept terms
   Given user click on Account button in sign in page
   When user enter valid account credentials
   When user navigate to D2C page
   Then user click on product in D2C page
   When user click on Checkout button
   #And user click on signin link
   When user click on This is a gift radio button
  # And user enters account details in Checkout
  # And user click on Next button
   Then user should see Recipient’s info section
 @6
 Scenario: user enter Recipient info and validate Shipping Method

   Given user click on Account button in sign in page
   When user enter valid account credentials
   When user navigate to D2C page
   Then user click on product in D2C page
   When user click on Checkout button
#   When user click on Add new Shipping address
   When user select shipping details and click save button
#   When user enters valid details in Shipping section
   Then user should validate Shipping method section with number background color rgba(0, 0, 0, 0)

 @7
 Scenario: user select Shipping method and validate Payment section
   Given user click on Account button in sign in page
   When user enter valid account credentials
   And user navigate to D2C page
   And user click on product in D2C page
   And user click on Checkout button
   When user select shipping details and click save button
   And user selected Shipping method and click Next button
   Then user should validate Payment section with number background color rgba(0, 0, 0, 0)

 @8
 Scenario: user enter payment details
   Given user click on Account button in sign in page
   When user enter valid account credentials
   And user navigate to D2C page
   And user click on product in D2C page
   And user click on Checkout button
#   When user click on Add new Shipping address
#   And user enters valid details in Shipping section
   When user select shipping details and click save button
   And user selected Shipping method and click Next button
   Then user should validate Payment section with number background color rgba(0, 0, 0, 0)
   When user click on Add new card in payment
   Then user validate card details in Payment
#   When user select the credit card details
#   When user entered valid credit card details
#   And user click on Save button
#   Then user validate the added card details

 @9
 Scenario: user click Toggle and enter billing address
   Given user click on Account button in sign in page
   When user enter valid account credentials
   And user navigate to D2C page
   And user click on product in D2C page
   And user click on Checkout button
#   When user click on Add new Shipping address
#   And user enters valid details in Shipping section
   When user select shipping details and click save button
   And user selected Shipping method and click Next button
   When user click on Toggle radio button in payment section
   Then user validate Billing address fields in payment section
   When user enter values in Billing address fields in payment section
   And user click on Save button
#   Then user validate added billing address field

 @10
 Scenario: user Place order after entering all the details

   Given user click on Account button in sign in page
   When user enter valid account credentials
   And user navigate to D2C page
   And user click on product in D2C page
   And user click on Checkout button
   When user select shipping details and click save button
   And user selected Shipping method and click Next button
   Then user should validate Payment section with number background color rgba(0, 0, 0, 0)
   When user select the credit card details
   When user click on PLace order in order summary
   Then user should see order confirmation page



