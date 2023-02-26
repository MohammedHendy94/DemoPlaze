Feature: check Categories

  Scenario Outline: Verify categories items
    Given user is on home page on url "<url>"
    When click on login button
    And enter username "<username>" and password "<password>"
    And click login
    And click on phones category
    And check for listed items in phones category
    And click on labtops category
    And check for listed items in labtops category
    And click on monitors category
    And check for listed items in monitors category

    Examples:
      |username | password |url                                   |
      |hendy5    |2023      |https://www.demoblaze.com/            |