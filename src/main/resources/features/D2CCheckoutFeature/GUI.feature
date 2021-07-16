@Checkout_GUIValidation @Regression
Feature: Checkout: This feature deals with the Field Validation of the application
  Background:
    Given user enter valid account credentials
    When user navigate to D2C page
    And user click on product in D2C page
    Then user should see Checkout button
    And user click on Checkout button
#    Given user enters account details in Checkout
  @TEST_B2B_4332 @D2C-Sprint2
  Scenario: Validate to add Shipping method section
#   guestuserflow
#    Given user validate Checkout page
#    Then verify enter email section in checkout page
#    When user select this is gift option-ShippingTab should change as Recipient’s info
#    When  user accepts terms and conditions then only next button shlould enable
    When  user select saved shipping address from the list
    When user click on Save button
    And User should able to see the Shipping method section is labeled as Shipping method with a green number as three
    Then user should validate all the shipping methods with the pre-order message under shipping method
#    And User confirm that if particular shipping method is selected, and its shipping cost is displayed within the Order summary
When user click on next button should navigate to payment tab and shipping section should be in saved state
  And verify shipping method displayed with check-mark and edit option is working properly

#    And User should see there is a free-shipping promotion that is setup and applicable, you will see a summary of this same free-shipping messaging within the saved state of the <“Shipping method”> section
#    And confirm ADA implementation of this experience from ADA doc

  @TEST_B2B-4437 @D2C-Sprint2
  Scenario: Verify add order success page
    When user select shipping details and click save button
    And user selected Shipping method and click Next button
    Then user should validate Payment section with number background color rgba(0, 0, 0, 0)
    When user select the credit card details
    When user click on PLace order in order summary

    #When verify that customer has successfully placed an order from Checkout
#    Then verify the experience the Order success page
#    And verify the page is labeled as <“Thanks [FIRST_NAME]!”>
#    And verify that there are three sections: <"an order review">, <"an affiliate marketing module">, <"as well as a survey module">
#
#  <"an order review module">
#    And verify that this section has an order number <“Order #XXXXX”>, where <“XXXXX”> is dynamically calculated by Merchant Center
#    And verify that this Order number is sent to NetSuite
#    And verify that there is copy <“We’re getting your order ready. Look out for email updates on your order status and managing your account.“>
#    And verify that each product the customer ordered is displayed, similar to the Order summary section
#    And verify strikethrough pricing
#    * Affirm-paying customers
#    And verify if a customer paid with Affirm, confirm that every device will display the Affirm branded logo (sourced from Prismic)
#    And verify if the Affirm-paying customer chose to activate auto-refills within the the Auto-refills interstitial page, then we will display <“Auto-refills activated”>
#    And verify if the Affirm-paying customer chose not to activate their auto-refills from the Auto-refills interstitial page, then we display “Auto-refills inactive”, along with a “Requires sign-up after purchase”
#    And verify that this device is similarly labeled within the Auto-refills section of the customer’s Account dashboard
#    * Clyde-paying customers
#    And verify that the order breakdown is displayed, similar to the Order summary section
#
#  <"an affiliate marketing module">
#    And verify to see this story for the Affiliate marketing module on the Order success page
#
#  <"Survey module">
#    And verify to see this story for the Survey module on the Order success page
#    And verify ADA implementation of this experience from ADA doc
#
#  @TEST_B2B-4438 @D2C-Sprint2
#
#  Feature: Add Filter refills interstitial page
#  Scenario: Verify add Filter refills interstitial page
#
#    Given a D2C customer who has paid with their order using Affirm
#    When verify that this customer successfully places their order in Checkout
#    Then verify that display a special filter refills interstitial page, to capture the customer’s billing information to support recurring refill subscriptions
#    And verify that this page will display when the customer goes through the Affirm purchase flow from Checkout
#    And verify that this experience / page does NOT occur for customers who ship to Canada
#    And verify that this page will display the following components
#    * Verify Global navigation header
#    * Verify Filters involved with refills
#    * Verify Capturing billing information / activating auto-refills
#    * Verify Marketing content
#
#  <"Global navigation header">
#    And verify that clicking on the Molekule icon in the Global navigation header will take you to the main Molekule page
#
#  <"Filters involved with refills">
#    And verify that the component involved with Filter refills will display the filters that correspond to the devices in the customers order, and display
#    And verify filter image
#    And verify the device associated with these filters
#    And verify the number of filters associated with each refill, per device
#    And verify the cost of maintaining these refills, on a semi-yearly or yearly basis
#    And verify the next refill date, which is calculated dynamically, based off of the SKU of the filter involved
#    And verify that adding another 6 months to today’s current date
#
#  <"Capturing billing information / activating auto-refills">
#    And verify the section to capture billing is labeled <“Almost done. Last step: filter refills.”>
#    And verify that the sub-copy is <“Refills let you destroy year round. Sign up for auto-delivery and save.”>
#    And verify that there is a credit card entry form, where the user can enter the credit card that will be billed according to their subscription
#    And verify that there will be a numeric textfield for <‘Card number’>
#    And verify that there will be a numeric textfield for the credit card’s expiration, labeled <‘MM/YY’>
#    And verify that there will be a numeric textfield for the credit card’s CVV, labeled <‘CVV’>
#    And verify the error/info messages from <“Checkout - Payment section”> in error doc, for each of the fields above
#    And verify credit card validation serviced by Stripe integration (“Your card number is invalid.”, fraud-checking upon save, etc),
#    And verify that successful validation of credit card then enabling the <“Activate auto-refills”> CtA
#    And verify that  this customer will see a <‘Billing address same as shipping’> radio button
#    And verify that radio button initially selected and filled with the customer’s shipping destination from their order, in a collapsed and summarized state
#
#    And verify if the customer de-selects the <“Billing address same as shipping”> radio button, then the fields displayed expand to capture the customer’s billing address information
#    And verify AND this customer will see a 'First name' entry field
#    And verify this customer will see a <'Last name'> entry field
#    And verify this customer will see a <'Address 1'> entry field
#    And verify confirm that Google Address Verification is integrated and enabled while the customer types
#    And verify this customer will see a <'Address 2'> entry field
#    And verify this customer will see a <'City'> entry field
#    And verify this customer will see a <'State'> dropdown
#    And verify this customer will see a <'Postal code'> entry field
#    And verify this customer will see a <'Country'> entry field
#    And verify this customer will see a <'Phone number'> entry field
#
#    And verify that if the customer enters and saves the same address as the shipping address
#    Then the resulting summary state will be the same as if they had pre-selected their billing address was the same as their shipping
#    And verify there is filter refill copy <“Filter Auto-Refills: Filters automatically renew at the end of each term. At renewal, you will be charged the same amount and for the same duration. You can cancel at any time.”>
#    And verify that <“cancel”> is a CtA which, when clicked, will display the cancel information in a modal view
#    And verify that there is a <“I’ll do this later”> CtA that, when clicked, will take the customer to their Order success page
#    And verify that there is a <“Active auto-refills”> CtA that, when clicked, will take the customer to their Order success page, with the corresponding Auto-refills associated with their devices activated
#
