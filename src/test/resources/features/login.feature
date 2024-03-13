Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Check User can't login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And User quites browser
    Examples:
      | email                | password     |
      | arm1020aleqsan@gm.cm | 1020Aleqsan3 |
      | arm1020aleqsan@gm.cm | 1020aleqsan$ |
      | arm1020aleqsan@gm.cm | 1020ALEQSAN$ |
      | arm1020aleqsan@gm.cm | ccccAleqsan$ |
      | arm1020aleqsan@gm.cm | 12136243244$ |
      | arm1020aleqsan@gm.cm | "$%%%$&%&%/$ |

  @positiveAutoAdd
  Scenario: Check User can add Auto with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User click on OK button
    And User clicks on Let the car work link
    And User enters valid data via car
    And User enters valid data fuel
    And User upload pictures
    And User click button submit
    Then User verifies AddSuccess message displayed
    And User quites browser