Feature: Home

  Scenario Outline: Open the courses page
    Given login page is opened
    When  enter valid "<email>" email address in login page
    And   enter valid "<password>" password in login page
    And   click on login button in login page
    And   click on collapse button in side navigation bar
    And   click on course item in side navigation bar
    Then  courses page should be opened
    Examples:
      | email        | password |
      | EmailAddress | Password |
