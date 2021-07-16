@Checkout_FieldValidation @Regression
Feature: PDP: This feature deals with the Field Validation of the application


  Background:
    Given user enter valid account credentials
    When user navigate to D2C page
    And user click on product in D2C page
    Then user should see Checkout button
    And user click on Checkout button
 Given user enters account details in Checkout

  @TEST_B2B-4325 @D2C-Sprint2
  Scenario: Validate Add shipping section as Guest user and Gift user
#    Given D2C customer as Guest user in Checkout
    When user click on Add new Shipping address
    Then user validates all the fields in Shipping section
    When user click on This is a business address radio button
    Then user should see Business name field
#    When user leaves blank values in textfield
#    Then user should see error message "Required"
    When user enter wrong input in name text field
    Then user should see error message 'Please enter only alphabets and space'
    When user enters valid details in Shipping section
    Then user see Save button is enabled
    When user click on Save button
#
#  Scenario: Validate Add shipping section as Gift user
#    Given a user in Checkout who selected <“This is a gift”> order
#    When User in the Shipping section of Checkout
#    Then display the following additional <“Recipient’s email”> field for a gift purchaser
#    And the label for the Shipping section is <“Recipient’s info”>, with number 2
#    And A D2C user is signed-in,then able to see their saved shipping address. Otherwise, we will display the shipping section open fields
#    And User in a field called <“Recipient’s email”>, which contains the email of the gift recipient (and who will receive a gift order shipped email), along with the label <“They’ll receive a gift receipt with tracking once the order ships.”>
#    And User should confirm error-tracking for the email format entry
#    And User should click  <“Next”> CtA which will advance the customer to the Payment section, as well as display the Shipping section in a summary state.
#    And In this summary state, we will display the email of the gift recipient, as well as an <“Edit”> CtA
#    And confirm that clicking on the <“Edit”> CtA will re-open the Shipping section again, with all the fields from the beginning of this section pre-populated with the previous values, but editable
#
#  @TEST_B2B-4330 @D2C-Sprint2
#
#  Scenario: Validate Add shipping section as Signedin user
#    Given a D2C registered customer in Checkout, who has signed in
#    When customer enters the Shipping section of Checkout
#    Then customer will have the ability to select, or enter, their shipping destination for their order
#    And User should see this section will be labeled <‘Shipping’>, and numbered 2
#    And User confirm for all the fields in this section, error messaging for use cases like incorrect format, defined
#    And User confirm for all the fields in this section, confirm ADA requirements for the fields, defined
#    And User should see if there are addresses saved to the customer’s existing profile in their Account dashboard,
#    Then display them as clickable tiles, with the most recently used shipping address as pre-selected. Otherwise, then display the same state of open shipping address fields
#    And there is an expandable label called <‘Add new address’> which, when clicked, expands to display the fields
#    And User able to click the <‘Next’> CtA, then the customer is directed to the Shipping method section of Checkout, and their Shipping section is now in a <‘saved state'>
#
#  Scenario: Validate Add shipping section as Registered customer, who decides not to sign-in during their Checkout
#    Given a registered customer in Checkout
#    When Customer decide not to sign-in to their profile, back within the Account section
#    Then User will experience the following Shipping section experience
#    When Customer enter their Shipping section, then they will have the same experience as that of a Guest customer.
#    And there will be no saved address information which will be displayed for this Registered customer who decides not to sign-in, for security reasons
#
#  @TEST_B2B-4350 @D2C-Sprint2
#
#  Scenario: Validate to add payment section as a Guest customer
#    Given a Guest D2C customer in Checkout (they have no registration record)
#    When they have selected their Shipping method, and clicked <‘Next’>
#    Then give this customer the ability to select their Payment preference within the <“Payment”> section
#    And User able to see this section is labeled <‘Payment’>, with a green number 4
#    And User able to see there will be a pre-selected radio button labeled <‘Billing address same as shipping’>, with the summary of the previous shipping destination entered from their Shipping section.
#    And User clicked, this radio button will expand to reveal the list of address fields in order to update / specify the actual billing address intended by the customer
#    And customer is to validate <'First name'> entry field
#    And customer is to validate <'Last name'> entry field
#    And customer is to validate <'Address 1'> entry field
#    And confirm that Google Address Validation is integrated and enabled, displaying while the customer types
#    And customer is to validate <'Address 2'> entry field
#    And customer is to validate <'City'> entry field
#    And customer is to validate <'State'> dropdown
#    And confirm that the default value will be <“State”>
#    And confirm that the remaining values will be the list of states in the United States, listed in alphabetical order
#    And customer is to validate <'Postal code'> entry field
#    And customer is to validate <'Country'> entry field
#    And confirm that the default value will be <“United States”>, the possible values will be either <“Canada”>, or the <“United States”>, and that they are listed alphabetically
#    And customer is to validate <'Phone number'> entry field
#    And this customer will see an initially disabled <‘Save’> CtA, but enabled with when the address fields have been completed.
#    When User clicked, this Billing address section will collapse into a summarize state as mentioned earlier, and the  radio button labeled <“Billing address same as shipping”> is now selected
#    And confirm that you allow the customer to enter the same address as their pre-selected shipping address again
#    And confirm the error/info messages from <“Checkout - Payment section”> in error doc, for each of the fields above
#    And confirm the ADA requirements within this field from our ADA doc
#    And User should confirm that there will be a numeric textfield for <‘Card number’>
#    And User should confirm that when the customer enters a valid number within this field, then the cursor automatically focuses to the <‘MM/YY’> field
#    And User should confirm that there will be a numeric textfield for the credit card’s expiration, labeled <‘MM/YY’>
#    And User should confirm that when the customer enters a valid <‘MM/YY’>, then the cursor automatically focuses to the <‘CVV’> field
#    And User should confirm that there will be a numeric textfield for the credit card’s CVV, labeled <‘CVV’>
#    And confirm the error/info messages from <“Checkout - Payment section”> in error doc, for each of the fields above
#    And User should confirm credit card validation serviced by Stripe integration
#    And there will be an option for the customer to select monthly payments as an option, via Affirm
#    And once the customer has entered all the correct values for their credit card (or they have selected Affirm as their monthly payment),
#    And USer can click on <‘Place order’> in the Order summary section, and complete their order
#    And confirm ADA implementation of this experience from ADA doc
#
#  @TEST_B2B-4364 @D2C-Sprint2
#
#  Scenario: Validate add payment section as signedin customer
#    Given a Signed-in D2C customer in Checkout
#    When user should have selected their Shipping method, and proceed to their <“Payment”> section
#    Then customer should able to signed-in and the ability to select their Payment preference within the following section
#    And user should confirm that this section displays the customer’s Billing address preference / options to modify
#    And user confirm that we display the customer’s saved credit card information, in a summary <“tile”> form, displaying the type of credit card (Visa, MasterCard, AMEX, or Discover), the last four digits of that card, and its expiration date
#    And user confirm that we automatically select the Signed-in customer’s most recent saved payment as initially selected when they enter the Payment section
#    And user confirm that all the saved credit card information are displayed as tiles
#    And user should validate that we give the customer an expandable section labeled <‘Add new credit card’> which, when clicked, will display the form fields involved with adding another credit card
#    And user confirm the error/info messages from <“Checkout - Payment section”> in error doc, for each of the fields involved with entering a new Credit card
#    And user should confirm credit card validation serviced by Stripe integration
#    And user able to see there will be an option for the customer to select monthly payments as an option, via Affirm
#    And user see once the customer has selected their credit card, then they can click on the <‘Place order’> CtA in the Order summary section after reviewing their order
#    And user should Confirm removal of duplicate <“Place order”> CtA from <“Payment section”>
#    And confirm ADA implementation of this experience from ADA doc
#
#  Scenario: Validate add payment section as Registered customer, who decides not to sign-in during their Checkout
#    Given a registered customer in Checkout
#    When user will  decide not to sign-in to their profile, back within the Account section
#    Then user will experience the following Payment section experience
#    When user will enter their Payment section, then they will have the same experience as that of a Guest customer. That is, there will be no saved credit card information which will be displayed for this Registered customer who decides not to sign-in, for security reasons
#    And customer can still use Affirm as a method of payment