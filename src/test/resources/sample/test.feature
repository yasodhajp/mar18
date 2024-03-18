Feature: To verify the Adactin hotel Webpage

  Background: 
    Given User should be navigate to the login page

  Scenario Outline: To verify the Adactin hotel login page with credential
    When User should enter the "<username>" and "<password>"
    And User should enter the "<Location>" and "<Hotels>" and "<Room Type>" and "<Number of Rooms>" and "<Check In Date>" and "<Check Out Date>" and "<Adults per Room>" and "<Children per Room >"
    And User should select the hotel details
    And User should enter the booknow hotel information "<First Name>" and "<Last Name>" and  "<Billing Address>" and  "<Credit Card No>" and  "<Credit Card Type>" and  "<Expiry month>" and  "<Expiry year>" and  "<CVV Number>"

    Examples: 
      | username   | password        | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | yasodha123 | yasoprathap@123 | Sydney   | Hotel Creek | Double    | 2-Two           | 20-02-2024    | 27-02-2024     | 2-Two           | 2-Two             | yasodha    | sampath   | chennai         | 1234567890123450 | VISA             | JUNE         |        2025 |        123 |
