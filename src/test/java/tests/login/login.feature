Feature: Login Functionality

  Scenario Outline: Validate login scenarios
    Given user is on home page on url "<url>"
    When click on signup button
    And enter his username "<username>" and his password "<password>"
    And click sign up
    And click okay on alert box
    And click on login button
    And enter username "<username>" and password "<password>"
    And click login
    Then user should be logged in

    Examples:
    |username | password |url                                   |
    |hendy6    |2023      |https://www.demoblaze.com/            |