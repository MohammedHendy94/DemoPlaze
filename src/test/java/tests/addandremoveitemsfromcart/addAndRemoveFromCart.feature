Feature: add and remove from cart

  Scenario Outline: validate adding and removing products
    Given user is on home page on url "<url>"
    When click on login button
    And enter username "<username>" and password "<password>"
    And click login
    And click on phones category
    And open product
    And add product to cart
    And open cart
    Then delete product from cart


    Examples:
      |username | password |url                                   |
      |hendy5    |2023      |https://www.demoblaze.com/            |