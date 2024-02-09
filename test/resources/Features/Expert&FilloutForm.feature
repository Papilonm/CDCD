Feature: Talk to Expert & Fill out Form

  @expert
  Scenario Outline: User clicks on Talk to Expert option and Fills out form
    Given User navigates to website
    And User clicks the Talk to an Expert button
    Then User fills out form with "<firstName>" and "<lastName>" and "<email>" and "<company>" information from outline
    And User clicks send & success message is visible
    Examples:
      | firstName | lastName| email          | company |
      |Test       |Test     |jg@mcim24x7.com  |ASOS|



