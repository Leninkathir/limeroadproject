
Feature: Limeroad order
Scenario: To enter url

Given launch the url "https://www.limeroad.com/"

Scenario: To select product
Given user clicks the shopmen
When user clicks the Tshirt
When user selects the Model
When user selects the Variant
When user selects the Size
And user clicks add_to_cart


