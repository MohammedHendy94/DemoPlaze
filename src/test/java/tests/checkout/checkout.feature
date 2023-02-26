Feature: checkout

  Scenario Outline: validate checkout functionality
    Given user is on home page on url "<url>"
    When click on login button
    And enter username "<username>" and password "<password>"
    And click login
    And click on phones category
    And open product
    And add product to cart
    And open cart
    And click place order
    And fill name "<name>" and credircard "<creditcard>"
    And click purchase
    And click okay


    Examples:
      |username | password |url                         |name          |creditcard   |
      |hendy5    |2023      |https://www.demoblaze.com/ |hendy         |123          |